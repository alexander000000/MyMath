package av.shangin;


public class MyMath {


     public static int calc(int c, int d, int ... v) {

        int count =0;

        if (v.length<1) return count;

        for (int i: v) if (i >= c && i <= d) count++;

        return count;

    }



    public static void main(String[] args) {
	// write your code here


        System.out.println("----Тест 1 -----");
        System.out.println ("calc(-4, 20, 11,3,4,5,6, 3,2,5)");
        System.out.println("Результа: "+MyMath.calc(-4,-20, 11,3,4,5,6, 3, 2,5));

        System.out.println("----Тест 2 -----");
        System.out.println ("calc(-4,10, -11,30,4,-5,6, 30,2,5)");
        System.out.println("Результа: "+MyMath.calc(-4,10, -11,30,4,-5,6, 30,2,5));

        System.out.println("----Тест 3 -----");
        System.out.println("mas[] = {19,2,13,40,5}; calc(1,20, mas); ");
        int mas[] = {-19,2,-13,40,5};
        System.out.println("Результа: "+MyMath.calc(0,20, mas));


        System.out.println("----Тест 4 -----");
        System.out.println("calc(1,20);");
        System.out.println("Результа: "+MyMath.calc(0,20));


        System.out.println("----Тест 5 -----");
        System.out.println("calc(0,0, 0,0,....0);");
        System.out.println("Результа: "+MyMath.calc(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));


    }
}
