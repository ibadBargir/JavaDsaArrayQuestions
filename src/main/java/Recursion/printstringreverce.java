package Recursion;

public class printstringreverce {

    public static void printreverce(String str , int indx){

        if (indx==0){
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printreverce(str, indx-1);

    }
    public static void main(String[] args) {

        String str = "abcd";
        printreverce(str , str.length()-1);

    }
}
