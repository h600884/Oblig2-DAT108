package no.hvl.dat108.oppgave2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Oppg2 {

    public static void main(String[] args) {
        List<Ansatt> listeAvAnsatte = Arrays.asList(
                new Ansatt("Per", "Persen", Kjonn.MANN, "Regnskapsfører", 550_000),
                new Ansatt("Knut", "Knutsen", Kjonn.MANN, "Jurist", 650_000),
                new Ansatt("Selma", "Eriksen", Kjonn.DAME, "Gartner", 300_000),
                new Ansatt("Malin", "Hushvoden", Kjonn.DAME, "Daglig leder", 600_000),
                new Ansatt("Henry", "Guttormsen",Kjonn.MANN, "Assisterende leder", 450_000)
        );
        skrivUtAlle(listeAvAnsatte);
        Function<Ansatt,Integer> fastKroneTillegg = ansatt -> ansatt.getLonn() + 100_000;
        lonnsOppgjor(listeAvAnsatte, fastKroneTillegg);
        skrivUtAlle(listeAvAnsatte);

       Function<Ansatt, Integer> fastProsentTillegg = ansatt -> ansatt.getLonn() * 110/100;
       lonnsOppgjor(listeAvAnsatte,fastProsentTillegg);
       skrivUtAlle(listeAvAnsatte);

       Function<Ansatt,Integer> fastKroneTilleggLavLonn = ansatt -> {
           if(ansatt.getLonn() <= 500_000) {
               return ansatt.getLonn() + 50_000;
           }
           return ansatt.getLonn();
       };
       lonnsOppgjor(listeAvAnsatte,fastKroneTilleggLavLonn);
       skrivUtAlle(listeAvAnsatte);

       Function<Ansatt,Integer> fastProsentTilleggForMenn = ansatt -> {
           if(ansatt.getKjonn().equals(Kjonn.MANN)) {
               return ansatt.getLonn() * 120/100;
           }
           return ansatt.getLonn();
       };
       lonnsOppgjor(listeAvAnsatte, fastProsentTilleggForMenn);
       skrivUtAlle(listeAvAnsatte);
    }
    public static void skrivUtAlle(List<Ansatt> ansatte) {
        System.out.println();
        for(Ansatt a : ansatte) {
            System.out.println(a);
        }
    }
    private static void lonnsOppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> o) {
        for(Ansatt a : ansatte) {
            o.apply(a);
            a.setLonn(o.apply(a));
        }
    }
}
