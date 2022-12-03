public class MainApp
 {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Apple",8,2.4f);
        perangkat.informasi();
        System.out.println();
        Laptop laptop = new Laptop("Windows",16,3.2f,true);
        laptop.informasi();
        laptop.bukaGame("Overwatch 2");
        laptop.kirimEmail("ridho@ridho.com");
        laptop.kirimEmail("ridho@ridho.com", "indra@indra.com");
        System.out.println();
        Handphone handphone = new Handphone("Android",6,3.5f,false);
        handphone.informasi();
        handphone.telfon(628225742);
        handphone.kirimSMS(628225742);
        handphone.kirimSMS(628225742, 628225743);
    }
}
