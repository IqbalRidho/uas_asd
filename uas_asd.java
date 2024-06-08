import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class uas_asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // untuk jumlah gerbong
        int M = scanner.nextInt(); // untuk jumlah aktivitas

        LinkedList<Integer> gerbong = new LinkedList<>();

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
            }
        }

        
    }
}
