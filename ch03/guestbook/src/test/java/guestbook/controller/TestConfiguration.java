package guestbook.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@ImportResource(locations = {"file:src/main/webapp/WEB-INF/guestbook-web.xml"})
@ComponentScan(basePackages = "guestbook.services")
public class TestConfiguration {
 
}