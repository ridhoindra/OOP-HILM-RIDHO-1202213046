import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class

    // TODO Create Method to Insert Menu to Database

    // TODO Create Method to Show Menu from Database

    // TODO Create Method to Search Menu from Database

    ArrayList<String> listMenu = new ArrayList<String>();

    public void insertMenu(String menu,String kategori, String price) {
        
        // listMenu.add(menu);
        
    }

    public void showMenu() {
        for (int i =0;i<listMenu.size();i++){
            System.out.println((i+1)+". "+listMenu.get(i));
        }
    }
    
    // public void showMenu() {
    //     System.out.println("1. Menu\n2. Pilih Menu\n3. Keluar");
    //     System.out.println("========================================");
    // }

    public void searchMenu(String pilihan){
        System.out.println("Masukkan Pilihan : "+pilihan);
        if (listMenu.contains(pilihan)) {
            System.out.println("Hasil Pencarian : "+pilihan);
            System.out.println("========================================");
        }
    }
}
