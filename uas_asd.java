import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class uas_asd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // untuk jumlah gerbong
        int N = sc.nextInt(); // untuk jumlah aktivitas

        LinkedList<Integer> gerbong = new LinkedList<>(Collections.nCopies(N, 0));

        sc.nextLine();

        LinkedList<Integer> penyimpanan_results = new LinkedList<>(); // Untuk menyimpan hasil output

        for (int i = 0; i < N; i++) {
            int tipe = sc.nextInt();
            if (tipe == 1) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt();
                if (y > 100) {
                    System.out.println("Jumlah Orang Melebihi Kapasitas!");
                    break;
                }
                gerbong.set(x, gerbong.get(x) + y);
            } else if (tipe == 2) {
                int A = sc.nextInt() - 1;
                int B = sc.nextInt() - 1;
                int C = sc.nextInt() - 1;
                int D = sc.nextInt() - 1;


                if (A > B || C > D){
                    System.out.println("Aktivitas 2 tidak memenuhi aturan karena A > B dan C > D");
                }
                Set<Integer> orangBerbeda = new HashSet<>();
                // interval [A, B]
                for (int j = A; j <= B; j++) {
                    orangBerbeda.add(j);
                }

                // interval [C, D]
                for (int j = C; j <= D; j++) {
                    orangBerbeda.add(j);
                }

                // menghitung jumlah total orang berbeda
                int totalOrang = 0;
                for (int gerbongIndex : orangBerbeda) {
                    totalOrang += gerbong.get(gerbongIndex);
                }
                penyimpanan_results.add(totalOrang); // Simpan hasil totalOrang
            }
        }

        // mencetak semua hasil setelah loop utama selesai
        for (Integer result : penyimpanan_results) {
            System.out.println(result);
        }
    }
}
