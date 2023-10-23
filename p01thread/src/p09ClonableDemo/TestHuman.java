package org.example.thread.p01thread.src.p09ClonableDemo;

public class TestHuman {
    
    public static void main(String[] args) throws Exception {
        
        HumanCloneable human1 = new HumanCloneable();
        human1.d = 'C';
        human1.n = 'T';
        human1.a = 'G';

        System.out.println("----------------------------");

        HumanCloneable humancloned = human1.clone();//dont invoked constructor !!

        System.out.println( "Original Object HashCode: " + human1.hashCode() );
        System.out.println( "Clone Object HashCode: " + humancloned.hashCode() );

        if (human1 != humancloned) System.out.println("Another human (new object)");
        else System.out.println("The same human");
        
        if (human1.d == humancloned.d &&
            human1.n == humancloned.n &&
            human1.a == humancloned.a ) System.out.println("The Same DNA Sequence! (same values)");
        else System.out.println("Different DNA!");

        // Call By Value GoodClass

//        change( human1.clone() ); // The original object will not change
//        System.out.println( human1.d ); // Original Remains C
//
//        change( human1 ); // Original object will change
//        System.out.println( human1.d ); // Original Changes to T

    }
    
    static void change(HumanCloneable s) {
        s.d = 'T';
    }

}

