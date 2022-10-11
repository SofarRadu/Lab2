package Store;
import java.util.*;

public class store {
    public static void main(String[] args){
        storeModel model = retrieveStoreInfoFromDatabase();
        storeView view = new storeView();
        storeController controller = new storeController(model, view);
        controller.updateView();
        controller.setStoreName("Profi");
        controller.setStoreOpen(false);
        controller.setStoreId(1243);
        System.out.println("\nAfter updating, Store details are as follows: ");
        controller.updateView();

        ArrayList<storeModel> storeList = new ArrayList<>();
        storeList.add(model);
        storeModel model1 = new storeModel();
        model.setStoreName("Megaaaaa");
        model.setStoreOpen(false);
        model.setStoreid(1452356);
        storeList.add(model1);
        storeModel model2 = new storeModel();
        model.setStoreName("Lidl");
        model.setStoreOpen(true);
        model.setStoreid(1433232356);
        storeList.add(model2);
        System.out.println("\nStores from storelist: ");
        for(storeModel i:storeList){
            view.printStoreDetails(model.getStoreName(),model.isStoreOpen(), model.getStoreid());
            storeList.remove(i);
        }
    }

    private static storeModel retrieveStoreInfoFromDatabase(){
        storeModel model = new storeModel();
        model.setStoreName("Mega");
        model.setStoreOpen(true);
        model.setStoreid(143256);
        return model;
    }
}
