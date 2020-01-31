package Memento_Builder_Observer_FootballGame;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int reload = 0;
        System.out.println("Choisissez l'option que vous voulez");
        System.out.println("1 pour nouveau Jeu");
        System.out.println("2 pour restaurer Jeu");
        Scanner sc1 = new Scanner(System.in);
        reload = Integer.parseInt(sc1.nextLine());
        if (reload == 1) {
            int commencer = 0;
            while (commencer == 0) {
                System.out.println("Voulez vous commencer le jeu");
                System.out.println("1 pour Oui");
                System.out.println("0 pour Non");
                Scanner sc = new Scanner(System.in);
                commencer = Integer.parseInt(sc.nextLine());
            }
            Game g;
            g = new Game();
            int afficher = 0;
            while (afficher == 0) {
                System.out.println("Voulez vous afficher les détails du jeu?");
                System.out.println("1 pour Oui");
                System.out.println("0 pour Non");
                Scanner sc = new Scanner(System.in);
                afficher = Integer.parseInt(sc.nextLine());
            }
            g.detailsGame();
            System.out.println("Faites Bouger le Ballon ! Faites rentrer les nouvelles coordonnées");
            System.out.println("X= ");
            Scanner sc = new Scanner(System.in);
            int x = Integer.parseInt(sc.nextLine());
            g.bougerBallonX(x);

            System.out.println("******************************************************************************");
            System.out.println("******************************************************************************");
            System.out.println("******************************************************************************");
            System.out.println("Passons à la partie de sauvegarde");
            g.setScoreA(3);
            g.setScoreB(2);
            System.out.println("Voici le résultat du match en ce moment ");
            System.out.println(g);  // afficher le score du jeu courant
            System.out.println("Sauvegarder et continuer le match ... Entr  ");
            sc = new Scanner(System.in);
            sc.nextLine();
            g.createSavepoint("SAVE1"); //Si par exemple on veut arreter le match et le reprendre on peut l'écrire dans un fichier
            g.setScoreA(5);
            g.setScoreB(3);
            System.out.println("Voici le résultat du match en ce moment ");
            System.out.println(g);  // afficher le score du jeu courant
            System.out.println("Sauvegarder et continuer le match ... Entr  ");
            sc = new Scanner(System.in);
            sc.nextLine();
            g.createSavepoint("SAVE2");
            System.out.println("Revenir à l'etat SAVE1 ..... Entr");
            sc = new Scanner(System.in);
            sc.nextLine();
            g.undo("SAVE1");
            System.out.println("Retrieving at: ");
            System.out.println("Voici le résultat du match en ce moment ");
            System.out.println(g);
            System.out.println("Sauvegarder et quiter le jeu");
            System.out.println("1 Quitter");
            System.out.println("2 Sauvegarder et quitter");
            int save;
            Scanner sc2 = new Scanner(System.in);
            save = Integer.parseInt(sc1.nextLine());
            if (save==2){
                g.saveAndQuit();
            }

        }
        else {
     CareTaker c=new CareTaker();
     Game g=new Game(c);
     g.restore();
     System.out.println("Jeu restauré avec succès !!!!!*.*");
     g.detailsGame();

        }
    }
}
