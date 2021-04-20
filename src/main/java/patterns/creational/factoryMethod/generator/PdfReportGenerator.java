package patterns.creational.factoryMethod.generator;

import patterns.creational.factoryMethod.report.PdfReport;
import patterns.creational.factoryMethod.report.Report;

public class PdfReportGenerator extends ReportGenerator {

    //factory method
    @Override
    Report createReport() {
        return new PdfReport();
    }
}
