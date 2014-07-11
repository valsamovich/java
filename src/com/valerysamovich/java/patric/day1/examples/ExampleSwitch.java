package com.valerysamovich.java.patric.day1.examples;

public class ExampleSwitch {

    public static void main(String[] args) {
        
        String j = "Two";
        
        switch(j){
        
        case "Zero":
            System.out.println("Value is 0");
            break;
        case "One":
            System.out.println("Value is 1");
            break;
        case "Two":
            System.out.println("Value is 2");
            break;
        case "Three":
            System.out.println("Value is 3");
            break;
        default:
            System.out.println("No value");
            break;
        }
        
        int num = 2;
        switch(num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("No match found!");
        }

    }

}
