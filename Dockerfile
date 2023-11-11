FROM openjdk:17
RUN apt-get update && apt-get install  -y libssl1.1 libssl-dev libaio1 libunma-dev mysql-server
ENV GRADLE_PARAMS="--info"
ADD .cl/ /commands/
RUN chmod a+x /commands/*-shF