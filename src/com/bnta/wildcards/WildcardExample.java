package com.bnta.wildcards;

public class WildcardExample <L>{

//    printNames_fathersAndChildrenOnly - accepts only arguments of type: List<Father>, List<Children>
    public void printNames_fathersAndChildrenOnly(L list){
        System.out.println(list);
    }
    public void printNames_allFamily(L list){
        System.out.println(list);
    }
    public void printNames_grampasAndFathersOnly(L list){
        System.out.println(list);
    }


//    printNames_grampasAndFathersOnly  - accepts only arguments of type: List<Father>, List<Grampa>
//    printNames_all  - accepts only arguments of type: List<Father>, List<Grampa>, List<Children>
}
