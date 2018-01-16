import java.util.Scanner;

/**
素数和（5分）
        题目内容：
        我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
        现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
        注意，是第n个素数到第m个素数之间的所有的素数，并不是n和m之间的所有的素数。
        输入格式:
        两个整数，第一个表示n，第二个表示m。
        输出格式：
        一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
        输入样例：
        2 4
        输出样例：
        15
 */
public class Week41 {
    public static void main (String args[]) {
        int[] prime = new int[200];
        int k = 1;
        int result = 0;
        prime[0] = 2;
        MAIN_LOOP:
        for (int i = 3; k < prime.length; i += 2) {
            for (int j = 0; j < k ; j++) {
                if (i % prime[j] == 0) {
                    continue MAIN_LOOP;
                }
            }
            prime[k++] = i;
        }
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();
        m = input.nextInt();
        input.close();
        for (; n <= m; n++) {
            result += prime[n-1];
        }
        System.out.println(result);
    }
}