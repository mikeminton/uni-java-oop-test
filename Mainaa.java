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

        int sum1 = 100 + 50;     // 150 (100 + 50)
        int sum2 = sum1 + 250;   // 400 (150 + 250)
        int sum3 = sum2 + sum2;  // 800 (400 + 400)
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);        
            
        int x = 5;
        int y = 3;
        System.out.println(x > y);  // returns true, because 5 is higher than 3
        
        // string functions
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        txt = "Hello World";
        System.out.println(txt.toUpperCase());  // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());  // Outputs "hello world"
        
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));  // Outputs 7
        
        String firstName = "John";
        String lastName  = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        txt = "We are the so-called \"Vikings\" from the north.";
        System.err.println(txt);
        txt = "It\'s alright.";
        System.err.println(txt);
        txt = "The character \\ is called backslash.";
        System.err.println(txt);









    }
}
