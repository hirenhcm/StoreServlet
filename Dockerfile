FROM tomcat

RUN apt update && apt install -y maven

COPY ./ /code

WORKDIR /code

RUN mvn install

RUN cp /code/target/SampleGame.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]