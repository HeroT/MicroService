FROM java:8-jre
MAINTAINER Peihao Tong <252689029@qq.com>

ADD ./target/eureka.jar /opt/nba/
CMD ["java", "-Xmx200m", "-jar", "/opt/nba/eureka.jar"]

EXPOSE 8761