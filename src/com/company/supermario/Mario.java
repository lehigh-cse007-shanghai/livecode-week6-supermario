package com.company;

import java.util.Scanner;

public class Mario {
    // TODO: write a Mario who rides a bike, speedup, and speed down.
    // TODO: Mario should not access the speed directly.


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while(!input.equalsIgnoreCase("Q"))
        {
            if(input.equalsIgnoreCase("U")){
                // mario will speed up the bike
            }
            else if(input.equalsIgnoreCase("D")){
                // mario will slow up the bike
            }
            else {
                System.out.println("Unrecognized command.");
            }
            input = scanner.next();
        }
    }
}
