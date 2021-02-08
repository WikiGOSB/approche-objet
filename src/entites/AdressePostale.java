package entites;

public class AdressePostale {
    private String numRue;
    private String libRue;
    private String cp;
    private String ville;

    public AdressePostale(String numRue, String libRue, String cp, String ville) {
        this.numRue = numRue;
        this.libRue = libRue;
        this.cp = cp;
        this.ville = ville;
    }

    public String getNumRue() {
        return numRue;
    }

    public void setNumRue(String numRue) {
        this.numRue = numRue;
    }

    public String getLibRue() {
        return libRue;
    }

    public void setLibRue(String libRue) {
        this.libRue = libRue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
