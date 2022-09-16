package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TestDao;
public class Test {//客户端类
	public static void main(String[] args) {
		//初始化Spring容器ApplicationContext，加载配置文件
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过容器获取test实例
		TestDao tt = (TestDao)appCon.getBean("test");
		//TestDao tt = new TestDaoImpl1();
		tt.sayHello();
	}
}
