package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;

@Configuration
@Import(PetConfigurationClass.class)
public class ConfigurationClass {

	@Bean(name = "hello")
	/* @Scope("prototype") */
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("i love python");
		return hello;
	}

	/*
	 * @Bean(name = "dog") public Dog getDog() { return new Dog(); }
	 * 
	 * @Bean(name = "cat") public Cat getCat() { return new Cat(); }
	 * 
	 * @Bean(name = "pet") public Pet getPet() { Pet pet = new Pet();
	 * pet.setName("bittu"); pet.setAnimal(getDog()); instead of this we
	 * use @Autowired in pet class return pet; }
	 */
}
