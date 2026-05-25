package geometrie.base;

public class Ligne {
    private Point debut;
    private Point fin;

    public Ligne(Point debut, Point fin) {
        this.debut = debut;
        this.fin = fin;
    }

    public double longueur() {
        double dx = fin.getX() - debut.getX();
        double dy = fin.getY() - debut.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point milieu() {
        double mx = (debut.getX() + fin.getX()) / 2;
        double my = (debut.getY() + fin.getY()) / 2;
        return new Point(mx, my);
    }

    public void afficher() {
        System.out.println("Debut : (" + debut.getX() + ", " + debut.getY() + ")");
        System.out.println("Fin : (" + fin.getX() + ", " + fin.getY() + ")");
        System.out.println("Longueur : " + longueur());
    }
}
