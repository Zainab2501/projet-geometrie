package geometrie.formes;

import geometrie.base.Point;
import geometrie.interfaces.Comparable2D;

public abstract class Forme implements Comparable2D {
    protected Point ancre;

    public Forme(Point ancre) {
        this.ancre = ancre;
    }

    public abstract double aire();
    public abstract double perimetre();

    public void deplacer(double dx, double dy) {
        ancre.setX(ancre.getX() + dx);
        ancre.setY(ancre.getY() + dy);
    }

    @Override
    public boolean estPlusGrandQue(Forme autre) {
        return this.aire() > autre.aire();
    }
}
