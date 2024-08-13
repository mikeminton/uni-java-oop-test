public class Main {
    public static void main(String[] args) {
        // This is a comment
        System.out.println("Hey Motha Fuckers!");
        System.out.print("I am learning Java.");
        System.out.print(" It might be awesome!");
        System.out.println(); 
        System.out.println(3);
        /* The code below will print the words and numbers
        to the screen, and it is amazing */
        System.out.println(358);
        System.out.println(50000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);  // This is also a comment

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum0;
        myNum0= 17;
        System.out.println(myNum0);

        int myNum1 = 15;
        myNum1 = 20;  // myNum is now 20
        System.out.println(myNum1);
        int     myNum2     = 5;
        float   myFloatNum = 5.99f;
        char    myLetter   = 'D';
        boolean myBool     = true;
        String  myText     = "Hello";
        // compiler error above as the variables are not used

        String firstName = "John ";
        String lastName  = "Doe";
        String fullName  = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

        int xa = 5, ya = 6, za = 50;
        System.out.println(xa + ya + za);

        int xb, yb, zb;
        xb = yb = zb = 50;
        System.out.println(xb + yb + zb);

        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // Create integer variables
        int length = 4;
        int width  = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);


        float myNum11 = 5.75f;
        System.out.println(myNum11);

        double myNum12 = 19.99d;
        System.out.println(myNum12);

        float  f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        //#endregion#


        boolean isJavaFun   = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);    // Outputs true
        System.out.println(isFishTasty);  // Outputs false

        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        System.out.println("Sent arguments to the main method: " + args.length);
        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        }
        

    }
}