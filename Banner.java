/*
 * Banner class 
 * Assignment 5: Bringing it All Together
 * R. Jordan Crouser + CSC120 (Fall '22))
 * Renee Owusu-Poku
 * This class creates the banner object
 * 10/21/2022
 */

public class Banner {
    /**
     * Creates the class for the banner 
     * @param x n/a
     * @return n/a
     */

    /* Message to print on Banner */
    private String message;
  
    /* Constructor */
    public Banner(String m) {
      this.message = m;
    }
  

    public void display() {
    /**
     * Creates the format for the banner, prints it and the message
     * @param x n/a
     * @return n/a
     */

      //Row 1
      System.out.println();   
      System.out.print("     *******");
      for (int i = 0; i < this.message.length(); i++)
      {
        System.out.print("*");
      }
      System.out.println();

      //Row 2
      System.out.print( " *** ~~~");
      for (int i = 0; i < this.message.length(); i++)
      {
        System.out.print("~");
      }
      System.out.print("~~~ ***");
      System.out.println();

      //Row 3
      System.out.print("*** ~   " + this.message + "   ~ ***"); 
      System.out.println();

      //Row 5
      System.out.print( " *** ~~~");
      for (int i = 0; i < this.message.length(); i++)
      {
        System.out.print("~");
      }
      System.out.print("~~~ ***");
      System.out.println();

      //Row 6
      System.out.print("     *******");
      for (int i = 0; i < this.message.length(); i++)
      {
        System.out.print("*");
      }
      System.out.println();

    }
      
        /* main method (for testing) */
        public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
        }
  }
  
