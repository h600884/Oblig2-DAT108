package no.hvl.dat108.oppgave3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Oppg3 {

    public static void main(String[] args) {
        List<Ansatt> liste = Arrays.asList(
                new Ansatt("Per", "Persen", Kjonn.MANN, "Regnskapsfører", 550_000),
                new Ansatt("Knut", "Knutsen", Kjonn.MANN, "Jurist", 650_000),
                new Ansatt("Selma", "Eriksen", Kjonn.DAME, "Gartner", 300_000),
                new Ansatt("Malin", "Hushvoden", Kjonn.DAME, "Daglig leder", 600_000),
                new Ansatt("Henry", "Guttormsen", Kjonn.MANN, "Assisterende leder", 450_000)
                );
        liste.stream().map(ansatt -> ansatt.getEtternavn()).forEach(System.out::println);
    }
}