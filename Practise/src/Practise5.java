//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
import java.util.Scanner;
public class Practise5 {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        //输入第一个正整数
        System.out.println("Please enter the first positive integer :");
        int numM = inputNum.nextInt();
        //输入第二个正整数
        System.out.println("Please enter the second positive integer :");
        int numN = inputNum.nextInt();
        inputNum.close();
        //比较两个数大小，让numM是大于等于numN的数
        if (numM >= numN) {

        }
        else {
            int temp;
            temp = numN;
            numN = numM;
            numM = temp;
        }
        //如果大数能被小数整除，那大数即为最小公倍数，小数为最大公约数
        if (numM % numN ==0) {
            System.out.println("The greatest common divisor is :" + numM);
            System.out.println("The least common multiple is :" + numN);
        }
        //不能整除的时候，根据最大公约数的算法辗转相除得到最大公约数，两个数字分别除以最大公约数并相乘再乘以最大公约数即为最小公倍数
        else {
            int tempM = numM;
            int tempN = numN;
            while (tempM % tempN != 0) {
                int temp = tempM % tempN;
                tempM = tempN;
                tempN = temp;
            }
            int gcd = tempN;
            int lcm = numM * numN /gcd;
            System.out.println("The greatest common divisor is :" + gcd);
            System.out.println("The least common multiple is :" + lcm);
        }
    }
}
