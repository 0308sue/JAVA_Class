package Wrapper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		Person person = new Person(); 
		Class pClass1 = person.getClass();//object의 getClass() 메소드 사용
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName(" Wrapper.Person");
		System.out.println(pClass3.getName());
		
		
		Class strClass = Class.forName("java.lang.Person");//클래스 이름으로 가져오기
		
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		
		Method[ ] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		Class pClass = Class.forName(" Wrapper.Person");
		Person person5 = (Person)pClass.newInstance();
		System.out.println(person5);
		
		
		
	}
}
