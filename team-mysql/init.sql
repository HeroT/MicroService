CREATE DATABASE  IF NOT EXISTS `nba` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `nba`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: nba
-- ------------------------------------------------------
-- Server version	5.7.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `team_profile`
--

DROP TABLE IF EXISTS `team_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team_profile` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `image` varchar(90) DEFAULT NULL,
  `eng_name` varchar(45) DEFAULT NULL,
  `full_name` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `home` varchar(45) DEFAULT NULL,
  `intro` varchar(145) DEFAULT NULL,
  `conference` varchar(8) DEFAULT NULL,
  `eng_division` varchar(45) DEFAULT NULL,
  `cn_division` varchar(45) DEFAULT NULL,
  `coach` varchar(45) DEFAULT NULL,
  `found_year` varchar(45) DEFAULT NULL,
  `capacity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_profile`
--

LOCK TABLES `team_profile` WRITE;
/*!40000 ALTER TABLE `team_profile` DISABLE KEYS */;
INSERT INTO `team_profile` VALUES (1,'凯尔特人','http://mat1.gtimg.com/sports/nba/logo/1602/2.png','Celtics','波士顿凯尔特人','Boston','TD 花园','波士顿凯尔特人队是NBA现有30支球队之一，NBA的前身、BAA创始球队之一，1947年进入NBA，凯尔特人和尼克斯是仅有的两支参加了1946年首届BAA联赛且至今没有迁移过城市的NBA球队。','E','Atlantic','大西洋赛区','布拉德-史蒂文斯','1946',18624),(2,'热火','http://mat1.gtimg.com/sports/nba/logo/1602/14.png','Heat','迈阿密热火','Miami','美国航空球馆','迈阿密热火队是NBA现有30支球队之一，1988-89赛季同奥兰多魔术队、明尼苏达森林狼队和夏洛特黄蜂队一起加入NBA的。','E','Southeast','东南赛区','埃里克-斯波尔斯特拉','1988',19600),(4,'尼克斯','http://mat1.gtimg.com/sports/nba/logo/1602/18.png','Knicks','纽约尼克斯','New York','麦迪逊广场花园','纽约尼克斯队是从最初的BAA联盟开始就没有搬迁过城市的两支球队之一(另外一支是波士顿凯尔特人队)。尼克斯在联盟的三个不同时代有过辉煌的表现，每个时代都相差二十年左右。','E','Atlantic','大西洋赛区','杰夫-霍纳塞克','1946',19812),(5,'魔术','http://mat1.gtimg.com/sports/nba/logo/1602/19.png','Magic','奥兰多魔术','Orlando','安利球馆','奥兰多魔术队在1989-1990赛季之前借联盟扩军之机进入NBA，在处子赛季就成为了联盟中进攻火力最强大的队伍之一。','E','Southeast','东南赛区','弗兰克-沃格尔','1989',18846),(6,'76人','http://mat1.gtimg.com/sports/nba/logo/1602/20.png','76ers','费城76人','Philadelphia','富国银行中心','作为联盟历史最悠久的球队之一，费城76人队史上涌现过无数各具特色的一线巨星，其中名人堂成员就有9位之多。','E','Atlantic','大西洋赛区','布雷特-布朗','1949',20478),(7,'奇才','http://mat1.gtimg.com/sports/nba/logo/1602/27.png','Wizards','华盛顿奇才','Washington','威瑞森中心','华盛顿奇才队成立于1961年，东部联盟东南分区的球队，曾经使用过芝加哥包装工人队、华盛顿子弹队等队名。 ','E','Southeast','东南赛区','斯科特-布鲁克斯','1961',20356),(8,'老鹰','http://mat1.gtimg.com/sports/nba/logo/1602/1.png','Hawks','亚特兰大老鹰','Atlanta','菲利普斯球馆','亚特兰大老鹰是NBA现有30支球队之一，1949年NBA成立时从NBL合并而来，拥有10位名人堂球员。','E','Southeast','东南赛区','迈克-布登霍尔泽','1949',18047),(9,'公牛','http://mat1.gtimg.com/sports/nba/logo/1602/4.png','Bulls','芝加哥公牛','Chicago','联合中心','芝加哥公牛队于1966-67赛季加入NBA联盟，历史上有两个成功时段，分别是90年代乔丹率领下的公牛王朝和球队建队之初的连续季后赛之旅。','E','Central','中部赛区','弗雷德-霍伊博格','1966',20917),(10,'骑士','http://mat1.gtimg.com/sports/nba/logo/1602/5.png','Cavaliers','克利夫兰骑士','Cleveland','速贷体育馆','克利夫兰骑士队是NBA现有30支球队之一，1970年进入NBA，骑士队是东部联盟中部赛区的球队。','E','Central','中部赛区','泰伦-卢','1970',20562),(11,'活塞','http://mat1.gtimg.com/sports/nba/logo/new/8.png','Pistons','底特律活塞','Detroit','奥本山宫殿球馆','作为NBA资历最老的球队之一，底特律活塞队在经历了长达41年的漫长奋斗之后才登上NBA总冠军的宝座。','E','Central','中部赛区','斯坦-范甘迪','1948',21231),(12,'步行者','http://mat1.gtimg.com/sports/nba/logo/1602/11.png','Pacers','印第安纳步行者','Indiana','银行家人寿球馆','印第安纳步行者队于1967年组建于印第安纳波利斯，加盟当时的ABA。ABA时期的步行者堪称辉煌，曾经在1969-1973年间四年三夺总冠军。','E','Central','中部赛区','内特-麦克米兰','1976',18165),(13,'雄鹿','http://mat1.gtimg.com/sports/nba/logo/1602/15.png','Bucks','密尔沃基雄鹿','Milwaukee','布拉德利中心','密尔沃基雄鹿队在1968-69赛季第一次进入NBA，在职业体育界历史上，雄鹿从建队到赢得冠军奖杯的速度是最快的。','E','Central','中部赛区','杰森-基德','1968',18717),(14,'鹈鹕','http://mat1.gtimg.com/sports/nba/logo/1602/3.png','Pelicans','新奥尔良鹈鹕','New Pelicans','冰沙王中心','新奥尔良鹈鹕队是NBA现有30支球队之一，1989年进入NBA，鹈鹕队前身为黄蜂队，从2013-14赛季开始正式更名。','W','Southwest','西南赛区','阿尔文-金特里','1987',16867),(15,'猛龙','http://mat1.gtimg.com/sports/nba/logo/1602/28.png','Raptors','多伦多猛龙','Toronto','加拿大航空中心','多伦多猛龙建队于1995年，他和当时的温哥华灰熊一起加入联盟，作为NBA加拿大扩军计划中的重要内容。','E','Atlantic','大西洋赛区','德韦恩-凯西','1995',19800),(16,'小牛','http://mat1.gtimg.com/sports/nba/logo/1602/6.png','Mavericks','达拉斯小牛','Dallas','美国航空中心','达斯小牛队在1980-81赛季加盟了NBA。球队不断取得进步，终于在2011年拿到了梦寐以求的总冠军。','W','Southwest','西南赛区','里克-卡莱尔','1980',21146),(17,'掘金','http://mat1.gtimg.com/sports/nba/logo/1602/7.png','Nuggets','丹佛掘金','Denver','百事中心','丹佛掘金队是NBA现有30支球队之一，1977年进入NBA，掘金队是西部联盟西北赛区的球队。','W','Northwest','西北赛区','迈克尔-马龙','1967',19155),(18,'火箭','http://mat1.gtimg.com/sports/nba/logo/1602/10.png','Rockets','休斯顿火箭','Houston','丰田中心','休斯顿火箭队是一支有着高大中锋传统的球队，从早期的摩西-马龙、拉尔夫-桑普森到哈基姆-奥拉朱旺，以及2002年来自中国的状元秀姚明。','W','Southwest','西南赛区','迈克-德安东尼','1967',18055),(19,'灰熊','http://mat1.gtimg.com/sports/nba/logo/1602/29.png','Grizzlies','孟菲斯灰熊','Memphis','联邦快递球馆','孟菲斯灰熊队是NBA现有30支球队之一，1996年进入NBA，在2010-11赛季季后赛中击败马刺上演黑八传奇。','W','Southwest','西南赛区','大卫-菲兹代尔','1995',18119),(20,'森林狼','http://mat1.gtimg.com/sports/nba/logo/new/16.png','Timberwolves','明尼苏达森林狼','Minnesota','标靶中心','明尼苏达森林狼队是NBA现有30支球队之一，1990年进入NBA，森林狼队是西部联盟西北赛区的球队。','W','Northwest','西北赛区','汤姆-锡伯杜','1989',19356),(21,'马刺','http://mat1.gtimg.com/sports/nba/logo/1602/24.png','Spurs','圣安东尼奥马刺','San Antonio','AT&T 中心','圣安东尼奥马刺是NBA现有30支球队之一，成立于1967年并加入ABA，1976年从ABA合并进入NBA，马刺队是西部联盟西南分区的球队。 ','W','Southwest','西南赛区','格雷格-波波维奇','1976',18500),(22,'爵士','http://mat1.gtimg.com/sports/nba/logo/1602/26.png','Jazz','犹他爵士','Utah','威英特智能家居球馆','犹他爵士队是NBA现有30支球队之一，1975年进入NBA，爵士队是西部联盟西北赛区的球队。','W','Northwest','西北赛区','奎因-斯奈德','1974',19911),(23,'国王','http://mat1.gtimg.com/sports/nba/logo/1602/23.png','Kings','萨克拉门托国王','Sacramento','黄金一号中心','萨克拉门托国王队是NBA现有30支球队之一，1949年进入NBA，国王队是西部联盟太平洋赛区的球队。','W','Pacific','太平洋赛区','戴夫-乔尔格','1951',17500),(24,'湖人','http://mat1.gtimg.com/sports/nba/logo/1602/13.png','Lakers','洛杉矶湖人','Los Angeles','斯台普斯中心','洛杉矶湖人队是NBA现有30支球队之一，1949年进入NBA，湖人队是西部联盟太平洋赛区的球队。','W','Pacific','太平洋赛区','卢克-沃顿','1947',18997),(25,'开拓者','http://mat1.gtimg.com/sports/nba/logo/new/22.png','Blazers','波特兰开拓者','Portland','摩达中心','波特兰开拓者队是NBA现有30支球队之一，1971年进入NBA，开拓者队是西部联盟西北赛区的球队。','W','Northwest','西北赛区','特里-斯托茨','1977',19441),(26,'太阳','http://mat1.gtimg.com/sports/nba/logo/1602/21.png','Suns','菲尼克斯太阳','Phoenix','托金斯迪克度假酒店球馆','菲尼克斯太阳队是NBA现有30支球队之一，1969年进入NBA，太阳队是西部联盟太平洋赛区的球队。','W','Pacific','太平洋赛区','厄尔-沃特森','1968',18055),(27,'雷霆','http://mat1.gtimg.com/sports/nba/logo/1602/25.png','Thunder','俄克拉荷马城雷霆','Oklahoma City','切萨皮克能源球馆','俄克拉荷马城雷霆队是NBA现有30支球队之一，1968年进入NBA，前身是西雅图超音速队，雷霆队是西部联盟西北赛区的球队。','W','Northwest','西北赛区','比利-多诺万','1979',18203),(28,'勇士','http://mat1.gtimg.com/sports/nba/logo/1602/901.png','Warriors','金州勇士','Golden State','甲骨文球馆','金州勇士队是NBA现有30支球队之一，1947年进入NBA，勇士队是西部联盟太平洋赛区的球队。','W','Pacific','太平洋赛区','史蒂夫-科尔','1946',19596),(29,'快船','http://mat1.gtimg.com/sports/nba/logo/1602/1201.png','Clippers','洛杉矶快船','Los Angeles','斯台普斯中心','洛杉矶快船队是NBA现有30支球队之一，属于西部联盟太平洋赛区，1971年进入NBA。','W','Pacific','太平洋赛区','道格-里弗斯','1970',19060),(30,'黄蜂','http://mat1.gtimg.com/sports/nba/logo/1602/30.png','Hornets','夏洛特黄蜂','Charlotte','时代华纳有线球馆','夏洛特黄蜂队是NBA现有30支球队之一，2004年NBA扩军时组建，原名山猫队，于2014夏更名为黄蜂，属于东部联盟东南赛区。','E','Southeast','东南赛区','史蒂夫-克利福德','1988',19077),(182,'篮网','http://mat1.gtimg.com/sports/nba/logo/1602/17.png','Nets','布鲁克林篮网','Brooklyn','巴克莱中心','布鲁克林篮网是NBA现有30支球队之一，1968-1976年曾加入过ABA联盟，1977年进入NBA至今，东部联盟大西洋赛区的球队。','E','Atlantic','大西洋赛区','肯尼-阿特金森','1967',17732);
/*!40000 ALTER TABLE `team_profile` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-27 15:25:47
