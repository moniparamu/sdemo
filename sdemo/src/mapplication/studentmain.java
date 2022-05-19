package mapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sapplication.student;

public class studentmain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("s.xml");
	student stud=(student)context.getBean("student_name");
	System.out.println(stud.getStudentname());
}
}

