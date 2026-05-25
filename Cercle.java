package geometrie.formes;

import geometrie.base.Point;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(Point ancre, double rayon) {
        super(ancre);
        this.rayon = rayon;
    }

    @Override
    public double aire() { return Math.PI * rayon * rayon; }

    @Override
    public double perimetre() { return 2 * Math.PI * rayon; }
}
