package week05;

public class DynamicSubstring {
    public static void main(String[] args) {
        String searchResult = "result count:12345";
                             //0123456789.........

        String searchResult1 = searchResult.substring(13);
        System.out.println(searchResult1);

        System.out.println(searchResult.substring(13,18));

        System.out.println(searchResult.indexOf(":")); //12
        int colonIndex = searchResult.indexOf(":");

        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));

        String today = " I coded a lot of [c#] today"; // imagine that inside [] is dynamic

        String word = (today.substring(today.indexOf("[")+1,today.indexOf("]")));
        System.out.println("word = " + word);


        String searchResult2 = " username:oscar search result count:12345 ";
        int firstColon = searchResult2.indexOf(":");
        int secondColon = searchResult2.indexOf(":",firstColon+1);

        System.out.println("firstColon = " + firstColon);
        System.out.println("secondColon = " + secondColon);

        System.out.println(searchResult2.substring(secondColon+1));


    }
}
