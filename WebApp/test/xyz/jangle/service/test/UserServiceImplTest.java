package xyz.jangle.service.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import xyz.jangle.service.UserService;
import xyz.jangle.test.utils.JUnitUtils;

/**
 * @author huhj
 * @email jangle@jangle.xyz
 * @time 2018年6月26日 下午2:52:00
 */
public class UserServiceImplTest extends JUnitUtils{
	@Autowired
	private UserService userService;
	
	@Test
	public void testGetUser() {
		assertEquals("hello",userService.getUser());
	}

}
