
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String args[]) {
 
        ArrayList<SportsTeam> teams = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();
 
        try ( Scanner find = new Scanner(Paths.get(file))) {
            while (find.hasNextLine()) {
 
                String[] split = find.nextLine().split(",");

                String teamOneName = split[0];
                int teamOnePoints = Integer.parseInt(split[2]);
 
                String teamTwoName = split[1];
                int teamTwoPoints = Integer.parseInt(split[3]);
 
                SportsTeam team1 = new SportsTeam(teamOneName, teamOnePoints);
                SportsTeam team2 = new SportsTeam(teamTwoName, teamTwoPoints);
                teams.add(team1);
                teams.add(team2);
                if (team1.getPoints() > team2.getPoints()) {
                    team1.winGame();
                    team2.loseGame();
                } else {
                    team1.loseGame();
                    team2.winGame();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: File " + file + " not found: " + e.getMessage());
        }
        // ---------------------------
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        for (SportsTeam name : teams) {
 
            if (name.getTeam().equals(team)) {
                gamesPlayed++;
                wins = name.getWins();
                losses = name.getLosses();
            }
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
