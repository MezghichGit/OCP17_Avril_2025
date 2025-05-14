package day15_14052025;

class Catastrophe extends Exception {
    public Catastrophe(Throwable c) throws RuntimeException {
        super(new Exception());
        c.printStackTrace();
    }
}