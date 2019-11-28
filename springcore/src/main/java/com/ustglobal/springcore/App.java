package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class App 
{
    public static void main( String[] args )
    {
		/* applncontext is an interface 
		 *  it scans entire xml file and stores all objects in spring container
		 *  if we dont specify any scope then all the created objects will be pointd to same container address
		 *  if scope is prototype then objects will not be stored in the container
		 *  we hv 5 scope that is prototype, singleton,request,session,apln
		 *  last 3 scope used for web apln
		 *  only for the prototype scope spring will not store the objects
		 * */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getMsg());
        
        System.out.println(hello.getMap());
        
        Hello hello2 = context.getBean(Hello.class);
        
		/*
		 * by default scope of spring will always create singlton that is we need to hv only one
		 * object hello nd hello2 hv same object address
		 * if we want to change this then mention scope as prototype in xml file
		 * that tym we will get different object address of each object
		 */
        System.out.println(hello);
        System.out.println(hello2);
        
        Animal animal = context.getBean(Animal.class);
        animal.makeSound();
        
		/* if we want the dog cls implementation then use */
        Animal animal2 = (Animal) context.getBean("dog"); //downcasting to dog
        animal2.makeSound();
        
        System.out.println("*******************************************");
        
        Pet pet = context.getBean(Pet.class);
        System.out.println(pet.getName());
        pet.getAnimal().makeSound();
    }
}

