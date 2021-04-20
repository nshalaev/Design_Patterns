package patterns.structural.facade.facade;

import patterns.structural.facade.analitics.AnalyticsUtils;
import patterns.structural.facade.analitics.InformationDAO;
import patterns.structural.facade.analitics.Report;
import patterns.structural.facade.analitics.ReportBuilder;

public class AnalyticsFacade {

    public Report createAnalyticsReport() {
        InformationDAO dao = new InformationDAO();
        byte[] information = dao.findInformation();
        byte[] analyzedInformation = AnalyticsUtils.analyze(information);
        ReportBuilder builder = new ReportBuilder();
        return builder.buildReport(analyzedInformation);
    }

}
