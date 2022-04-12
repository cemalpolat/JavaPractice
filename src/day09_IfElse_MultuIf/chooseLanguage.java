package day09_IfElse_MultuIf;

public class chooseLanguage {
    public static void main(String[] args) {
        int selection = 6;
        String sentence;

        if(selection == 1){
            sentence = "Hello, thank for your call";
        }else if(selection == 2){
            sentence = "Hola, gracias para llamar";
        }else if(selection == 3){
            sentence = "Merhaba, aradiginiz icin tesekkurler";
        }else if(selection == 4){
            sentence = "Privet, spasibo za vash zvonok";
        }else if(selection == 5){
            sentence = "Merci ,pour votre appel";
        }else{
           sentence = "Invalid Entry";
        }

        System.out.println(sentence);


    }




}
