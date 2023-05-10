public class Tayo {

    //method 1
    void method1 (String merek, String warna, String plat, String asal, String tujuan) {

        System.out.println("Merek   \t: " + merek);
        System.out.println("Warna   \t: " + warna);
        System.out.println("Nomor plat \t: " + plat);
        System.out.println("Asal   \t\t: " + asal);
        System.out.println("Tujuan  \t: " + tujuan);
    }
    void method2 (double kecepatan, double waktu) {
        String m = " jam";
        String n = "km/jam";
        String q = "km";
        System.out.println("Kecepatan \t: " + kecepatan + n);
        System.out.println("Waktu  \t\t: " + waktu + m);
        System.out.println("Jarak \t\t: " +kecepatan*waktu +q );
    }

}
