// SportsTeam Class
 
public class SportsTeam {
    
    private String team;
    private int points;
    private int wins;
    private int losses;
    
    public SportsTeam(String team, int points) {
        this.team = team;
        this.points = points;
    }
    
    public String getTeam() {
        return team;
    }
    
    public int getPoints() {
        return points;
    }
    
    public int winGame() {
        wins++;
        return wins;
    }
    
    public int loseGame() {
        losses++;
        return losses;
    }
    
    public int getWins() {
        return wins;    
    }
    
    public int getLosses() {
        return losses;
    }
}
 