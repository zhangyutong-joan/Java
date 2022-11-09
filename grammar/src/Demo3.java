public class Demo3 {
    public static void main(String[] args) {
        //递归复习：阶乘
        System.out.println(f(5));
    }
    public static int f(int n)
    {
        if(n==1)
        {
            //1!=1，边界条件
            return 1;
        }
        else
        {
            return n*f(n-1);
        }
    }
}
