package day19_RecapStringLoops;

public class FirstDuplChar {
    public static void main(String[] args) {
        String str = "abc1^^2ddfghhjklpptt";

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch1 = str.charAt(i); //

            for (int j = 0; j < str.length(); j++) {
            char ch2 = str.charAt(j);
                if (ch1==ch2)
                    count++;
            }
            if (count==2){
                res += ch1;
                break;
            }
        }
        System.out.println(res);
    }
}


