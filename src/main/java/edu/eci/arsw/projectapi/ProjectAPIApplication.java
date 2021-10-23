package edu.eci.arsw.projectapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.project"})
public class ProjectAPIApplication {

    public static void main(String[] args) {
    	ApplicationContext context = new FileSystemXmlApplicationContext();
        SpringApplication.run(ProjectAPIApplication.class, args);
    }
}