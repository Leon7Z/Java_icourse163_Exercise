/**
念整数（5分）
        题目内容：
        你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。
        如输入1234，则输出：
        yi er san si
        注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出的开头加上“fu”，如-2341输出为：
        fu er san si yi
        输入格式:
        一个整数，范围是[-100000,100000]。
        输出格式：
        表示这个整数的每一位数字的汉语拼音，每一位数字的拼音之间以空格分隔，末尾没有空格。
        输入样例：
        -30
        输出样例：
        fu san ling
 */
import java.util.Scanner;
public class Week42 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Week42.readNum();
    }
    static void printNum (int a) {
        switch (a) {
            case 1:
                System.out.print("yi");
                break;
            case 2:
                System.out.print("er");
                break;
            case 3:
                System.out.print("san");
                break;
            case 4:
                System.out.print("si");
                break;
            case 5:
                System.out.print("wu");
                break;
            case 6:
                System.out.print("liu");
                break;
            case 7:
                System.out.print("qi");
                break;
            case 8:
                System.out.print("ba");
                break;
            case 9:
                System.out.print("jiu");
                break;
            default:
                System.out.print("ling");
                break;
        }
    }
    static void readNum () {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        input.close();
        int count = 0;
        int temp = num;
        if (num < 0) {
            num = - num;
            temp = - temp;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            System.out.print("fu ");
            for (int i = count; i > 1; i--) {
                int b = num / (int)Math.pow(10,(double)(i-1));
                int c = b % 10;
                printNum(c);
                System.out.print(" ");
            }
            printNum(num%10);
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            for (int i = count; i > 1; i--) {
                int b = num / (int)Math.pow(10,(double)(i-1));
                int c = b % 10;
                printNum(c);
                System.out.print(" ");
            }
            printNum(num%10);
        }
    }
}