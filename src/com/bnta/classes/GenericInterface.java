package com.bnta.classes;

public interface GenericInterface <X,Y>{

    //StringAndInteger: X = String, Y = Integer

    //IntegerAndString: S = Integer, Y = String

    Y doSomeOperations(X x);
    X doReverseOperations(Y y);

}