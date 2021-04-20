package patterns.structural.proxy;

import org.junit.Assert;
import org.junit.Test;
import patterns.structural.proxy.dao.DataDAO;
import patterns.structural.proxy.proxy.TransactionDataDaoProxy;

public class ProxyTest {

    @Test
    public void testProxy() {
        DataDAO dao = new DataDAO();
        TransactionDataDaoProxy proxy = new TransactionDataDaoProxy();

        long temp = System.currentTimeMillis();
        byte[] data = dao.findData();
        long daoTime = System.currentTimeMillis() - temp;

        temp = System.currentTimeMillis();
        byte[] proxyData = proxy.findData();
        long proxyTime = System.currentTimeMillis() - temp;

        Assert.assertEquals(data, proxyData);
        Assert.assertTrue(proxyTime > daoTime);
    }
}
