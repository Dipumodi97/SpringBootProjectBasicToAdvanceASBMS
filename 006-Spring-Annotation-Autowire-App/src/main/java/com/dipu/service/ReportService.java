package com.dipu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dipu.reports.IReport;

@Service
public class ReportService {

	@Autowired
	@Qualifier("excel")
	private IReport excelReport;
	
	@Autowired
	@Qualifier("pdf")
	private IReport pdfReport;
	
	public void generate() {
		System.out.println("Injected :: "+excelReport.getClass().getName());
		excelReport.generateReport();
	}
	
	public void generatePdf() {
		System.out.println("Injected :: "+pdfReport.getClass().getName());
		pdfReport.generateReport();
	}
}
