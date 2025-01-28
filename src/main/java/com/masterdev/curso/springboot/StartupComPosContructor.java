package com.masterdev.curso.springboot;

import org.springframework.stereotype.Component;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;

//@Component
public class StartupComPosContructor {

    @PostConstruct
    public void init() {
        System.out.println("1) EXECUTANDO MÉTODO INIT - com @PostConstruct");
        Dotenv dotenv = Dotenv.configure().load();
        System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
		System.setProperty("DB_DATABASE", dotenv.get("DB_DATABASE"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("DB_PORT", dotenv.get("DB_PORT"));
        
    }
    
}
