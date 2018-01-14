//题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
import java.util.Scanner;
public class Practise4 {
    public static void main(String[] args){
        Scanner inputScore = new Scanner(System.in);
        System.out.println("Please enter the score :");
        int score = inputScore.nextInt();
        char grade;
        grade = (score >= 90) ? 'A' : ((score >= 60) ? 'B' : 'C');
        System.out.println("The grade is : " + grade);
    }
}
