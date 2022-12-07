/*
 * Scarecrow class
 * Assignment 5: Bringing it All Together
 * R. Jordan Crouser + CSC120 (Fall '22))
 * Renee Owusu-Poku
 * Takes the objects from the other classes to form a scarecrow.  
 * 10/21/2022
 */

class Scarecrow {
    /**
     * Takes the parts of the scarecrow from the other classes
     * @param x n/a
     * return n/a
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot feet;
    private Banner sign;
    private String message;
  
    /* 
     * Initializes the remaining parts
     * Calls the .display() method of each part in order
     * @param x (Pumpkin, Shirt, Pants, Boot)
     * @return n/a
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants l, Boot f) {
      head = h;
      body = b;
      legs = l;
      feet = f;
      message = " BOO! ";

    }
  
    /*
     * Displays the Scarecrow
     * Calls the .display() method of each part in order
     * @param x n/a
     * @return n/a
     */

    public void display() {
      head.display();
      body.display();
      legs.display();
      feet.display();
    }
  
    /* Main method (for testing) */
    public static void main(String[] args) {
  
      // Puts the scarecrow together to be displayed
      Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("both"));

      if (args.length > 0) {
        myScarecrow.message = args[0];
      }

      // Puts the banner together to be displayed
      Banner myBanner = new Banner(myScarecrow.message);
      
      //Prints the banner to console
      myBanner.display();
      //Prints the scarecrow to console
      myScarecrow.display();
    }

  }
  