public class Mainaa {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int    myInt    = 9;
        double myDouble = myInt;  // Automatic casting: int to double

        System.out.println(myInt);     // Outputs 9
        System.out.println(myDouble);  // Outputs 9.0

        double myDouble11 = 9.78d;
        int myInt11 = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble11);  // Outputs 9.78
        System.out.println(myInt11);     // Outputs 9
        
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
        
    
    
    
    
    }
}
