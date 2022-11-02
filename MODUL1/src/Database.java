import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class

    // TODO Create Method to Insert Menu to Database

    // TODO Create Method to Show Menu from Database

    // TODO Create Method to Search Menu from Database

    ArrayList<String> listMenu = new ArrayList<String>();

    public void insertMenu(String menu) {
        listMenu.add(menu);
    }

    // public void showMenu() {
    //     for (int i =0;i<listMenu.size();i++){
    //         System.out.println((i+1)+". "+listMenu.get(i));
    //     }
    // }
    
    public void showMenu() {
        System.out.println("1. Menu\n2. Pilih Menu\n3. Keluar");
        System.out.println("========================================");
    }

    public static void searchMenu(int pilihan){
        System.out.println("Masukkan Pilihan : "+pilihan);
        switch (pilihan) {
            case 1:
                // manggil file menu untuk ngeprint list menu makanan
                break;
            case 2:
                // 
                break;
            default:
                break;
        }
    }
}
