import entity.InternetStore;

public class Main {
    public static void main(String[] args) {
        InternetStore store = new InternetStore();
        store.addToBasket();
        store.manyCalls(store::addToBasket);
        store.manyCalls(store::restock);
    }
}
