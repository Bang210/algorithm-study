import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = scanner.nextInt();
        }
        Arrays.sort(answer);
        for (int ans : answer) {
            System.out.println(ans);
        }
    }
}