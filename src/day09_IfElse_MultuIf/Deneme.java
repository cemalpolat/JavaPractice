package day09_IfElse_MultuIf;

public class Deneme {
    public static void main(String[] args) {

        int n1=10, n2=20, n3=30;

        if(n1>n2 && n2>=n3){
            System.out.println("n1 is bigger");
        }
        if(n2>n1 && n1>=n3){
            System.out.println("n2 is bigger");
        }
        if(n3>n2 && n2>=n1){
            System.out.println("n3 is bigger");
        }
    }

}
