package patterns.structural.proxy.proxy;

import patterns.structural.proxy.dao.DataDAO;

public class TransactionDataDaoProxy extends DataDAO {

    @Override
    public byte[] findData() {
        startTransaction();
        byte[] data = super.findData();
        stopTransaction();
        return data;
    }

    private void startTransaction() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void stopTransaction() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
