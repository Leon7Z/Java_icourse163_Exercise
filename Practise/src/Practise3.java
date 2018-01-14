//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
import java.util.ArrayList;
import java.util.Scanner;
public class Practise3 {
    public static void main(String[] args) {
        System.out.println("Please enter a positive integer :");
        Scanner inputNum = new Scanner(System.in);
        int num = inputNum.nextInt();
        inputNum.close();//输入一个正整数
        int i = 2;
        //判断是否为质数,如果是则输出结果,不进行后面的分解质因数计算
        while (num % i != 0) {
            if (i > Math.sqrt((double)num)) {
                System.out.println(num + " is a prime number");
                break;
            }
            i++;
        }
        if (i > Math.sqrt((double)num)) {} //已判断输入的数字是质数，不进行运行后面的运算
        else {
            //计算可能需要的质因数集合，该集合为小于等于输入合数二分之一的所有质数
            ArrayList primeNum = new ArrayList();
            primeNum.add(2);//定义质因数集合，初始包含2
            for (int tempNum = 3; tempNum <= num / 2; tempNum++) {
                int j = 2;
                while (tempNum % j != 0) {
                    int k = 0;
                    if (j > tempNum / 2) {
                        primeNum.add(tempNum);
                        k++;
                        break;
                    }
                    j++;
                }

            }
/*          分解质因数
            用前面计算得到的质数集合中的第一个质数,去除输入的数字得到一个商,如果没有余数就表示这个质数是它的一个质因数,
            保存到结果数组中.继续用这个质数去除刚才得到的商,直到余数不为0就换下一个质数.
            遍历完集合中所有质数后,结果数组中的值即为分解质因数的结果. */
            int temp = num;
            int a = primeNum.size();
            ArrayList primeFactor = new ArrayList();
            for(int l = 0; l < a;l++) {
                while (temp % (int)primeNum.get(l) == 0) {
                    temp = temp / (int)primeNum.get(l);
                    primeFactor.add(primeNum.get(l));
                }
            }
            //输出分解质因数结果
            System.out.print("The result of the factorization: " + num + "=");
            for(int m =0; m < primeFactor.size(); m++) {
                if (m == 0) {
                    System.out.print(primeFactor.get(m));
                }
                else {
                    System.out.print("*" + primeFactor.get(m));
                }
            }
        }
    }
}