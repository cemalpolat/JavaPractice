package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExampleFromReplt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter email");
        String email = scan.next();

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        String firstName = email.substring(0, indexOf_);
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);


        String lastName = email.substring(indexOf_+1, indexOfAt);
      //  lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
/* ya da
        lastName = (""+ lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();// charat char verdigi icin
        // stringe eklemek icib=n "" kullanmalisin */
 // ya da :
        lastName= lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();

        System.out.println("lastName = " + lastName);

        String domainName = email.substring(indexOfAt+1, indexOfDot);
        System.out.println("domainName = " + domainName);

    }
}




