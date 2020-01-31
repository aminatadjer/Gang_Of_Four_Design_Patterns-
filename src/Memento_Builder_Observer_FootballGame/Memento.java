package Memento_Builder_Observer_FootballGame;

import java.io.Serializable;

public class Memento  implements Serializable{
    private Team teamA;
    private Team teamB;
    Ball ballon;
    private int scoreA=0;
    private int scoreB=0;

public Memento(){

}
    public Memento(Team a, Team b,Ball ball,int sA,int sB){
        this.teamA = a;
       this.teamB=b;
       this.ballon=ball;
       this.scoreA=sA;
       this.scoreB=sB;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public Ball getBallon() {
        return ballon;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }
    @Override
    public String toString(){
        return "Score 1:   "+this.scoreA+"   Vs    "+this.scoreB+"   :Score 2";
    }
}