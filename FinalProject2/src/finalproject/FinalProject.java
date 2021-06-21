package finalproject;
import java.util.Scanner;

public class FinalProject {
    static public int proses=0, menu, jumlah=0, size;
    static public Scanner input = new Scanner (System.in);
    
    //dipakai pada kelas pewarisan
    int id, usia;
    String nama, alamat;
    
    //constructor untuk dipanggil pada kelas pewarisan
    public FinalProject (int id, int usia, String nama, String alamat){
        
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
   }

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\tPROGRAM DATA PASIEN RUMAH SAKIT X UNIT PENYAKIT RINGAN HINGGA SEDANG\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
        //panggil kelas admin. menerapkan fungsi komposisi class
        admin admin = new admin ();
        //pada program ini, username dan password harus sesuai dengan yang sudah ditentukan oleh sistem
        if (admin.getId()==190810 && admin.password==12345){
            System.out.println("\t\t\t\t\t\tAKSES DITERIMA");
            //ketika proses==0, maka program akan melakukan looping sampai user meminta untuk berhenti memproses data
            while (proses ==0){
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t   MENU");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("1. Input Data Pasien\n2. Keluar Program");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("Masukkan Pilihan Anda : ");
                menu=input.nextInt();
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                if (menu==1){
                    System.out.println("Masukkan Jumlah Data Pasien : ");
                    size = input.nextInt();
                    //buat array dengan panjang "size" untuk menyimpan data pasien yang akan dimasukkan
                    pasien[] pasiens = new pasien [size];
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    //proses looping untuk memasukkan data sebanyak permintaan user
                    for (int i=0; i<size;i++){
                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Data Pasien ke-"+(i+1)+"");
                        pasiens[i] = new pasien(); 
                    }
                }
                else {
                    proses=1;
                    System.out.println("\t\t\t\t\t\t TERIMAKASIH");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        }
        else {
            System.out.println("AKSES DITOLAK!");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
        }   
    }
}
