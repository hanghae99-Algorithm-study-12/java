import java.util.Scanner;

public class LeftDay {
    static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
            { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
    };

    // 윤년이면 1, 평년이면 0
    // 4년에 한번 윤년
    static int isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    static int leftDayOfYear(int y, int m, int d) {
        int days = d; // 일수

        for (int i = 1; i < m; i++) // 1월 ~ (m-1)월의 일 수를 더함
            days += mdays[isLeap(y)][i - 1]; //평년인지 윤년인지 확인하고 1 ~ 현재까지 월의 일 수를 모두 더함
        return 365 + isLeap(y) - days; // 평년/윤년인지에 따라서 남은 일수 다르게
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("해당 년도의 남은 일 수");

        do {
            System.out.print("년：");
            int year = stdIn.nextInt(); // 년
            System.out.print("월：");
            int month = stdIn.nextInt(); // 월
            System.out.print("일：");
            int day = stdIn.nextInt(); // 일

            System.out.printf("해당 년도의 남은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));

            System.out.print("한번 더 할까요? (1.예/0.아니오)：");
            retry = stdIn.nextInt();
        } while (retry == 1); // retry가 1이면 계속 do를 반복한다.
    }
}