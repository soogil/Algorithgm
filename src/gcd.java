import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int a1, a2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수를 입력해주세요.");
        a1 = scanner.nextInt();
        a2 = scanner.nextInt();

        System.out.println("두 정수의 최대공약수는 " + getGcp(a1, a2) + "입니다.");
    }

    private static int getGcp(int a1, int a2) {
        if (a1 == 0 || a2 ==0){
            return a1 == 0 ? a2 : a1;
        }

        if (a1 < a2) {
            a2 = a2 % a1;
        } else {
            a1 = a1 % a2;
        }

        return getGcp(a1, a2);
    }
}
