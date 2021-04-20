package patterns.structural.facade.analitics;

public class ReportBuilder {

    public Report buildReport(byte[] analyzedInformation) {
        return new Report(analyzedInformation);
    }
}
