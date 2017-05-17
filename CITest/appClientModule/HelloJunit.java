import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloJunit {
   String a = "Hello World";	
   String b = "Hello World";
   String c = "hello world";

   @Test
   public void test_ab() {
      assertEquals(a,b);
   }
   
   @Test
   public void test_ac() {
	  assertEquals(a,c);
   }
	
}
