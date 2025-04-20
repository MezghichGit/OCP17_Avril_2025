package day5_le20042025.exo8;

public class Outer {
    private int x = 24;

    public int getX() {
        String message = "x is ";
       
        class Inner {
            private int x = Outer.this.x;
            private int v= 10;
          
            public void printX() {
                System.out.println(message + x);
            }
        }

        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
       int k =  new Outer().getX();
       System.out.println(k);
    }
}