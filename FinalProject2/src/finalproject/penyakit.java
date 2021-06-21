package finalproject;
import java.util.Scanner;
//class penyakit yang menerapkan materi inheritance (pewarisan)
public class penyakit {            
    int id, usia;
    String nama, alamat;
    
    //constructor yang dipakai pada kelas pewarisan
    public penyakit (int id, String nama, int usia, String alamat){
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }
}
//materi inheritance
class pengobatan extends penyakit {
    
    public pengobatan (int id, String nama, int usia, String alamat){
        super (id, nama, usia, alamat);
    }
    //buat return statement untuk dipanggil kembali ke main class
    public String getData(){
        return "-------------------------------------------------------------------------------------------------------------------\n"
                + "-------------------------------------------------------------------------------------------------------------------\n"
                + "DATA PENGOBATAN PASIEN \n\nID : "+id+"\nNama : "+nama+"\nusia : "+usia+
                "\nAlamat : "+alamat;
    }
    public void diagnosa(){
        System.out.println("\n>>Gejala, obat, dan tindakan yang mungkin diambil: ");
    }
}
class tipes extends pengobatan {
    public tipes(int id, String nama, int usia, String alamat){
        super (id, nama, usia, alamat);
    }
    @Override
    public void diagnosa (){
        System.out.println(">>Gejala : pusing, sembelit, diare, muntah, lemas, serta demam tinggi\nObat : ciprofloxacin\nTindakan  : Rawat Inap");
    }
}

class diare extends pengobatan {
    public diare(int id, String nama, int usia, String alamat){
        super (id, nama, usia, alamat);
    }
    @Override
    public void diagnosa (){
        System.out.println(">>Gejala : sembelit, muntah, lemas, serta dehidrasi\nObat : subsalicylate (pepto-bismol)\nTindakan  : Rawat jalan");
    }
}

class CacarAir extends pengobatan {
    public CacarAir(int id, String nama, int usia, String alamat){
        super (id, nama, usia, alamat);
    }
    @Override
    public void diagnosa (){
        System.out.println(">>Gejala : Demam, Pusing, Lemas, Nyeri tenggorokan, Selera makan menurun, Ruam merah\nObat : antihistamin + lotion calamine\nTindakan  : Rawat jalan");
    }
}

class  hipertensi extends pengobatan {
    public hipertensi(int id, String nama, int usia, String alamat){
        super (id, nama, usia, alamat);
    }
    @Override
    public void diagnosa (){
        System.out.println(">>Gejala : Sakit kepala, Lemas, Nyeri dada, Sesak napas, Aritmia, Adanya darah dalam urine\nObat : candesartan + captopril\nTindakan  : Rawat inap (jika parah)");
    }
}

class  asma extends pengobatan {
    public asma(int id, String nama, int usia, String alamat){
        super (id, nama, usia, alamat);
    }
    @Override
    public void diagnosa (){
        System.out.println(">>Gejala : sulit bernapas, nyeri dada, batuk-batuk, dan mengi\nObat : Kortikosteroid\nTindakan  : Rawat inap (jika parah)");
    }
}
