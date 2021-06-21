package finalproject;
import java.util.Scanner;

public class pasien {
    public static int id_pasien, usia_pasien,pilih;
    public static String nama_pasien, alamat_pasien;
    static public Scanner inputInt = new Scanner (System.in);
    static public Scanner inputString = new Scanner (System.in);
    
    public pasien (){
        //perintah untuk memasukkan data yang nantinya akan diproses oleh sistem
        System.out.println("\nMasukkan ID Pasien: ");
        id_pasien = inputInt.nextInt();
        System.out.println("Masukkan Nama Pasien: ");
        nama_pasien = inputString.nextLine();
        System.out.println("Masukkan Usia Pasien: ");
        usia_pasien = inputInt.nextInt();
        System.out.println("Masukkan Alamat Pasien: ");
        alamat_pasien = inputString.nextLine(); 
        System.out.println("Diagnosa Pasien : ");
        System.out.println("Daftar Penyakit Tingat Ringan hingga Sedang dengan kodenya :");
        System.out.println("1. Tipes\t\t2. Diare\t\t3. Cacar Air\t\t4. Hipertensi\t\t5. Asma");
        System.out.println("Masukan nomor kode dari penyakit pasien :");
        pilih = inputInt.nextInt();
        //pada proses percabangan, sesuai dengan pilihan yang diambil, maka akan dipanggil data yang sudah tersimpan pada kelas pewarisan dengan parameter yang sesuai
        if (pilih==1){
            tipes tipes = new tipes (id_pasien, nama_pasien, usia_pasien, alamat_pasien);
            System.out.println(""+tipes.getData());
            tipes.diagnosa();
        }
        else if (pilih==2){
            diare diare = new diare (id_pasien, nama_pasien, usia_pasien, alamat_pasien);
            System.out.println(""+diare.getData());
            diare.diagnosa();
        }
        else if (pilih==3){
            CacarAir CacarAir = new CacarAir (id_pasien, nama_pasien, usia_pasien, alamat_pasien);
            System.out.println(""+CacarAir.getData());
            CacarAir.diagnosa();
        }
        else if (pilih==4){
            hipertensi hipertensi = new hipertensi (id_pasien, nama_pasien, usia_pasien, alamat_pasien);
            System.out.println(""+hipertensi.getData());
            hipertensi.diagnosa();
        }
        else if (pilih==5){
            asma asma = new asma (id_pasien, nama_pasien, usia_pasien, alamat_pasien);
            System.out.println(""+asma.getData());
            asma.diagnosa();
        }
        else {
            System.out.println("Penyakit belum terdaftar. Silakan hubungi maintance untuk penambahan variabel penyakit baru!");
        }
    }
}
