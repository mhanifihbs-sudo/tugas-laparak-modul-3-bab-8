import java.util.Scanner;

public class MainInteraktif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Data Manusia ===");
        System.out.print("Masukkan Nama Anda : ");
        String inputNama = input.nextLine();

        System.out.print("Masukkan Umur Anda : ");
        int inputUmur = input.nextInt();

        Manusia user = new Manusia(inputNama, inputUmur);

        System.out.println("\n=== Hasil Output ===");
        user.tampilkanNama();
        user.tampilkanUmur();
        user.berjalan();
        user.bersuara();
        
        input.close();
    }
}