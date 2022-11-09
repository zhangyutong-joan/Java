import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //输入多个数字，求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum=0;
        //计算输入了多少数字
        int m=0;

        while (scanner.hasNextDouble())
        {
            double x=scanner.nextDouble();
            m=m+1;
            sum+=x;
        }
        System.out.println(m+"个数字总和为"+sum);
        System.out.println(m+"个数字平均值为"+sum/m);

        scanner.close();

    }
}
