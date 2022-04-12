package day21ArraysUtilityForEachLoop;

public class javaANDpythonNumbers {
    public static void main(String[] args) {

       String sentence = "Java java java python cemal polat nedir yani python java PYTHON";

        String [] arr = sentence.split(" ");

int numJava = 0;
int numPython = 0;

        for (String each : arr) {


                if (each.equalsIgnoreCase("java")){
                    numJava++;
                }
                if (each.equalsIgnoreCase("python")){
                    numPython++;
                }

            }
        System.out.println("numPython = " + numPython);
        System.out.println("numJava = " + numJava);
        }



    }

