package domaine;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Utilisateur
{
    private static int lastId = 0;

    private int id;
    private  String nom, prenom, profil, login, password, confirmPassword;

    public Utilisateur()
    {

    }

    public Utilisateur(String nom, String prenom, String profil, String login, String password, String confirmPassword)
    {
        this.id = ++lastId;
        this.nom = nom;
        this.prenom = prenom;
        this.profil = profil;
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
