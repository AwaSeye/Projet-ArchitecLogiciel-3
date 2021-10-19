package serveur;

import service.UserManager;

import javax.xml.ws.Endpoint;

public class SoapServer
{
    public static void main(String[] args)
    {
        String url1 = "http://localhost:8080/";
        Endpoint.publish(url1, new UserManager());

        System.out.printf(
                "Le serveur ecoute sur l'adresse : %sManager?wsdl",
                url1);

    }
}
