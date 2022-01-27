import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num;
        int cnt=0;
        System.out.println("asdasd");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();

        while(num!=0){
            cnt+=1;
            System.out.println(num);

            num/=10;

        }
        System.out.println(cnt+"자리입니다");

    }
}
