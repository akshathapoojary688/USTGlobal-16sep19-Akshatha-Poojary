package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationClass;
import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		Hello hello1 = context.getBean(Hello.class);
		System.out.println(hello);
		System.out.println(hello1);
		
		System.out.println("**************************");
		
		//Animal animal = context.getBean(Animal.class); /* wiring */
		//animal.makeSound();
		
		System.out.println("****************************");
		
		Pet pet = context.getBean(Pet.class); /* wiring */
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
	}

}
