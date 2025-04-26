package Day6_QCM;

public class Deer {
    enum Food { APPLES, BERRIES, GRASS }

    int age; //attribut d'instance
    protected class Diet {
        private Food getFavorite() {
            return Food.BERRIES;
        }
    }

    public static void main(String[] seasons) {
    	System.out.print(new Deer().age);
        switch (new Deer().new Diet().getFavorite()) {
            case APPLES: System.out.print("a"); break;
            case BERRIES: System.out.print("b"); break;
            default: System.out.print("c");
        }
    }
}
