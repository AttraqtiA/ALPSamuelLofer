
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class KalkulatorDanaPensiun {

    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        String choice;
        System.out.println("Selamat datang di Kalkulator Dana Pensiun\n-------------------------------------------");
        /*System.out.print("Harap masukkan data pribadi anda :\n1. Pria\n2. Wanita\nPilih: "); // Kalau tidak dengan if else untuk per kelaminnya?
        int kelamin = s.nextInt();

        while (true) { // CARA PERTAMA
            if (kelamin == 1 || kelamin == 2) {
                break;
            } else {
                System.out.println("Jenis kelamin tidak dikenal");
                System.out.print("Harap masukkan data pribadi anda :\n1. Pria\n2. Wanita\nPilih: ");
                kelamin = s.nextInt();
            }
        }
        */

        System.out.print("Masukkan usia anda (18 - 70) : ");
        int usia = s.nextInt();
        while (usia < 18 || usia > 70) { // CARA KEDUA
            System.out.println("Usia di luar range 18 - 70");
            System.out.print("Masukkan usia anda (18 - 70) : ");
            usia = s.nextInt();
        }

        System.out.println("Pada usia berapa anda berencana pensiun? (55 - 70) : ");
        int usiapensi = s.nextInt();
        while (usia < 55 || usia > 70) { // CARA KEDUA
            System.out.println("Usia rencana pensiun di luar range 55 - 70");
            System.out.println("Pada usia berapa anda berencana pensiun? (55 - 70) : ");
            usia = s.nextInt();
        }

        while (true) {
            System.out.println("Sampai berapa tahun pendapatan yang Anda butuhkan untuk masa pensiun? Dimulai dari usia " + usiapensi);
            int akhirpensi = s.nextInt();
            System.out.println("Anda memilih untuk merencanakan pensiun selama " + (akhirpensi - usiapensi) + " tahun\nApakah anda yakin? (Y/N)");
            choice = s.nextLine();
            if (choice.equalsIgnoreCase("N")) {

            } else {
                break;
            }
        }
        
        System.out.println("Kehidupan pensiun apa yang anda inginkan?\n ");
        
        
        
        /* sebelum menanyakan tipe lifestyle, sederhana, nyaman, mewah,
        ditanya mau sendiri, pasangan, -> warisan atau tidak*/
    }
    
    
}
