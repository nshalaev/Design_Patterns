package patterns.structural.decorator;

import org.junit.Assert;
import org.junit.Test;
import patterns.structural.decorator.connection.BaseConnection;
import patterns.structural.decorator.connection.Connection;
import patterns.structural.decorator.decorator.CompressionConnectionDecorator;
import patterns.structural.decorator.decorator.EncryptionConnectionDecorator;

public class DecoratorTest {

    @Test
    public void testConnectionDecorators() {
        Connection connection = new BaseConnection();
        EncryptionConnectionDecorator encryptionDecorator =
                new EncryptionConnectionDecorator(connection);
        CompressionConnectionDecorator compressionDecorator =
                new CompressionConnectionDecorator(encryptionDecorator);

        compressionDecorator.send(new byte[0]);

        Assert.assertTrue(connection.isSent());
        Assert.assertTrue(encryptionDecorator.isWasEncrypted());
        Assert.assertTrue(compressionDecorator.isCompressed());
    }

}
