package domaine;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Categorie {
    private static int lastId = 0;
    private int id;
    private  String libelle;

    public Categorie() {
    }

    public Categorie(String libelle) {
        this.id = ++lastId;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
