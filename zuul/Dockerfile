FROM java:8-jre
MAINTAINER Peihao Tong <252689029@qq.com>

ADD ./target/zuul.jar /opt/nba/
CMD ["java", "-Xmx200m", "-jar", "/opt/nba/zuul.jar"]

EXPOSE 4000