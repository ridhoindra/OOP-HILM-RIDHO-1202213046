import java.util.Scanner;

public class Server {
    public String menu = "hai";

    public static void main(String[] args) {
        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database

        // TODO Display Main Menu and User must be Register First

        // TODO Create User from register in Main Menu

        // TODO Display Menu

        User user = new User();
        Database database = new Database();
        database.insertMenu("menu");
        System.out.println("Selamat Datang di restoran EAD");
        System.out.println("Silahkan Register terlebih dahulu");
        System.out.println("========================================");
        System.out.println("nama : "+user.nama);
        System.out.println("nama : "+user.noHp);
        System.out.println("========================================");

    }
}
