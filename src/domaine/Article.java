package domaine;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Article {
    private static int lastId = 0;
    private int id;
    private   String titre, contenu;
    private Date dateCreation;
    private Categorie categorie;

    public Article() {
    }

    public Article(String titre, String contenu, Date dateCreation, Categorie categorie) {
        this.id = ++lastId;
        this.titre = titre;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
