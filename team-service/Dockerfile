FROM java:8-jre
MAINTAINER Peihao Tong <252689029@qq.com>

ADD ./target/team-service.jar /opt/nba/
CMD ["java", "-Xmx200m", "-jar", "/opt/nba/team-service.jar"]

EXPOSE 8080