package com.herokuapp.seleniumTestingAutomationFramework.basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstClass {
    public static void main(String[] args) {

        //Creating Array
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+ Arrays.toString(array));
        List<String> list=new ArrayList<String>();
        Collections.addAll(list, array);
        System.out.println("Printing List: "+list);

    }
}
