package patterns.structural.facade;

import org.junit.Assert;
import org.junit.Test;
import patterns.structural.facade.analitics.Report;
import patterns.structural.facade.facade.AnalyticsFacade;

public class FacadeTest {

    @Test
    public void testFacade() {
        AnalyticsFacade facade = new AnalyticsFacade();
        Report report = facade.createAnalyticsReport();

        Assert.assertNotNull(report);
    }
}
