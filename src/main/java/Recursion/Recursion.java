package Recursion;

public class Recursion {

    public static void printnumber(int n){

        if (n==6){
            return;
        }

        System.out.println(n);
        printnumber(n+1);


    }

    public static void printnum(int m){

        if (m==0){
            return;
        }
        System.out.println(m);
        printnum(m-1);

    }

    public static void printsum(int i , int n, int sum){

        if (i == n){

            sum +=i;
            System.out.println(sum);

            return;
        }

        sum+=i;
        printsum(i+1, n , sum);
    }

    public static int calpower(int xx , int nn){

       // base case 1
        if (nn==0) {
            return 1;
        }

        //base case 2
        if (xx==0) {
            return 0;
        }

        //kaam
        int xpownm1 = calpower(xx , nn-1);
        int xpown = xx * xpownm1;




        return xpown;
    }

    // print x^n (stack height = logn )

    public static int calpo(int i , int j){

        if (j==0){

            return 1;
        }
        if (i == 0){
            return 0;

        }

        //if j is even
        if (j % 2 == 0){
            return calpo(i , j/2 ) * calpo(i , j/2);
        }else {

            return calpo(i , j/2) * calpo(i, j/2)  * i;
        }

    }
    public static void main(String[] args) {

        int n=1;
        printnumber(n);

        System.out.println("--------------------------------------------------");
        int m=5;
        printnum(m);

        System.out.println("--------------------------------");

        printsum(1, 5, 0);

        int xx =2 ;
        int nn =5;
        int auns = calpower(xx , nn);
        System.out.println(auns +" this is the aunswer");


        int i =2;
        int j= 5;

        int aun = calpo(i , j);
        System.out.println(aun);
    }
}
