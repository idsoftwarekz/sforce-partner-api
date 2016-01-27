package kz.idsoftware.sforce.api.partner;

import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.PartnerService;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCreateConnection() {
        PartnerService service = new PartnerService();

        PartnerConnection connection = service.getPartnerConnection();

        Assert.assertNotNull(connection);
    }

}
