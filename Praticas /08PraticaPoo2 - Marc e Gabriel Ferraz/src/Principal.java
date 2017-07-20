import store.Store;
import store.StoreBurgerKing;
import store.StoreMcDonalds;

public class Principal {
    public static void main(String[] args) {

        Store mcStore = new StoreMcDonalds();
        Store bkStore = new StoreBurgerKing();

        System.out.println("MC");
        mcStore.order();

        System.out.println("BK");
        bkStore.order();
    }
}
