FROM java:openjdk-latest
RUN apk --no-cache add curl
COPY build/libs/*-all.jar DC-HSDA.jar
CMD java ${JAVA_OPTS} -jar DC-HSDA.jar