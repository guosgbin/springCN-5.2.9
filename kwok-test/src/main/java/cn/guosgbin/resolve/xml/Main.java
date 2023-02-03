package cn.guosgbin.resolve.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		try {
			BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
			UserService userService = beanFactory.getBean("userService", UserService.class);
			userService.getUserById();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
