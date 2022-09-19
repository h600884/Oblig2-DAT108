package no.hvl.dat108.oppgave3;

public class Ansatt {
    private String fornavn;
    private String etternavn;
    private Kjonn kjonn;
    private String stilling;
    private int lonn;

    public Ansatt(String fornavn, String etternavn, Kjonn kjonn, String stilling, int lonn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
        this.stilling = stilling;
        this.lonn = lonn;
    }


    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public Kjonn getKjonn() {
        return kjonn;
    }

    public void setKjonn(Kjonn kjonn) {
        this.kjonn = kjonn;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public int getLonn() {
        return lonn;
    }

    public void setLonn(int lonn) {
        this.lonn = lonn;
    }

    @Override
    public String toString() {
        return "Ansatt[" +
                "Fornavn='" + fornavn + '\'' +
                ", Etternavn='" + etternavn + '\'' +
                ", Kjonn=" + kjonn +
                ", Stilling='" + stilling + '\'' +
                ", Lønn=" + lonn +
                ']';
    }
}
