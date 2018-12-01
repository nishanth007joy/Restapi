package com.nish.restapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nish.restapi.bo.EmployeeBO;

@RestController
public class RestControllerForTest {
	@GetMapping(path="/employee",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeBO> getEmpBO(){
		return Arrays.asList(EmployeeBO.builder().id(100l).employeeName("My Name").build());
		
	};

}
