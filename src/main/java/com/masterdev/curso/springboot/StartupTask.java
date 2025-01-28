package com.masterdev.curso.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.github.cdimascio.dotenv.Dotenv;


//@Component
public class StartupTask implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {

        System.out.println("3) EXECUTANDO MÉTODO RUN - com @CommandLineRunner");

        Dotenv dotenv = Dotenv.configure().load();
        System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
		System.setProperty("DB_DATABASE", dotenv.get("DB_DATABASE"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("DB_PORT", dotenv.get("DB_PORT"));

        // System.out.println("VARIAVEIS DE AMBIENTE CARREGADAS EM STARTUPTASK");
        // System.out.println("DB_DATABASE from dotenv: " + dotenv.get("DB_DATABASE"));
        // System.out.println("DB_PORT from dotenv: " + dotenv.get("DB_PORT"));
    }

}
