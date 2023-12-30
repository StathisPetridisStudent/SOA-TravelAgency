package com.example.demo.hello;
import org.springframework.boot.*;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Configuration
public class HelloServiceConfig implements CommandLineRunner {
	
	@Autowired
	private HelloService hs;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User("1", "Nick", "1#2fs345", "Traveller");
		hs.signUp(u1);
		hs.login(u1);
		
		User u2 = new User("2", "George", "6&78svd91", "Traveller");
		hs.signUp(u2);
		hs.login(u2);
		
		User u3 = new User("3", "Hermes", "76s*429", "TravelAgency");
		hs.signUp(u3);
		hs.login(u3);
		
		User u4 = new User("4", "Maria", "67%lnm#639", "Traveller");
		hs.signUp(u4);
		hs.login(u4);
		
		User u5 = new User("5", "Topsis", "%lak*i245", "TravelAgency");
		hs.signUp(u5);
		hs.login(u5);
		
		
		/*Professor p1 = new Professor("Apostolis", "Associate Prof");
		hs.addProfessor(p1);
		Professor p2 = new Professor("Daniel", "Assistant Prof");
		hs.addProfessor(p2);
		Professor p3 = new Professor("Alex", "Prof");
		hs.addProfessor(p3);

		Course c3 = new Course("OOP", 3);
		c3.setProfessor(p3);
		Course c4 = new Course("SE", 4);
		c4.setProfessor(p3);
		Course c1 = new Course("SQA", 5);
		c1.setProfessor(p1);
		Course c2 = new Course("Mobile", 6);
		c2.setProfessor(p1);
		Course c5 = new Course("Patterns", 7);
		c5.setProfessor(p2);
		
		Student s1 = new Student("Nikos",28,"Thessaloniki");
		s1.addCourse(c2);
		s1.addCourse(c3);
		hs.addStudent(s1);

		Student s2 = new Student("Elvira",35,"Thessaloniki");
		s2.addCourse(c1);
		s2.addCourse(c4);
		hs.addStudent(s2);

		Student s3 = new Student("Sofia",36,"Groningen");
		s3.addCourse(c5);
		hs.addStudent(s3);*/
	}

}
