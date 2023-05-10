package -------;

import java.util.Random;

public class BuffonNeedle {
    public static void main(String[] args) {
        
        int tries = 10000;
        int hits = 0;
        Random rand = new Random();
        
        for (int i = 0; i < tries; i++) {
            double ylow = rand.nextDouble() * 2;
            double angle = rand.nextDouble() * Math.PI;
            double yhigh = ylow + Math.sin(angle);
            
            if (yhigh >= 2) {
                hits++;
            }
        }
        
        double quotient = (double) tries / hits;
        System.out.println("Quotient tries/hits : " + quotient);
    }
}
