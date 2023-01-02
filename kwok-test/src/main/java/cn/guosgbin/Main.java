package cn.guosgbin;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-test.xml");
			UserService userService = (UserService) context.getBean("userService");
			User user = userService.getUserById(1);
			System.out.println(user);
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
