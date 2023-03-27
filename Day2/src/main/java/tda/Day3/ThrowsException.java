package tda.Day3;

class ThrowsException {
    public static void main(String args[]) {
      try {
        callMe();
      } catch (IllegalAccessException e) {
        System.out.println(e);
        System.out.println("caught in main.");
      }
    }
    static void callMe() throws IllegalAccessException {
      System.out.println("Inside callMe(). ");
      throw new IllegalAccessException("demo");
    }
   }
   
