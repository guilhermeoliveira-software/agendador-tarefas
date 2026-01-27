FROM gradle:8-jdk21 AS BUILD

WORKDIR /app

COPY . .

RUN gradle build --no-daemon

FROM amazoncorretto:21-alpine

WORKDIR /app

COPY --from=BUILD /app/build/libs/*.jar /app/agendador-tarefas.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/agendador-tarefas.jar"]
