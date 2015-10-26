package cn.wangbaocai.client.dubbo.action;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wangbaocai.server.dubbo.service.DemoServer;

public class ChatAction {
   
    public void SayHello(){ 
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
	context.start();
	DemoServer demoServer = (DemoServer) context.getBean("demoService");
	System.out.println("client:"+demoServer.sayHello("wangbaocai.cn"+"1:"+new Date())+"3:"+new Date());
    }

}
