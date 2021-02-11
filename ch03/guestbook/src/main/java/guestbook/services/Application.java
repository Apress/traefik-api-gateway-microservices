package guestbook.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context  = new AnnotationConfigApplicationContext("guestbook");
     //   GuestbookService guestbookService = context.getBean(GuestbookService.class,"aaaaa");
       // System.out.println(guestbookService.getName());
    }
}
