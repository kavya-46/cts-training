package com.commandLineArguements;

    public class ArguemetnsDemo {
        public static void main(String abc[]) {
            // Check if the user forgot to provide the 2 arguments
            if (abc.length < 2) {
                System.out.println("Error: Please provide two numbers as arguments.");
                return; // Stops the program safely instead of crashing
            }

            int x = Integer.parseInt(abc[0]);
            int y = Integer.parseInt(abc[1]);
            int z = x + y;
            System.out.println(z);
        }
    }

