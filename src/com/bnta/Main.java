package com.bnta;

import com.bnta.class2params.Pair;
import com.bnta.classes.IntegerAndString;
import com.bnta.classes.StringAndInteger;
import com.bnta.simpleclass.Box;
import com.bnta.wildcards.Child;
import com.bnta.wildcards.Father;
import com.bnta.wildcards.Grampa;
import com.bnta.wildcards.WildcardExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start of Exercise 2");

        Box boxWithoutRestrictions = new Box("No restriction");
        System.out.println(boxWithoutRestrictions.getT());
        boxWithoutRestrictions.setT("Test");
        System.out.println(boxWithoutRestrictions.getT());

        Box boxForIntegersOnly = new Box<Integer>(5);
        System.out.println(boxForIntegersOnly.getT());
        boxForIntegersOnly.setT(6);
        System.out.println(boxForIntegersOnly.getT());
        System.out.println("");

        System.out.println("Start of Exercise 3");

        Pair<String, Integer> pair1 = new Pair<>("Five", 10);
        System.out.println(pair1.getK() + ", " + pair1.getV());
        Pair<Integer, String> pair2 = new Pair<>(20, "Ten");
        System.out.println(pair2.getK() + ", " + pair2.getV());
        Pair<String, String> pair3 = new Pair<>("Six", "Two");
        System.out.println(pair3.getK() + ", " + pair3.getV());

        System.out.println("");

        System.out.println("Start of Exercise 4");

        IntegerAndString integerAndString = new IntegerAndString();
        System.out.println(integerAndString.doSomeOperations(5));
        System.out.println(integerAndString.doReverseOperations("-5" + "6"));
        StringAndInteger stringAndInteger = new StringAndInteger();
        System.out.println(stringAndInteger.doSomeOperations("12"));
        System.out.println(stringAndInteger.doReverseOperations(25));

        System.out.println("");

        System.out.println("Start of Exercise 5");
        // 4 lists with different types, 3 are from the same hierarchy
        List<Grampa> grampas = List.of(
                new Grampa("Christopher"),
                new Grampa("Theodore"),
                new Grampa("Rudolph")
        );
        List<Father> fathers = List.of(
                new Father("Max"),
                new Father("Christopher"),
                new Father("Andrew")
        );
        List<Child> children = List.of(
                new Child("Henry"),
                new Child("Owen"),
                new Child("Noah")
        );

        List<String> names = List.of("Max", "Rudolph");
        WildcardExample wildEx = new WildcardExample();
        //we can pass all 3 lists from the same hierarchy
        wildEx.printNames_allFamily(grampas);
        wildEx.printNames_allFamily(fathers);
        wildEx.printNames_allFamily(children);
        //but not e.g a list of Strings (compiler error)
        wildEx.printNames_fathersAndChildrenOnly(fathers);
        wildEx.printNames_fathersAndChildrenOnly(children);

        //compiler error
        //wildEx.printNames_grampasAndFathersOnly(children);
        wildEx.printNames_grampasAndFathersOnly(grampas);
        wildEx.printNames_grampasAndFathersOnly(fathers);









    }
}
