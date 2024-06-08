test
import java.util.*;

public class uas_asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // untuk jumlah gerbong
        int M = scanner.nextInt(); // untuk jumlah aktivitas

        LinkedList<Integer> gerbong = new LinkedList<>();

        LinkedList<String> aktivitas = new LinkedList<>();
        scanner.nextLine();

        for (int i = 0; i < M; i++) {
            aktivitas.add(scanner.nextLine());

            System.out.println(gerbong);
            System.out.println(aktivitas);
        }
    }
}
