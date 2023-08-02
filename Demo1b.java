package Demot;

import java.util.ArrayList;

public class Demo1a {
    public static void main(String[] args) {
    }
}

class Esiintyja {
    protected String nimi;
    protected String erikoisala;
    protected double palkkio;
    
    public Esiintyja(String nimi, String erikoisala, double palkkio) {
        this.nimi = nimi;
        this.erikoisala = erikoisala;
        this.palkkio = palkkio;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getErikoisala() {
        return erikoisala;
    }

    public void setErikoisala(String erikoisala) {
        this.erikoisala = erikoisala;
    }

    public double getPalkkio() {
        return palkkio;
    }

    public void setPalkkio(double palkkio) {
        this.palkkio = palkkio;
    }
}


class Asiakas {
    protected String nimi;
    protected String kayttajaTunnus;
    protected String salasana;

    public Asiakas(String nimi, String kayttajaTunnus, String salasana) {
        this.nimi = nimi;
        this.kayttajaTunnus = kayttajaTunnus;
        this.salasana = salasana;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getKayttajaTunnus() {
        return kayttajaTunnus;
    }

    public void setKayttajaTunnus(String kayttajaTunnus) {
        this.kayttajaTunnus = kayttajaTunnus;
    }

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        if (salasana.length() > 10){
            this.salasana = salasana;
        }
    }
}


class Tilaisuus {
    protected String osoite;
    protected String tyyppi;
    protected boolean onEsiintyja;
    
    public Tilaisuus(String osoite, String tyyppi, boolean onEsiintyja) {
        this.osoite = osoite;
        this.tyyppi = tyyppi;
        this.onEsiintyja = onEsiintyja;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public boolean isOnEsiintyja() {
        return onEsiintyja;
    }

    public void setOnEsiintyja(boolean onEsiintyja) {
        this.onEsiintyja = onEsiintyja;
    }
    
}

class Varaus {
    Esiintyja esiintyja;
    Asiakas asiakas;
    Tilaisuus tilaisuus;
    
    public Varaus(Esiintyja esiintyja, Asiakas asiakas, Tilaisuus tilaisuus) {
        this.esiintyja = esiintyja;
        this.asiakas = asiakas;
        this.tilaisuus = tilaisuus;
    }

    public Esiintyja getEsiintyja() {
        return esiintyja;
    }

    public void setEsiintyja(Esiintyja esiintyja) {
        this.esiintyja = esiintyja;
    }

    public Asiakas getAsiakas() {
        return asiakas;
    }

    public void setAsiakas(Asiakas asiakas) {
        this.asiakas = asiakas;
    }

    public Tilaisuus getTilaisuus() {
        return tilaisuus;
    }

    public void setTilaisuus(Tilaisuus tilaisuus) {
        this.tilaisuus = tilaisuus;
    }
    
}

class EsiintyjatTilaisuuksiin {
    ArrayList<Esiintyja> esiintyjat;
    ArrayList<Asiakas> asiakkaat;
    ArrayList<Tilaisuus> tilaisuudet;
    ArrayList<Varaus> varaukset;
}

