package cn.guosgbin.bean_property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 bean 标签的子标签 property
 * 这里就是配置 bean 的属性，需要提供 setter 方法才能配置成功
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("bean_property/services.xml", "bean_property/daos.xml");
		UserServiceImpl userService = applicationContext.getBean("userService", UserServiceImpl.class);
		System.out.println(userService.getUser());
		System.out.println(userService.getUserAccount());
	}
}
