package org.us.matrial;

import java.util.Date;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.us.matrial.form.MainFrame;
import org.us.matrial.user.model.User;
import org.us.matrial.user.service.UserService;

public class App {

    public static void main(String[] args) {
       

        new MainFrame().setVisible(true);

//                new 

//		UserService userService = ctx.getBean("userService", UserService.class);


//		User user = new User();
//		user.setUsername("adilramdan");
//		user.setFirstName("adil");
//		user.setLastName("ramdan");
//		userService.saveOrUpdate(user);
//		
//		user.setUsername("Dimas");
//		user.setFirstName("dimas");
//		user.setLastName("kuncoro");
//		userService.saveOrUpdate(user);
//		
//		User oldUser = userService.findAuditByRevision(user.getId(), 1);
//		System.out.println(oldUser.toString());
//		
//		System.out.println(userService.findById(user.getId()));

    }
}
