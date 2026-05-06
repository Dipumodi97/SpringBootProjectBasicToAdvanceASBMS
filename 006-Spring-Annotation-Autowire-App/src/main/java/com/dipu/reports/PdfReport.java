package com.dipu.reports;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdf")
// @Primary -> if @Primary set for both class again Ambiguity problem then we have to use @Qualifier
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		System.out.println("Pdf Report Generated...");
		
	}
}
