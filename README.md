# email-service
## Building a email-service with Spring Boot, Spring Security

![App Screenshot](screenshot.png)



## Steps to Setup the Spring Boot Back end app

1. **Clone the application**

	```bash
	git clone https://github.com/raushan-kumar802/email-service.git
	cd public-service
	```

2. **Change EmailId and password **

	+ open `src/main/resources/application.properties` file.

	+ change `spring.mail.username` and `spring.mail.password` properties 
3. **Run the app**

	You can run the spring boot app by typing the following command -

	```bash
	mvn spring-boot:run
	```

	The server will start on port 9090.

	You can also package the application in the form of a `jar` file and then run it like so -

	```bash
	mvn package
	java -jar target/email-service-0.0.1-SNAPSHOT.jar
