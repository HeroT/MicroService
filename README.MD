Micro Service(NBA DATABASE)
===============
组员：**童培豪** **51164500117** 朱炜杰 51154500133 陈紫 51164500092

该项目为大规模分布式系统的课程项目，通过spring cloud实现的微服务系统，主要用于呈现2016-17赛季NBA的数据。

首先，在数据方面，我们编写爬取了[虎扑NBA](https://nba.hupu.com/)中的数据，具体包括NBA中的所有球队和队员的基本信息，以及2016-17赛季中进行的每场比赛的具体比赛信息，包括每场比赛对阵双方队伍具体的得分信息，以及球员在比赛中的各项技术统计。
同时根据这些数据，我们可以通过计算动态获得球员的场均数据等等。
在具体项目实现方面，除去用于注册服务的**eureka**和用于网关的**zuul**服务以外，我们还包括三个核心业务service，分别是team-service、player-service以及match-service，这三个service接受大部分前台请求，并通过**feign**实现service之间的互访。

接下来我们将具体描述该项目各个实现细节。

-------
## 目录

- 启动流程
- 文件目录结构
- 接口信息
  - team-service
  - player-service
  - match-service
- 数据库

--------
## 启动流程
1. 确保已经安装java，maven，docker，并已经配置好环境变量。确保80、8761、8080、8081、8082端口未被占用。
2. 进入项目根目录
3. 利用`mvn package`对项目进行构建和打包
4. 使用`docker-compose up --build`启动整个服务
5. 等待服务启动完成，进入[localhost](http://localhost)访问服务。
6. 启动服务约耗时三分钟，如果服务启动未完成，就会自动刷新页面。

--------
## 文件目录结构
在目录下总共有5个project，其中**eureka**文件夹中内容用于启动eureka的sever，在启动时往往需要最先启动。

**zuul**文件夹是整个项目的gateway，其中前台界面代码也存于该文件夹中，它同时负责网络路由，将请求发向各个service去处理。

剩下的三个文件夹，**team-service**文件夹内的项目主要是关于队伍信息处理的。**player-service**文件夹中项目主要是处理球员信息。**match-service**文件夹中项目主要用于处理比赛信息，包括计算球员场均数据等等。

--------
## 接口信息
### team-service
下表为team-service中所有使用的api接口。
Method  | Path  | Description   | Parameter    
------------- | ------------------------- | ------------- |
GET | /teams  | 获得所有的队伍信息    | × 
GET | /teams/name/{name} | 根据队伍名称获得队伍信息 | name 
GET | /teams/id/{id}    | 根据队伍id获得队伍信息  | id
GET | /team | 根据队伍名称获得队伍id | name 

### player-service
下表为player-service里的所有使用的api接口。
Method  | Path  | Description   | Parameter    
------------- | ------------------------- | ------------- |
GET | /players  | 根据传入参数筛选获得所有符合条件球员信息 | playerCondition 
GET | /players/{id} | 根据球员id获得球员信息 | id

### match-service
下表为match-service里的所有使用的api接口。
Method  | Path  | Description   | Parameter    
------------- | ------------------------- | ------------- |
GET | /matches/{id} | 获得指定id的比赛信息 | 比赛id
GET | /matches | 获得所有比赛信息 | x
GET | /matches/team/{id} | 获得指定id的比赛信息| 队伍id
GET | /matches/avg/id/{id} | 获得指定id的球员的场均数据 | 球员id
GET | /matches/player/{id} | 获得指定id的球员获得所有比赛信息 | 球员id
GET | /matches/top/{type} | 获得场均数据前列的球员以及其场均数据 | 需要查询的数据的type，比如得分、抢断等

--------
## 数据库
关于数据库，我们选取了*MySql*、在后台和数据库的连接中，我们使用*MyBatis*连接数据库。

在项目中、我们主要使用四张表，分别是team表、player表、match表以及match_player表。

其中，team表主要存放队伍的基本信息，表中属性为id（球队id）、name（队伍名称）、image（队标url）、eng_name（英语名称）、full_name（全称)、city(所在城市)、home（主场球场）、intro（简单介绍）、conference（分区）、eng_division（英语分区）、cn_division（中文分区）、coach（主教练）、found_year（成立年份）、capacity（球场容量）。

player表中存放球员基本信息，其中属性包括id（球员id）、name（球员姓名）、team_id（所在队伍id）、position（位置）、height（身高）、weight（体重）、birthday（生日）、university（毕业大学）、turn（选秀情况）、nation（国籍）、salary（年薪）、contract（合同）、image（头像url）。

match表主要存放队伍比赛结果信息，其中属性包括id（比赛id）、team1_id（客场球队id）、team2_id（主场球队id）、score1（客场球队得分）、score2（主场球队得分）、date（比赛日期）。

match_player表主要存放球员在各场比赛的数据统计信息，其中属性包括id(条目id)、player_id（球员id）、match_id（比赛id）、team（在主队还是客队）、position（比赛位置）、time（上场时间）、shoot_goal（出手命中）、shoot_num（出手次数）、three_goal（三分命中）、three_num（三分出手）、free_goal（罚球命中）、free_num（罚球次数）、f_rebound（前场篮板）、b_rebound（后场篮板）、rebound（篮板）、assist（助攻）、fault（犯规）、steal（抢断）、foul（失误）、block（封盖）、score（得分）、value（正负值）。

由于该项目是一个micro service的架构，因此各个系统的访问的数据库表也并不相同。其中team-service可以访问team表，player-service可以访问player表，match—service可以访问match表和match_player表。




