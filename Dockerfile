FROM tomcat

COPY target/SampleGame.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]