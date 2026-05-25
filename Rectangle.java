package geometrie.formes;

import geometrie.base.Point;

public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(Point ancre, double largeur, double hauteur) {
        super(ancre);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() { return largeur; }
    public double getHauteur() { return hauteur; }

    @Override
    public double aire() { return largeur * hauteur; }

    @Override
    public double perimetre() { return 2 * (largeur + hauteur); }
}
