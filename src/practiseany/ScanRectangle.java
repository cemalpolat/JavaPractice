package practiseany;
import java.util.Scanner;
public class ScanRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please give length of rectangle:");
        int length= input.nextInt();

        System.out.print("Please give width of rectangle:");
        int width= input.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area of rectangle =" + area);
        System.out.println("Perimeter of rectangle =" + perimeter);


    }




}
