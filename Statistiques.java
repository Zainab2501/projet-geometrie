package geometrie.outils;

import geometrie.formes.Rectangle;

public class Statistiques {

    public static Rectangle aireMaximale(Rectangle[] tab) {
        Rectangle max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i].aire() > max.aire()) {
                max = tab[i];
            }
        }
        return max;
    }
}
