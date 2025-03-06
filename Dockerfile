FROM openjdk:17-jdk-slim AS build

WORKDIR /app

COPY codingQuestions/demo/gradlew codingQuestions/demo/gradlew.bat ./
COPY codingQuestions/demo/gradle gradle
COPY codingQuestions/demo/build.gradle codingQuestions/demo/settings.gradle ./

RUN chmod +x gradlew

RUN ./gradlew dependencies --no-daemon

COPY codingQuestions/demo/src src

RUN ./gradlew bootJar --no-daemon

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
