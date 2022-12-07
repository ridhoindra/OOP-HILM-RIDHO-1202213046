public class MainApp {
    public static void main(String[] args) {
        TransportasiAir transportasi = new TransportasiAir(5,2000);
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();
        System.out.println();

        Sampan sampan = new Sampan(8,5000,2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(5);
        System.out.println();

        Kapal kapal = new Kapal(50,15000,"Dinamo");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(26);
        kapal.berlabuh();
    }
}
