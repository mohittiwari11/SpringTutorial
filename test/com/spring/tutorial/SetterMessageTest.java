package com.spring.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SetterMessageTest {
	
	@Autowired
	private SetterMessage message = null;
	
	@Test
	public void testMessage() {
		assertNotNull("Constructor message instance is null.", message);
		String msg = message.getMessage();
		assertNotNull("Message is null.", msg);
		String expectedMessage = "Spring is fun.";
		assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
	}

}
