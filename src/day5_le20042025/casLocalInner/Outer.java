package day5_le20042025.casLocalInner;

public class Outer { // enclosing class
    private int length = 5;

    public void calculate() {
       int width = 20;
       //width = 22; // width n'est plus une variable effectively final

         class Inner { // local inner class
        	public static int x = 10;
        	public static void info() {}
            public void multiply() {
                System.out.println(length * width);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }
}
