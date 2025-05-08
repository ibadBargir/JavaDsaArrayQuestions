package Recursion;

public class Hunoi {

    public static void calhunoi(int n , String surc , String help, String dis){

        if (n==1){
            System.out.println("transfer disk " + n + " from "+ surc +" to "+ dis);
            return;
        }


        calhunoi(n-1 , surc , dis,  help);
        System.out.println("tower of disk "+ n + " from " + surc + " to " + dis);
        calhunoi(n-1 ,help, surc, dis);
    }

    public static void main(String[] args) {
        int n=5;
        calhunoi( n, "SURCE", "HELPER", "DESTINATION");

    }
}
