
package com.joysistvi.activities;

public class Activity2_Panes {
    public static void main(String[] args) {
         int number = 20;
        System.out.println("Let's say the number is "+number);
        boolean isEven = !(number % 2 != 0);

        System.out.println(isEven);
        
        number += (number % 2 != 0) ? 1 : 0;
        
        System.out.println(number);
        
    }
}
