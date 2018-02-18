package Unit1;

public class NumbersAndMath {
    public static void main( String[] args )
    {
        System.out.println( "I will now count my chickens:" );
        // Calculate the numbers of hens and roosters;
        System.out.println( "Hens " + ( 25 + 30 / 6 ) );
        System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );

        System.out.println( "Now I will count the eggs:" );
        // Calculate the number of eggs
        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        // Judge 3+2 is grater or less than 5-7
        // print out true if 3+2 < 5-7
        // print out false if 3+2 <! 5-7
        System.out.println( 3 + 2 < 5 - 7 );

        // print out 3+2
        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
        //print out 5-7
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

        System.out.println( "Oh, that's why it's false." );

        System.out.println( "How about some more." );

        // print out true if 5>-2
        System.out.println( "Is it greater? " + ( 5 > -2 ) );
        // print out true if 5>=-2
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
        // print out true if 5<=-2
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
    }
}
