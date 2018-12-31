package facade.service;

import facade.domain.Product;
import facade.subcomponents.InventoryService;
import facade.subcomponents.PaymentService;
import facade.subcomponents.ShippingService;

public class OrderServiceImpl implements OrderService {

    public boolean placeOrder(int pId){
        boolean orderFulfilled = false;
        Product product = new Product();
        product.productId = pId;

        if(InventoryService.isAvailable(product))
        {
            System.out.println("Product with ID: "+ product.productId + " is available.");
            boolean paymentConfirmed = PaymentService.makePayment();

            if(paymentConfirmed) {

                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;
    }
}
