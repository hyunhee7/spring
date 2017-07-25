package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.mypac.Weapon;

public class MainClass2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("test/main/init.xml");
		Weapon w1=(Weapon)context.getBean("myWeapon");
		Weapon w2=(Weapon)context.getBean("myWeapon");
		
		if(w1==w2){
			System.out.println("w1과 w2는 같아요");
		}else {
			System.out.println("w1과 w2는 달라요");
		}
	}
}
