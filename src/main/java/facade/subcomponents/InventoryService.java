package facade.subcomponents;

import facade.domain.Product;

public class InventoryService {

    public static boolean isAvailable(Product product){
        /*Check Warehouse database for product availability*/
        return true;
    }
}
