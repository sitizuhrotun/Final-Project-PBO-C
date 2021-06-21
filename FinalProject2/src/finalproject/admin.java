package finalproject;
import java.util.Scanner;
//buat class public untuk memproses data admin saat login program
public class admin {
    public int id_admin, password;
    public Scanner input = new Scanner (System.in);
        
    public admin (){
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Masukkan id admin anda: ");
        this.id_admin = input.nextInt();
        System.out.println("Masukkan password: ");
        this.password = input.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }
    //buat return untuk dipanggil dengan mengembalikan nilai
    int getId(){
        return this.id_admin;
    }
    int getPw(){
        return this.password;
    }
}
