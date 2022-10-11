package Store;

public class storeView {
    public void printStoreDetails(String storeName, boolean storeOpen, int storeId){
        System.out.println("\nStore information: ");
        System.out.println("Name of the store: " + storeName);
        System.out.println("Store status: " + storeOpen);
        System.out.println("Store id: " + storeId);
    }
}
