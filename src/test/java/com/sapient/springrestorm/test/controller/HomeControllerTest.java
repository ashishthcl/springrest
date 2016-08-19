package com.sapient.springrestorm.test.controller;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sapient.springrestorm.controller.HomeController;
import com.sapient.springrestorm.services.DataServices;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:mvc-dispatcher-servlet.xml")
public class HomeControllerTest {
    @Mock
    private DataServices dataMockServices;

    @InjectMocks
    private HomeController homeController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
	homeController = new HomeController();
	MockitoAnnotations.initMocks(this);
	mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
    }

    @Test
    public void testReturnMessage() throws Exception {
	final MvcResult mvcResult = mockMvc
		.perform(MockMvcRequestBuilders.get(new URI("/home")))
		.andExpect(MockMvcResultMatchers.view().name("home"))
		.andDo(MockMvcResultHandlers.print()).andReturn();

    }
}
