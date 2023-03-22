package com.example.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		System.out.println("El num de usuarios en base de datos es: " + repository.count());

		UserModel luis = new UserModel(null, "Luis", "Florez", 24);
		repository.save(luis);

		System.out.println("El num de usuarios en base de datos es: " + repository.count());

		System.out.println(repository.findAll());

	}

}
