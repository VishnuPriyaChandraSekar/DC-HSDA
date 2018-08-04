FROM java:openjdk-latest
RUN apk --no-cache add curl
COPY build/libs/*-all.jar HSDS-App.jar
CMD java ${JAVA_OPTS} -jar HSDS-App.jar