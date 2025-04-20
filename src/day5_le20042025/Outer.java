package day5_le20042025;

public class Outer {
    private String greeting = "Hi";

    protected class Inner { // inner class
    	public static int x = 100; // version 17
    	public static void diplay() {}  // version 17
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        //outer.callInner();
        outer.new Inner().go();
        
        new Outer().new Inner().go();
    }
}
