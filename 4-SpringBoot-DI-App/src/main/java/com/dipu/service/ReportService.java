package com.dipu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipu.dao.IReportDao;
import com.dipu.dao.ReportDao;

@Service
public class ReportService {


	private IReportDao reportDao;
	
	/*
	 * public ReportService() {
	 * System.out.println("ReportService.ReportService() :: 0-Param Constructor"); }
	 */
	//@Autowired
	public ReportService(IReportDao reportDao) {
		System.out.println("ReportService.ReportService(ReportDao reportDao) :: Param Constructor");
		this.reportDao = reportDao;
	}
	
	// via Setter method
	/*
	 * @Autowired public void setReportDao(ReportDao reportDao) {
	 * System.out.println("ReportService.setReportDao() method called ");
	 * this.reportDao = reportDao; }
	 */
	public void printName(Integer userId) {
		String nameById = reportDao.getNameById(userId);
		
		System.out.println("ReportService.printName()" + nameById);
	}
}
