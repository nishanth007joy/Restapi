package com.nish.restapi.bo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
public class EmployeeBO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;

	private String employeeName;
}
