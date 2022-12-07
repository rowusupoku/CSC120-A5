/*
 * Pumpkin class 
 * Assignment 5: Bringing it All Together
 * R. Jordan Crouser + CSC120 (Fall '22))
 * Renee Owusu-Poku
 * This class creates the pumpkin object
 * 10/21/2022
 */

public class Pumpkin {

    /*
     * Prints ASCII art depicting a jack-o'-lantern to the console
     * @param x n/a
     * @return n/a
     */
    
    public void display() {

        System.out.println("                 ___");
        System.out.println("              ___)__|_");
        System.out.println("         .-*'          '*-,");
        System.out.println("        /      /|   |\\     \\ ");
        System.out.println("       ;      /_|   |_\\     ;");
        System.out.println("       ;   |\\           /|  ;");
        System.out.println("       ;   | ''--...--'' |  ;");
        System.out.println("        \\  ''---.....--''  /");
        System.out.println("        ''*-.,         ,.-*'  ");  
        System.out.println("              |_______|       ");  

    }
    
    /* main method (for testing) */
    public static void main(String[] args) 
    {
        Pumpkin myPumpkin = new Pumpkin();
        myPumpkin.display();
    }
}
