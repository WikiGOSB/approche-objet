package Interface;

public class Rectangle implements ObjetGeometrique {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (longueur*2 + largeur*2);
    }

    @Override
    public double surface() {
        return (longueur * largeur);
    }
}
