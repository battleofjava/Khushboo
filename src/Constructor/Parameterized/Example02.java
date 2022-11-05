package Constructor.Parameterized;
class Example02
{
      private int var;
      //default constructor
      public Example02()
      {
             this.var = 10;
      }
      //parameterized constructor
      public Example02(int num)
      {
             this.var = num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Example02 obj = new Example02();
              Example02 obj2 = new Example02(100);
              System.out.println("var is: "+obj.getValue());
              System.out.println("var is: "+obj2.getValue());
      }
}