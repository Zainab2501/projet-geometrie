package geometrie.formes;

import geometrie.base.Point;

public class Triangle extends Forme {
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    private double distance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public double aire() {
        double ab = distance(ancre, b);
        double bc = distance(b, c);
        double ca = distance(c, ancre);
        double s = (ab + bc + ca) / 2.0;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    @Override
    public double perimetre() {
        return distance(ancre, b) + distance(b, c) + distance(c, ancre);
    }
}
