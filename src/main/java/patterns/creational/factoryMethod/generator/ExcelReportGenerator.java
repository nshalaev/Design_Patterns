package patterns.creational.factoryMethod.generator;

import patterns.creational.factoryMethod.report.ExcelReport;
import patterns.creational.factoryMethod.report.Report;

public class ExcelReportGenerator extends ReportGenerator {

    //factory method
    @Override
    Report createReport() {
        return new ExcelReport();
    }
}
