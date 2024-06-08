import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class uas_asd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // untuk jumlah gerbong
        int M = sc.nextInt(); // untuk jumlah aktivitas

        LinkedList<Integer> gerbong = new LinkedList<>();

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            int tipe = sc.nextInt();
            if (tipe == 1) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt();
                gerbong.set(x, gerbong.get(x) + y);
            } else if (tipe == 2) {
                int A = sc.nextInt() - 1;
                int B = sc.nextInt() - 1;
                int C = sc.nextInt() - 1;
                int D = sc.nextInt() - 1;

                Set<Integer> orangBerbeda = new HashSet<>();
                // interval [A, B]
                for (int j = A; j <= B; j++) {
                    orangBerbeda.add(j);
                }

                // interval [C, D]
                for (int j = C; j <= D; j++) {
                    orangBerbeda.add(j);
                }

                int totalOrang = 0;
                for (int gerbongIndex : orangBerbeda) {
                    totalOrang += gerbong.get(gerbongIndex);
                }
                System.out.println(totalOrang);
            }
        }
    }
}
