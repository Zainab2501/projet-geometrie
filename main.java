package application;

import geometrie.base.Point;
import geometrie.base.Ligne;
import geometrie.formes.*;
import geometrie.outils.Dessin;
import geometrie.outils.Statistiques;

public class Main {
    public static void main(String[] args) {

        // Test Ligne
        Ligne l = new Ligne(new Point(0, 0), new Point(6, 8));
        l.afficher();

        // Test Dessin
        Dessin d = new Dessin();
        d.ajouter(new Rectangle(new Point(0, 0), 3, 4));
        d.ajouter(new Cercle(new Point(0, 0), 5));
        d.ajouter(new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3)));
        d.ajouter(new TriangleEquilateral(new Point(0, 0), 6));
        d.afficher();
        System.out.println("Aire totale : " + d.aireTotale());

        // Test Statistiques
        Rectangle[] tab = {
            new Rectangle(new Point(0,0), 3, 4),
            new Carre(new Point(0,0), 5),
            new Rectangle(new Point(0,0), 2, 9)
        };
        System.out.println("Aire max : " + Statistiques.aireMaximale(tab).aire());
    }
}
