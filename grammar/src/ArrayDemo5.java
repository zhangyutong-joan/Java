
import java.util.Arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //Arrays类

       int[] a={23,445333,13544,86};
       System.out.println(a);//打印出对象
       //使用Array打印
        System.out.println(Arrays.toString(a));
        //排序
        Arrays.sort(a);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(a));

        //数组填充
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
    }
}
