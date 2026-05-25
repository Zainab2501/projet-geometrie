package geometrie.formes;

import geometrie.base.Point;

public class Polygone extends Forme {
    private Point[] sommets;

    public Polygone(Point[] sommets) {
        super(sommets[0]);
        this.sommets = sommets;
    }

    private double distance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public double perimetre() {
        double total = 0;
        for (int i = 0; i < sommets.length; i++) {
            total += distance(sommets[i], sommets[(i + 1) % sommets.length]);
        }
        return total;
    }

    @Override
    public double aire() {
        double sum = 0;
        int n = sommets.length;
        for (int i = 0; i < n; i++) {
            Point p1 = sommets[i];
            Point p2 = sommets[(i + 1) % n];
            sum += p1.getX() * p2.getY() - p2.getX() * p1.getY();
        }
        return Math.abs(sum) / 2.0;
    }
}
