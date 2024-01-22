import java.util.ArrayList;

public class PresentStore {
    ArrayList<IGetProductsTo> products;

    public ArrayList<IGetProductsTo> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<IGetProductsTo> products) {
        this.products = products;
    }

    ArrayList<IDeliveryAPI> devApi;

    public PresentStore(ArrayList<IGetProductsTo> products, ArrayList<IDeliveryAPI> devApi) {
        this.products = products;
        this.devApi = devApi;
    }

    public ArrayList<IDeliveryAPI> getDevApi() {
        return devApi;
    }

    public void setDevApi(ArrayList<IDeliveryAPI> devApi) {
        this.devApi = devApi;
    }

    public ArrayList<IGetProductsTo> maxPrice(double price) {
        ArrayList<IGetProductsTo> z = new ArrayList<>();
        for (IGetProductsTo x : products) {
            if (price > x.getPrice()) {
                z.add(x);
            }
        }
        return z;
    }

    public ArrayList<IDeliveryAPI> IdFind(Integer provider) {
        ArrayList<IDeliveryAPI> result = new ArrayList<>();
        for (IDeliveryAPI x : devApi) {
            if (provider.equals(x.getIdOfProvider())) {
                result.add(x);
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        result = prime * result + ((devApi == null) ? 0 : devApi.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PresentStore other = (PresentStore) obj;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        if (devApi == null) {
            if (other.devApi != null)
                return false;
        } else if (!devApi.equals(other.devApi))
            return false;
        return true;
    }

}