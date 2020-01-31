package Memento_Builder_Observer_FootballGame;

import java.util.Scanner;

public abstract class TeamBuilder {
    protected Team team;
    public TeamBuilder(){
        this.team=new Team();
    }
    public  void buildCoach(Ball ball){
        System.out.println("Veuillez entrer le nom du coach");
        Scanner sc=new Scanner(System.in);
        String nameCoach=sc.nextLine();
        team.setCoach(nameCoach,ball);

    };
    public abstract void buildPlayers(Ball ball);
    public void buildMaillor(){
        System.out.println("Veuillez entrer la couleur du maillot");
        Scanner sc=new Scanner(System.in);
        String couleur=sc.nextLine();
        team.setColor(couleur);
    };
    public void buildName(){
        System.out.println("Veuillez entrer le nom de l'équipe");
        Scanner sc=new Scanner(System.in);
        String nom=sc.nextLine();
        team.setNom(nom);

    };
    public Team getTeam(){
    return this.team;
    };

}
