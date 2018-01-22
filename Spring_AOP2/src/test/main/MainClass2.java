package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.service.BoardService;

public class MainClass2 {
	public static void main(String[] args) {
		//init.xml 문서 읽어 들이기
	      ApplicationContext context=new ClassPathXmlApplicationContext("test/main/init.xml");
	      
	      BoardService bService=context.getBean(BoardService.class);
	      
	      bService.insert();
	      System.out.println("----------------------");
	      bService.select();
	}
}
