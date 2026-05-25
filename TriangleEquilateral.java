package geometrie.formes;

import geometrie.base.Point;

public class TriangleEquilateral extends Triangle {

    public TriangleEquilateral(Point s, double cote) {
        super(
            s,
            new Point(s.getX() + cote, s.getY()),
            new Point(s.getX() + cote / 2, s.getY() + cote * Math.sqrt(3) / 2)
        );
    }
}
