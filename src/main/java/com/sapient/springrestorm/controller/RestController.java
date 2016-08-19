package com.sapient.springrestorm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sapient.springrestorm.model.Employee;
import com.sapient.springrestorm.model.Status;
import com.sapient.springrestorm.services.DataServices;

@SuppressWarnings("javadoc")
@Controller
@RequestMapping("/employee")
public class RestController {

    // @Autowired
    @Resource
    @Qualifier("dataServices")
    DataServices dataServices;

    private static final Logger LOGGER = Logger.getLogger(RestController.class);

    @RequestMapping(value = "/create")
    public @ResponseBody Status addEmployee(@RequestBody final Employee employee) {
	try {
	    dataServices.addEntity(employee);
	    LOGGER.info("Employee Successfully Added");
	    return new Status(1, "Employee Successfully added");
	} catch (final Exception e) {
	    // e.printStackTrace();
	    return new Status(0, "Exception Occured while adding Employee");
	}

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody List getEmployee() {

	List employeeList = null;
	try {
	    employeeList = dataServices.getEntityList();

	} catch (final Exception e) {
	    e.printStackTrace();
	}

	return employeeList;
    }

}
