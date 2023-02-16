package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        int id = ThreadLocalRandom.current().nextInt();
        String message = "Hello World! from App with ID = " + id;

        while(true) {
            System.out.println(message);
            Thread.sleep(3000);
        }
    }
}
