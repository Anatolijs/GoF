import brigde.Message;
import brigde.TextMessage;
import brigde.implement.MessageSender;
import brigde.implement.TextMessageSender;
import builder.UserAccount;
import composite.Catalog;
import composite.ProductCatalog;
import facade.controller.OrderFulfillmentController;
import facade.domain.Product;
import facade.service.OrderServiceImpl;
import state.Package;

public class Main {

    public static void main(String... args) throws Exception {

        UserAccount newAccount = new UserAccount
                .UserAccountBuilder("Olegs Pankovs", "Riga, Ulbrokas 29")
                .withEmail("odo@viss.lv")
                .withPhoneNumber("22738456")
                .build();
        System.out.println("Name: " + newAccount.getName());
        System.out.println("Address: " + newAccount.getAddress());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Phone number: " + newAccount.getPhoneNumber());

        Catalog mJeanProduct = new Product(8,"M: Jeans 32", 65.00);
        Catalog mTShirtProduct = new Product(9,"M: T Shirt 38", 15.00);
        Catalog mainCatalog = new ProductCatalog("Primary Catalog");
        mainCatalog.add(mJeanProduct);
        mainCatalog.add(mTShirtProduct);
        mainCatalog.print();

        OrderFulfillmentController controller = new OrderFulfillmentController();
        controller.order = new OrderServiceImpl();
        controller.orderProduct(8);
        controller.orderProduct(9);

        Package pkg = new Package();
        pkg.printStatus();

        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();
    }
}
