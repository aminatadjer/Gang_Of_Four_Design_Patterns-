package Memento_Builder_Observer_FootballGame;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Team implements Serializable {
    private String nom;
    private String color;
    private Coach coach;
    private List<Player> players = new ArrayList<Player>()  ;


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCoach(String coach,Ball ballon) {
        this.coach = new Coach(coach,ballon);
    }

   // ajouter un attaquant à l'équipe
    public void setAnAttaq(String nom,int number,Ball ball) {
        Player p= new Attaquant(nom,number,ball);
        this.players.add(p);
    }
    //ajouter un defenseur à l'equipe
    public void setADef(String nom,int number,Ball ball) {
        Player p= new Defenseur(nom,number,ball);
        this.players.add(p);
    }
   //ajouter un gardien à l'equipe
    public void setAGard(String nom,int number,Ball ball) {
        Player p= new Gardien(nom,number,ball);
        this.players.add(p);
    }

    public String getNom() {
        return nom;
    }

    public String getColor() {
        return color;
    }

    public Coach getCoach() {
        return coach;
    }

// Afficher le nom de l'équipe sa couleur et ses joueurs
    public void affichTeam(){
        System.out.println("Je suis l'équipe "+this.nom);
        this.coach.whoIam();

       for (Player p : this.players){
            p.whoIam();
        }

    }
}
