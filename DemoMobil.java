//5. Instalasi objek dari kelas dan panggil konstruktor dan method.
public class DemoMobil {

    //publis static untuk menjalankan program dan titik awal mengeksekusi progam
    public static void main(String[] args) {

//inisialisasi konstruktor tanpa parameter
        Mobil mobil1 = new Mobil();

//inisiasi konstruktor dengan parameter
        Mobil mobil = new Mobil ("Toyota", "Fortuner", "Hitam",1400,400);

//Method untuk menampilkan info mobil
        mobil.infomobil();

//Method untuk menampilkan kategori SIM
        System.out.println("Kategori SIM \t:" + mobil.kategoriSIM());

//Method untuk menampilkan pajak mobil
        System.out.println("Pajak Mobil \t:" + mobil.pajak()+"Jt");

    }

}
