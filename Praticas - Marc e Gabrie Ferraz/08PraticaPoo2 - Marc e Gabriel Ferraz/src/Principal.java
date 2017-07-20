import store.Store;
import store.StoreBurgerKing;
import store.StoreMcDonalds;
//MARC SUE PIRES MORAES JUNIOR 11411BCC022
//Gabriel Augusto Ferraz Martins 11221bcc036

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
