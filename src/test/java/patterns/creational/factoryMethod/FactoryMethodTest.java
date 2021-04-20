package patterns.creational.factoryMethod;

import org.junit.Assert;
import org.junit.Test;
import patterns.creational.factoryMethod.generator.ExcelReportGenerator;
import patterns.creational.factoryMethod.generator.PdfReportGenerator;
import patterns.creational.factoryMethod.generator.ReportGenerator;
import patterns.creational.factoryMethod.report.ExcelReport;
import patterns.creational.factoryMethod.report.PdfReport;
import patterns.creational.factoryMethod.report.Report;

public class FactoryMethodTest {

    @Test
    public void shouldGenerateExcelReport() {
        ReportGenerator reportGenerator = new ExcelReportGenerator();
        Report report = reportGenerator.generateReport(new byte[1]);

        Assert.assertTrue(report instanceof ExcelReport);
    }

    @Test
    public void shouldGeneratePdfReport() {
        ReportGenerator reportGenerator = new PdfReportGenerator();
        Report report = reportGenerator.generateReport(new byte[1]);

        Assert.assertTrue(report instanceof PdfReport);
    }
}
