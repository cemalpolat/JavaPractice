package day20_Arrays;

public class PrintInitialsClas {
    public static void main(String[] args) {

        String[] sinif = {"Ahmet Kemal", "Mehmet Erten", "Ali Anadol", "Veli Demir", "Cem Tapir", "Can Yaman", "Atahan Kil", "Cemil Sahin", "Kemal Pasa", "Cagatay Koctug"};


        for (int i = 0; i < sinif.length; i++) {
            
            String name = sinif[i];

            String initials = name.charAt(0) + "." + name.charAt(name.lastIndexOf(" ")+1);
            System.out.println(initials);
                
            }

        }
        
        
        
        
        
    }
    
    

