package Store;

public class storeModel {
    private String storeName;
    private boolean storeOpen;
    private int storeId;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public boolean isStoreOpen() {
        return storeOpen;
    }

    public void setStoreOpen(boolean storeOpen) {
        this.storeOpen = storeOpen;
    }

    public int getStoreid() {
        return storeId;
    }

    public void setStoreid(int storeId) {
        this.storeId = storeId;
    }
}