public class recursion {

    public static void main(String[] args) {

        int result = fact(20);
        System.out.println(result);

    }

    public static int fact(int i)
    {

        if (i!=0)
             return i * fact(i-1);

        return 1;
    }
}
