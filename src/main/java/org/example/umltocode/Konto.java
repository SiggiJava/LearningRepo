package org.example.umltocode;

import java.util.ArrayList;

public class Konto {
    String bezeichnung;
    ArrayList<Kunde> zeichnungsberechtigter;

    public Konto(String bezeichnung, Kunde[] zeichnungsberechtigter) {
        if (zeichnungsberechtigter.length == 0) {
            throw new IllegalArgumentException("Keine Zeichnungsberechtigte uebergeben!");
        }
        this.bezeichnung = bezeichnung;
        this.zeichnungsberechtigter = new ArrayList<>();
        for (Kunde k : zeichnungsberechtigter) {
            this.zeichnungsberechtigter.add(k);
        }
    }

    public GeldBetrag saldo() {
        GeldBetrag geldBetrag = new GeldBetrag();
        return geldBetrag;
    }

    public void einzahlen(GeldBetrag betrag) {

    }
}
