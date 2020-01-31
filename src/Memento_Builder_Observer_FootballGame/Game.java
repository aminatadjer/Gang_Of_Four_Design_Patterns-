package Memento_Builder_Observer_FootballGame;

public class Game {
    private Team teamA=new Team();
    private Team teamB=new Team();
    Ball ballon=new Ball();
    private int scoreA=0;
    private int scoreB=0;
    private String lastUndoSavepoint="";
    CareTaker careTaker;
    private TeamBuilderAttaquante builder1;
    private TeamBuilderDefenseur builder2;
    public Game(CareTaker c){
        c=new CareTaker();
    }
    public Game(){
        ballon=new Ball();
        this.builder1=new TeamBuilderAttaquante();
        this.builder2=new TeamBuilderDefenseur();
        this.makeTeamA();
        this.makeTeamB();
        this.careTaker=new CareTaker();
    }
    public void makeTeamA(){
        System.out.println("We are making the team A (avec une stratégie d'attaque)");
        this.builder1.buildName();
        this.builder1.buildCoach(ballon);
        this.builder1.buildMaillor();
        this.builder1.buildPlayers(ballon);
        teamA=this.builder1.getTeam();
    }
    public void makeTeamB(){
        System.out.println("We are making the team B (avec une stratégie de défense)");
        this.builder2.buildName();
        this.builder2.buildCoach(ballon);
        this.builder2.buildMaillor();
        this.builder2.buildPlayers(ballon);
        teamB=this.builder2.getTeam();
    }
    public void detailsGame(){
        System.out.println("Voici les détails du jeu courant !");
        System.out.println("**************************************Equipe 01************************************");
        teamA.affichTeam();
        System.out.println("**************************************Equipe 02**************************************");
        teamB.affichTeam();
        System.out.println("**************************************Score************************");
        System.out.println("Score1                    "+this.scoreA+"  Vs  "+this.scoreB+"                  Score2");
    }
    public void bougerBallonX(int x ){
        this.ballon.setX(x);

    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    // Les fonctions relatives à Memento

    public void createSavepoint(String savepointName){
        careTaker.saveMemento(new Memento(this.teamA,this.teamB,this.ballon,this.scoreA,this.scoreB), savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo(){
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(String savepointName){
        setOriginatorState(savepointName);
    }

    public void undoAll(){
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    private void setOriginatorState(String savepointName){
        Memento mem = careTaker.getMemento(savepointName);
        this.teamA=mem.getTeamA();
        this.teamB=mem.getTeamB();
        this.ballon=mem.getBallon();
        this.scoreA=mem.getScoreA();
        this.scoreB=mem.getScoreB();
    }
    public void saveAndQuit(){
        String lastSave="last";
        careTaker.saveMemento(new Memento(this.teamA,this.teamB,this.ballon,this.scoreA,this.scoreB),lastSave);
        careTaker.writeFile(lastSave);

    }
    public void restore(){
        try {
            Memento m=new Memento();

            CareTaker c =new CareTaker();
            m=c.restore();
            this.teamA=m.getTeamA();
            this.teamB=m.getTeamB();
            this.ballon=m.getBallon();
            this.scoreA=m.getScoreA();
            this.scoreB=m.getScoreB();

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Exceprion !!!!!! Nooooooo");
        }

    }
    // Pour afficher juste les scores ( on fera les tests de sauvegarde de memento sur les scores
    @Override
    public String toString(){
        return "Score 1:   "+this.scoreA+"   Vs    "+this.scoreB+"   :Score 2";
    }

}
