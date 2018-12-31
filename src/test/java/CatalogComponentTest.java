import composite.Catalog;
import composite.ProductCatalog;
import facade.domain.Product;
import org.junit.Test;

public class CatalogComponentTest {

    @Test
    public void testPrint() throws Exception {

        /*Create primary products for main catalog*/
        Catalog mJeanProduct = new Product(8,"M: Jeans 32", 65.00);
        Catalog mTShirtProduct = new Product(9,"M: T Shirt 38", 45.00);

        /*Create a composite product catalog and add female products to it*/
        Catalog newCatalog = new ProductCatalog("Female Products");
        Catalog fJeans = new Product(11, "F: Jeans 32", 65.00);
        Catalog fTShirts = new Product(12, "F: T Shirt 38", 45.00);
        newCatalog.add(fJeans);
        newCatalog.add(fTShirts);

        /*Create a composite product catalog and add kid products to it*/
        Catalog kidCatalog = new ProductCatalog("Kids Products");
        Catalog kidShorts = new Product(15,"Return Gift", 23.00);
        Catalog kidPlayGears = new Product(16,"Summer Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);

        /*Create primary catalog and add primary products and new catalogs to it*/
        Catalog mainCatalog = new ProductCatalog("Primary Catalog");
        mainCatalog.add(mJeanProduct);
        mainCatalog.add(mTShirtProduct);
        mainCatalog.add(newCatalog);
        mainCatalog.add(kidCatalog);

        /*Print out product/catalog information*/
        mainCatalog.print();

    }
}

