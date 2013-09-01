import java.util.Scanner;

public class Recaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] seq = new int[500001];
        boolean[] check = new boolean[9 * seq.length];
        seq[0] = 0;
        int aM = 0;
        for(int i = 1; i <= 500000; i++) {
            seq[i] = seq[i - 1] - i;
            if (seq[i] > 0 && !check[seq[i]]) {
                check[seq[i]] = true;
            } else {
                seq[i] = seq[i - 1] + i;
                check[seq[i]] = true;
            }
        }
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == -1) {
                break;
            } else {
                System.out.printf("%d%n", seq[num]);
            }
        }
    }
}
