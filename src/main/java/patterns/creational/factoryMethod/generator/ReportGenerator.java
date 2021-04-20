package patterns.creational.factoryMethod.generator;

import patterns.creational.factoryMethod.report.Report;

public abstract class ReportGenerator {

    public Report generateReport(byte[] data) {
        Report report = createReport();
        report.fill(data);
        return report;
    }

    //factory method
    abstract Report createReport();
}
