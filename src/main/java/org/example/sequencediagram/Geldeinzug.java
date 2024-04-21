package org.example.sequencediagram;

public class Geldeinzug {
    Display display = null;

    public void geldEin(Geldschein[] geldscheine) {

        for (Geldschein geldschein : geldscheine) {
            pruefeSchein(geldschein,display);
        }

    }

    public void pruefeSchein(Geldschein g, Object Display) {

        /*
        if (g == valide) {
            display.zeigeBetrag();
            Mensakarte.schreibe();

        } else {

            geldRaus(g);

        }
         */
    }

}
