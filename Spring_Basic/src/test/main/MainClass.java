package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.mypac.Weapon;

public class MainClass {
	public static void main(String[] args) {
		//init.xml 문서를 로딩해서 객체가 생성되고 관리 되도록 한다.
		ApplicationContext context=new ClassPathXmlApplicationContext("test/main/init.xml");
		
		//관리되는 객체중에서 id가 myWeapon 인 객체의 참조값을 
		//Weapon 인터페이스 type으로 받는다.
		Weapon weapon=(Weapon)context.getBean("myWeapon");
		
		//원하는 메소드 호출!
		weapon.attack();
		
		//new WeaponImpl().attack();
	}
}
