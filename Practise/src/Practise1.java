//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args){
        System.out.println("Please enter the number of months:");
        Scanner inputMonth = new Scanner(System.in);
        int monthNow = inputMonth.nextInt();//键盘输入需要计算的月数
        inputMonth.close();
        int sumRabbits = 2;//兔子总数，初始为2
        if (monthNow < 3) {}
        else {
            for(int month = 3; month <= monthNow; month++) {
                sumRabbits += 2 * (month / 3);//每月增长的兔子加上现有兔子即为当月总数
            }
        }
        System.out.println("The sum of rabbits in " + monthNow + " months is " + sumRabbits);
    }
}
