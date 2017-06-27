FROM java:8-jre
MAINTAINER Peihao Tong <252689029@qq.com>

ADD ./target/match-service.jar /opt/nba/
CMD ["java", "-Xmx200m", "-jar", "/opt/nba/match-service.jar"]

EXPOSE 8080