# concert-project

This project contains a simple standalone springboot web application with a single endpoint '/concerts'. 
The project contains an embedded database(derby) and server(tomcat). 
It makes use of Thymeleaf for a template that is used to create the final view in the browser.

Note: The server automatically uses port 8080. If a conflict occurs the port can be chaged it the application.properties file.
The view can be seen at "localhost:8080/concerts".
