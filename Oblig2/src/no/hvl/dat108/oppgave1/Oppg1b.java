package no.hvl.dat108.oppgave1;

public class Oppg1b {

    public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> summerFunksjon = (x, y) -> x + y;
        int sum = beregn(12, 13,summerFunksjon);
        System.out.println("Sum: " + sum);

        BiFunction<Integer,Integer,Integer> sorstFunksjon = (x, y) -> Math.max(x,y);
        int storste = beregn(-5, 3, sorstFunksjon);
        System.out.println("Største: " + storste);

        BiFunction<Integer, Integer, Integer> avstandFunksjon = (x, y) -> x - y;
        int avstand = beregn(54, 45,avstandFunksjon);
        System.out.println("Differanse: " + Math.abs(avstand));

    }
}

@FunctionalInterface
interface BiFunction<T, U, R> {
    R apply(T t, U u);
}