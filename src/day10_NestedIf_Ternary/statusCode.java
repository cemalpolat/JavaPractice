package day10_NestedIf_Ternary;

import java.util.Scanner;

public class statusCode {
    public static void main(String[] args) {
    int statCode = 1;

    Scanner input = new Scanner(System.in);

        System.out.println("Enter the status code");
        statCode = input.nextInt();

       String result =  (statCode==200 || statCode==201 || statCode==202 || statCode==301 || statCode==303 ||
        statCode==304 || statCode==307 || statCode==400 || statCode==401 || statCode==403 ||
        statCode==404 || statCode==410 || statCode==500 || statCode==503)? (statCode==200)? "OK" : (statCode==201)?
        "Created" :(statCode==202)? "Accepted" : (statCode==301)? "Moved Permanently" : (statCode==303)? "See Other"
        : (statCode==304)? "Not Modified" : (statCode==307)? "Temporary Redirect" : (statCode==400)? "Bad Request"
        : (statCode==401)? "Unauthorized" : (statCode==403)? "Forbidden" : (statCode==404)? "Not Found" : (statCode==410)?
        "Gone" : (statCode==500)? "Internal Server Error" : "Service Unavailable" : "Invalid code";

        System.out.println(result);

    }
}
