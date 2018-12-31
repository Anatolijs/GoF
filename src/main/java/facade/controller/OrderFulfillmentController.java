package facade.controller;

import facade.service.OrderService;

public class OrderFulfillmentController {

    public OrderService order;
    public boolean orderFulfilled = false;

    public void orderProduct(int productId) {

        orderFulfilled = order.placeOrder(productId);

        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
    }
}
