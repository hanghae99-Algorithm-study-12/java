import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("양의 정수를 입력하면 자릿수를 출력합니다.");

        int n;

        do {
            System.out.println("정수값: ");
            n = scan.nextInt();
        } while (n <= 0); // 양수의 정수값만 받기 위해서 만일 0이나 음수가 들어가면 계속 do 문을 반복한다.

        int no = 0;
        while (n > 0) {
            n = n / 10;
            no++;
        }
        System.out.println("그 수는" + no + "자리입니다.");
    }
}