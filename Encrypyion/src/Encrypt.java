/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nyamw
 */
public class Encrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int key =6;
        // TODO code application logic here
        String text = "nk&sgzk";
        
             System.out.println(text);
        // convert the string to character array to alter each individual character
        
        char[] chars =text.toCharArray();
        for(char c : chars){
            c -=key;
            System.out.print(c);
        }
        
   
    }
    
}
