package day09_IfElse_MultuIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        char character =50;

    if(character >= 97 && character<=122 || character >= 65 && character <= 90){
        System.out.println("Alphabetic Character");
    }else if(character >= 48 && character <= 57){
        System.out.println("Digit");
    }else{
        System.out.println("Special Character");
    }


    }
}
