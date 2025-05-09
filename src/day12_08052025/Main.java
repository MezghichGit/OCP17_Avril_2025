package day12_08052025;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream1 = Stream.iterate("-", s -> s + s);
        Stream<String> stream2 = Stream.iterate("-", s -> s + s);
        boolean b1 = stream1.noneMatch(predicate);
        boolean b2 = stream2.anyMatch(predicate); // Erreur ici : le stream est déjà consommé

        System.out.println(b1 + " " + b2);
    }
}
