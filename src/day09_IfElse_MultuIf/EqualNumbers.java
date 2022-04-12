package day09_IfElse_MultuIf;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;

        boolean allEqual = n1==n2 && n2 == n3;
        boolean n1Andn2Equal = n1==n2 && n2!=n3;
        boolean n1Andn3Equal = n1==n3 && n3!=n2;
        boolean n2Andn3Equal = n2==n3 && n3!=n1;
        boolean noneEqual = n1!=n2 && n2!=n3;

        if(allEqual){
            System.out.println("All equal");
        }else if (n1Andn2Equal){
            System.out.println("n1 and n2 are equal");
        }else if(n1Andn3Equal){
            System.out.println("n1 and n3 are equal");
        }else if(n2Andn3Equal){
            System.out.println("n2 and n3 are equal");
        }else{
            System.out.println("None of them are equal");
        }




    }
}
