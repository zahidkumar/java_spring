package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.demo.entity.Student;
import com.demo.repositories.StudentRepository;
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DemoApplication.class)

class DemoApplicationTests {
	@Autowired
	@Qualifier("StudentRepository")
	
 private StudentRepository studentRepo;
 
	@Test
	void saveStudent() {
      Student st=new Student();
      st.setId(1);
      st.setId(2);
      st.setId(3);
      st.setId(3);
      System.out.println(st.getId());
      System.out.println(st.getName());
      System.out.println(st.getCity());
      System.out.println(st.getFee());


}

}
