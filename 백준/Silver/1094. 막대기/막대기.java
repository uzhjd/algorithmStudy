import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int original = 64;
        int count = 1;

        int x = scanner.nextInt();

        while (true) {
            if (original > x - answer) {
                int half = original / 2;
                if (original - half >= x - answer) {
                    original = original - half;
                } else {
                    count++;
                    answer = answer + half;
                    original = half;
                }
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}