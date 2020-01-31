package Memento_Builder_Observer_FootballGame;

public class TeamBuilderAttaquante extends TeamBuilder {


    public TeamBuilderAttaquante() {
        super();
    }



    public void buildPlayers(Ball ball) {
        String name="Joueur ";
        String number;
        int i;
        for (i=0;i<4;i++){
            number=Integer.toString(i);
            this.team.setAnAttaq(name+" "+number,i,ball);
        }

        this.team.setADef(name+" 5",5,ball);
        this.team.setAGard(name+" 6",6,ball);



    }




}
