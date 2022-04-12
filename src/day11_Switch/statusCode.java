package day11_Switch;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class statusCode {
    public static void main(String[] args) {
        int statCode = 1;
        String result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the status code");
        statCode = input.nextInt();


        switch(statCode){

            case(200):result = "OK"; break; case(201):result = "Created"; break; case(202):result = "Accepted"; break; case(301):result = "Moved Permanently";  break;
            case(303):result = "See Other"; break; case(304):result = "Not Modified"; break; case(307):result = "Temporary Redirect"; break; case(400):result = "Bad Request";
                break; case(401):result = "Unauthorized"; break; case(403):result = "403"; break; case(404):result = "Not Found"; break; case(410):result = "Gone";
                break; case(500):result = "Internal Server Error"; break; case(503):result = "Service Unavailable"; break; default: result="Invalid status";


        }

        System.out.println(result);


    }
}
