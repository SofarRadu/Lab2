package Store;

public class storeController {
    private storeModel model;
    private storeView view;

    public storeController(storeModel model, storeView view){
        this.model = model;
        this.view = view;
    }

    public void setStoreName(String name){
        model.setStoreName(name);
    }

    public void setStoreOpen(boolean status){
        model.setStoreOpen(status);
    }

    public void setStoreId(int id){
        model.setStoreid(id);
    }

    public String getStoreName(){
        return model.getStoreName();
    }

    public int getStoreId(){
        return model.getStoreid();
    }

    public boolean getStoreStatus(){
        return model.isStoreOpen();
    }

    public void updateView(){
        view.printStoreDetails(model.getStoreName(), model.isStoreOpen(), model.getStoreid());
    }

}
