package Memento_Builder_Observer_FootballGame;

public class TeamBuilderDefenseur extends TeamBuilder {
    public TeamBuilderDefenseur() {
        super();
    }



    public void buildPlayers(Ball ball) {
        String name="Joueur ";
        String number;
        int i;
        for (i=0;i<4;i++){
            number=Integer.toString(i);
            this.team.setADef(name+" "+number,i,ball);
        }

        this.team.setAnAttaq(name+" 5",5,ball);
        this.team.setAGard(name+" 6",6,ball);
    }






}
