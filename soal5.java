import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        
        double totalNilai = 0;
        
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("\nTotal nilai: " + totalNilai);
        System.out.println("Nilai rata-rata: " + rataRata);
        
        input.close();
    }
}
