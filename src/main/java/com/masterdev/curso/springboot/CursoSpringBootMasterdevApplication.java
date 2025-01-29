package com.masterdev.curso.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
// anotacao para o JPA
@EnableJpaAuditing // habilita a auditoria do JPA para preencher automaticamente os campos
					// createdAt e updatedAt
public class CursoSpringBootMasterdevApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "true"); // Enable hot reload

		Runnable loadEnvTask = () -> loadEnvVariables();
		loadEnvTask.run();

		SpringApplication.run(CursoSpringBootMasterdevApplication.class, args);
	}

	public static void loadEnvVariables() {
		Dotenv dotenv = Dotenv.configure().load();
		System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
		System.setProperty("DB_DATABASE", dotenv.get("DB_DATABASE"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("DB_PORT", dotenv.get("DB_PORT"));
	}

}

// System.out.println("----------->>>>>" + dotenv.get("DB_DATABASE"));
// System.out.println("----------->>>>>" + dotenv.get("DB_USERNAME"));
// System.out.println("----------->>>>>" + dotenv.get("DB_PASSWORD"));
// // dotenv.entries().forEach(entry -> System.out.println("Variable: " +
// entry.getKey() + " = " + entry.getValue()));

// File envFile = new File(".env");
// System.out.println("Arquivo .env existe: " + envFile.exists());
// System.out.println("Caminho absoluto: " + envFile.getAbsolutePath());