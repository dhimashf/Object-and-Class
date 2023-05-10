//1. Buat Nama kelas.
public class Mobil {
        //2.Variabel beserta tipe data.
        String Merk;
        String Tipe;
        String Warna;
        int ccmobil;
        int hargamobil;

        //3.1 Konstruktor tanpa parameter
        Mobil (){

        }

        //3.2 konstruktor 2 dengan parameter
        Mobil (String inpMerk,String inpTipe,String inpwarna, int inpccmobil, int inphargamobil){
            Merk = inpMerk;
            Tipe = inpTipe;
            Warna = inpwarna;
            ccmobil = inpccmobil;
            hargamobil = inphargamobil;
        }

        //4.1 Method 1 data mobil
        public void infomobil(){

            System.out.println("\nMerk \t\t :" + Merk);
            System.out.println("Tipe \t\t :" + Tipe);
            System.out.println("Warna \t\t:" + Warna);
            System.out.println("cc Mobil \t:"+ ccmobil);
            System.out.println("Harga Mobil \t:"+ hargamobil );
        }

        //4.2 Method 2 mengkategorikan sim
        String kategoriSIM(){
            if (ccmobil < 1000){
                return "SIM A";
            }else if (ccmobil >1000){
                return "SIM A2";
            }else {
                return "SIM Hasnt Deected";
            }
        }

        //4.2 Method 3 menghitung pajak kendaraan
        double pajak() {
            double pajak = (hargamobil)*(0.02);
            return pajak;
        }
    }

