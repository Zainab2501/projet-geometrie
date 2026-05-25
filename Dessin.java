package geometrie.outils;

import geometrie.formes.Forme;
import java.util.ArrayList;

public class Dessin {
    private ArrayList<Forme> formes;

    public Dessin() {
        formes = new ArrayList<>();
    }

    public void ajouter(Forme f) {
        formes.add(f);
    }

    public double aireTotale() {
        double total = 0;
        for (Forme f : formes) {
            total += f.aire();
        }
        return total;
    }

    public void deplacerTout(double dx, double dy) {
        for (Forme f : formes) {
            f.deplacer(dx, dy);
        }
    }

    public void afficher() {
        for (Forme f : formes) {
            System.out.println(f.getClass().getSimpleName()
                + " | aire = " + f.aire()
                + " | perimetre = " + f.perimetre());
        }
    }
}
