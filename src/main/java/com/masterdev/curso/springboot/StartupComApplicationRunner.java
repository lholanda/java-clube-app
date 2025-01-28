package com.masterdev.curso.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class StartupComApplicationRunner implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception  {

        System.out.println("2) EXECUTANDO MÉTODO RUN - com @ApplicationRunner");

     
    }
}
