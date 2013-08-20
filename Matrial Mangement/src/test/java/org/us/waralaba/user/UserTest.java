package org.us.waralaba.user;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.us.matrial.user.model.User;
import org.us.matrial.user.service.UserService;
import org.us.waralaba.configurasi.ConfigurasiTest;

import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/app-context.xml" })
public class UserTest {
	private Logger log = Logger.getLogger(ConfigurasiTest.class);
	
	@Autowired
	UserService userService;
	
	@Test
	public void crud(){
		User user = new User();
		user.setUsername("adilramdan");
		user.setFirstName("adil");
		user.setLastName("ramdan");
		userService.saveOrUpdate(user);
		
		
		List<User> findAll = Lists.newArrayList(userService.findAll());
		System.out.println(findAll.size()+" 0000000000000000000000000");
		for (User user2 : findAll) {
			System.out.println(user2.toString());
		}
		
////		assertEquals(1, userService.count());
//		
//		user = userService.findById((long) 3);
////		assertEquals("adilramdan",user.getUsername());
//		
//		user.setUsername("adilganteng");
//		userService.saveOrUpdate(user);
//		assertEquals("adilganteng",user.getUsername());
//		
//		userService.delete(user);
//		assertEquals(0, userService.count());
		
		
		
		
		
	}
}
