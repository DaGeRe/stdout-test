package de.stdout;

import org.junit.Test;

public class TestMe {
   
   @Test
   public void test() {
      long start = System.currentTimeMillis();
      for (int i = 0; i < 200; i++) {
         for (int j = 0; j < 10000; j++) {
            long current = System.currentTimeMillis() - start;
            System.out.println("This is a simple logging output: " + i + " " + j + " " + current);
         }
      }
   }
}
