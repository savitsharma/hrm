package com.example.sql;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.transform.ToListResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sql.dao.UserRepository;
import com.example.sql.entity.*;

@SpringBootApplication
public class MysqlprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(MysqlprojectApplication.class, args);
	         
		UserRepository userRepository = context.getBean(UserRepository.class);
	    
//      UserDetai User1=new UserDetai(1,"Amit","sharmasavit@gamil.com",75000,"rajpurra");
		
		/*User1.setName("Amit");
		User1.setEmail("sharmasavit@gamil.com");
	
		User1.setAddress("Sukhrali");
		User1.setContact(58746);		*/
		
//		UserDetai User2 = new UserDetai(2,"Dishant","dishant@gamil.com",555555,"Bijnor");
		
	/*	User2.setName("Dishant");
		User2.setEmail("sharmasavit@gamil.com");
		User2.setAddress("bijnor");
		User2.setContact(123589);-
		userRepository.save(User2);			*/
		
//		UserDetai User3 = new UserDetai(3,"Savit","savitshrama@gmail.com",7665454,"gurgaon");
	
	/*	User3.setName("Savit");
		User3.setEmail("sharmasavit@gamil.com");
		User3.setAddress("gurgaon");
		User3.setContact(90201254);	
		userRepository.save(User3);		*/
		
//		UserDetai User4 = new UserDetai(4,"Abc","sharmadsavig@gamil.com",54555,"New Delhi");
		
	/*	User4.setName("Abc");
		User4.setEmail("sharmasavit@gamil.comt");
		User4.setAddress("New Delhi");
		User4.setContact(90201254);		*/
		
//		UserDetai User5 = new UserDetai(5,"xyz","s@gamil.com",5445555,"Noida");
		
	/*	User5.setName("xyz");
		User5.setEmail("sharmasavit@gamil.com");
		User5.setAddress("Noida");
		User5.setContact(80904525);  */
		
		
		
//		List<UserDetai> User=List.of(User1, User2, User3, User4, User5);
//		userRepository.saveAll(User);
		
		
//	Iterable<UserDetai> itr =userRepository.findAll();
		
//		Iterator<UserDetai> Iterator =itr.iterator();
		
//		    while(Iterator.hasNext()) {
                           // UserDetai userDetai =Iterator.next();
                  //System.out.println(userDetai);
		
//	userRepository.deleteById(5);	
		
//		Iterable<UserDetai> itr=userRepository.findAll();
//		itr.forEach(user ->{System.out.println(user);});
		 
//	Optional<UserDetai> opt=userRepository.findById(1);
//	   UserDetai userDetai =opt.get();
//	        System.out.println(userDetai);
         
//	Stream<UserRepository> itr=Stream.of(userRepository);
//	itr.forEach(user ->{System.out.println(user);});
		
		List<UserDetai> all1=(List<UserDetai>) userRepository.findAll();
		List<UserDetai> collect =all1.stream().filter(userDetai ->userDetai.getId()<=6).collect(Collectors.toList());
	    collect.forEach(t -> System.out.println(t));
	}
	
		 
		  
		
	
	}

