package com.onion.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.testng.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.onion.web.Onionwebba1Application;

@SpringBootTest(classes = Onionwebba1Application.class)
public class homecontrollerTest extends AbstractTestNGSpringContextTests {

	int number;
	@BeforeClass
	public void setup() {
	    number = 12;
	    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@AfterClass
	public void tearDown() {
	    number = 0;
	}
  @Test
  public void helloWorldTest() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
  public void givenNumber_whenEven_thenTrue() {
      assertTrue(number % 2 == 0);
  }
  
  @Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	

	@Test
	public void testEmployee() throws Exception {
		mockMvc.perform(get("/employee")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))
				.andExpect(jsonPath("$.id").value(1)).andExpect(jsonPath("$.salary").value(3000));

	}

  
  
}
