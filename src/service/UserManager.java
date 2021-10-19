package service;

import domaine.Categorie;
import domaine.Article;
import domaine.Utilisateur;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.*;

@WebService
public class UserManager
{
    private static final ArrayList<Utilisateur> listUtilisateurs = new ArrayList<>();

    public String ajouter( @WebParam(name = "nom") String nom,
                           @WebParam(name = "prenom") String prenom,
                           @WebParam(name = "profil") String profil,
                           @WebParam(name = "login") String login,
                           @WebParam(name = "password") String password,
                           @WebParam(name = "confirmPassword") String confirmPassword)
    {
        Utilisateur userToAdd = new Utilisateur(nom, prenom, profil, login, password, confirmPassword);
        listUtilisateurs.add(userToAdd);
        return "Ajout effectué avec succes(ID = " + userToAdd.getId() + ")";
    }

    public String modifier(@WebParam(name = "id") int id,
                           @WebParam(name = "nom") String nom,
                           @WebParam(name = "prenom") String prenom,
                           @WebParam(name = "profil") String profil,
                           @WebParam(name = "login") String login,
                           @WebParam(name = "password") String password,
                           @WebParam(name = "confirmPassword") String confirmPassword)

    {
        for (Utilisateur utilisateur : listUtilisateurs )
        {
            if (utilisateur.getId() == id)
            {
                utilisateur.setNom(nom);
                utilisateur.setPrenom(prenom);
                utilisateur.setProfil(profil);
                utilisateur.setLogin(login);
                utilisateur.setPassword(password);
                utilisateur.setConfirmPassword(confirmPassword);

                return "Utilisateur modifie avec succes";
            }
        }
        return "Echec de modification, ID inexistant";
    }

    public String supprimer(@WebParam(name = "id") int id)
    {
        for (Utilisateur utilisateur : listUtilisateurs )
        {
            if (utilisateur.getId() == id)
            {
                listUtilisateurs.remove(utilisateur);

                return "Utilisateur supprime avec succes";
            }
        }
        return "Echec de suppression, ID inexistant";
    }

    public ArrayList<Utilisateur> lister()
    {
        return listUtilisateurs;
    }

    //Categorie

    private static final ArrayList<Categorie> listCategories = new ArrayList<>();

    public String ajouterCategorie( @WebParam(name = "libelle") String libelle)
    {
        Categorie categoryToAdd = new Categorie(libelle);
        listCategories.add(categoryToAdd);
        return "Ajout effectué avec succes(ID = " + categoryToAdd.getId() + ")";
    }

    public String modifierCategorie(@WebParam(name = "id") int id,
                                    @WebParam(name = "libelle") String libelle)

    {
        for (Categorie categorie : listCategories )
        {
            if (categorie.getId() == id)
            {
                categorie.setLibelle(libelle);

                return "Categorie modifie avec succes";
            }
        }
        return "Echec de modification, ID inexistant";
    }

    public String supprimerCategorie(@WebParam(name = "id") int id)
    {
        for (Categorie categorie : listCategories )
        {
            if (categorie.getId() == id)
            {
                listCategories.remove(categorie);

                return "Categorie supprime avec succes";
            }
        }
        return "Echec de suppression, ID inexistant";
    }

    public ArrayList<Categorie> listerCategorie()
    {
        return listCategories;
    }

    //Article
    private static final ArrayList<Article> listArticles = new ArrayList<>();

    public String ajouterArticle( @WebParam(name = "titre") String titre,
                                  @WebParam(name = "contenu") String contenu,
                                  @WebParam(name = "dateCreation") Date dateCreation,
                                  @WebParam(name = "categorie") Categorie categorie)
    {
        Article articleToAdd = new Article(titre, contenu, dateCreation, categorie);
        listArticles.add(articleToAdd);
        return "Ajout effectué avec succes(ID = " + articleToAdd.getId() + ")";
    }

    public String modifierArticle(@WebParam(name = "id") int id,
                                  @WebParam(name = "titre") String titre,
                                  @WebParam(name = "contenu") String contenu,
                                  @WebParam(name = "dateCreation") Date dateCreation,
                                  @WebParam(name = "categorie") Categorie categorie)

    {
        for (Article article : listArticles )
        {
            if (article.getId() == id)
            {
                article.setTitre(titre);
                article.setContenu(contenu);
                article.setDateCreation(dateCreation);
                article.setCategorie(categorie);

                return "Article modifie avec succes";
            }
        }
        return "Echec de modification, ID inexistant";
    }

    public String supprimerArticle(@WebParam(name = "id") int id)
    {
        for (Article article : listArticles )
        {
            if (article.getId() == id)
            {
                listArticles.remove(article);

                return "Article supprime avec succes";
            }
        }
        return "Echec de suppression, ID inexistant";
    }

    public ArrayList<Article> listerArticle()
    {
        return listArticles;
    }

//
//    private Map<Long, Article> articles = new HashMap<Long, Article>();
//    private Map<Long, Categorie> categories = new HashMap<Long, Categorie>();
//
//    public List<Article> listArticlesByCategory(Long idCat) {
//        List<Article> listArticle = new ArrayList<Article>();
//        for (Article a:articles.values())
//            if(a.getCategorie().getId().equals(idCat))
//                listArticle.add(a);
//        return listArticle;
//    }
   
}
