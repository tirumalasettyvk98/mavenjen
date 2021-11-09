package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WarProjectApplicationTests {

	@Test
	void contextLoads() {
		
		assertEquals(2, 2);
	}
	
	
	@Test
	void Test1() {
		
		assertEquals("vamsi","vamsi");
	}
	
	

}
