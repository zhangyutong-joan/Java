public class Demo4 {
    public static void main(String[] args) {
        //数组复习
        int[] nums; //声明一个数组，或 int nums[];
        nums=new int[10]; //创建数组

        //声明+创建
        int[] arrays=new int[10];

        //二维数组
        int[][] aa={{1,2},{3,4},{4,5}};
        /*
        aa[0] 1,2
        aa[1] 3,4
        ...
        * */

        /*for-each循环*/
        int[] a={1,2,3,4,5};
        //使用1：打印数组元素
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        //使用2：计算元素的和
        int sum=0;
        for(int x:a)
        {
            sum+=x;
        }
        System.out.println("sum="+sum);
        //使用3：查找最大元素...略

        /*数组作为方法的参数*/
        System.out.println("打印：");
        output(a);
        int[] b=reverse(a);
        System.out.println("反转：");
        output(b);

    }

    public static void output(int[] array)
    {
        //打印数组元素
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

    public static int[] reverse(int[] array)
    {
        //反转数组
        int[] result=new int[array.length];

        for(int i=0,j=result.length-1;i<array.length;i++,j--)
        {
            result[j]=array[i];
        }
        return result;
    }
}
