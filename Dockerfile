#FROM <BASE_IMAGE>:<TAG>
#COPY <SOURCE_PATH> <DESTINATION_PATH>
#CMD ["<COMMAND>", "<ARGUMENTS>"]
#EXPOSE <PORT_NUMBER>

FROM openjdk:17
COPY ./target/*.jar app.jar
CMD ["java","-jar","app.jar"]
EXPOSE 8080

