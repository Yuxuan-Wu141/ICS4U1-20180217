package Unit1;

public class MoreVariablesAndPrinting {
    public static void main( String[] args )
    {
        // Define the strings
        String myName, myEyes, myTeeth, myHair;
        // Define the integers.
        int myAge, myHeight, myWeight;

        // Set initial value
        myName = "Zed A. Shaw";
        myAge = 35;     // not a lie
        myHeight = 74;  // inches
        myWeight = 180; // lbs
        myEyes = "Blue";
        myTeeth = "White";
        myHair = "Brown";

        // print out the value
        System.out.println( "Let's talk about " + myName + "." );
        System.out.println( "He's " + myHeight + " inches tall." );
        System.out.println( "He's " + myWeight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
        System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
                + " I get " + (myAge + myHeight + myWeight) + "." );
    }
}
