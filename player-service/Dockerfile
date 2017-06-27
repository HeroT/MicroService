FROM java:8-jre
MAINTAINER Peihao Tong <252689029@qq.com>

ADD ./target/player-service.jar /opt/nba/
CMD ["java", "-Xmx200m", "-jar", "/opt/nba/player-service.jar"]

EXPOSE 8080