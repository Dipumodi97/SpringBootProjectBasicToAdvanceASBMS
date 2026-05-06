package com.dipu.dao;

import org.springframework.stereotype.Component;

@Component
public class ReportDao implements IReportDao{

	@Override
	public String getNameById(Integer userId) {
		
		if(userId == 100) {
			return "John";
		}else if(userId == 101) {
			return "Smith";
		}else {
			return "Name not Found";
		}
	}

}
