import facade.controller.OrderFulfillmentController;
import facade.service.OrderServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {

        OrderFulfillmentController controller = new OrderFulfillmentController();
        controller.order = new OrderServiceImpl();
        controller.orderProduct(9);
        boolean result = controller.orderFulfilled;
        assertTrue(result);
    }
}
