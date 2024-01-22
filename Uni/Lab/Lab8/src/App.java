import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<IGetProductsTo> productsList = new ArrayList<>();
        ArrayList<IDeliveryAPI> deliveryAPIList = new ArrayList<>();

        Product1 product1 = new Product1("Type1", 20.0, 1, 50);
        Product1 product2 = new Product1("Type2", 30.0, 2, 30);
        Product1 product3 = new Product1("Type1", 25.0, 1, 40);

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);

        deliveryAPIList.add(product1);
        deliveryAPIList.add(product2);
        deliveryAPIList.add(product3);

        PresentStore presentStore = new PresentStore(productsList, deliveryAPIList);
        try {
            ArrayList<IGetProductsTo> productsByMaxPrice = presentStore.maxPrice(26.0);
            System.out.println("Less than 26: " + productsByMaxPrice);

            ArrayList<IDeliveryAPI> productsByProviderId = presentStore.IdFind(1);
            System.out.println("Provider id 1: " + productsByProviderId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
