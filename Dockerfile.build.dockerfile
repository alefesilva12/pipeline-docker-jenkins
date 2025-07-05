FROM openjdk:17
WORKDIR /app
COPY src /app/src
RUN mkdir bin && javac src/*.java -d bin