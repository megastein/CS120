// Basketball.java
// This class defines a Basketball player with basic actions

class Basketball {
    // Class variables (instance variables)
    String name;
    int number;
    String team;

    // Constructor to initialize the player
    public Basketball(String name, int number, String team) {
        this.name = name;
        this.number = number;
        this.team = team;
    }

    // Method for dribbling action
    public void dribble() {
        System.out.println(name + " (#" + number + " from " + team + ") is dribbling the ball.");
    }

    // Method for shooting action
    public void shoot() {
        System.out.println(name + " (#" + number + " from " + team + ") takes a shot!");
    }
}

public class BasketballGameSimulator {
    public static void main(String[] args) {
        // Create 4 basketball player objects
        Basketball player1 = new Basketball("LeBron James", 6, "Lakers");
        Basketball player2 = new Basketball("Stephen Curry", 30, "Warriors");
        Basketball player3 = new Basketball("Kevin Durant", 7, "Nets");
        Basketball player4 = new Basketball("Giannis Antetokounmpo", 34, "Bucks");

        // Simulate the game by calling dribble() and shoot() methods
        player1.dribble();
        player2.dribble();
        player3.shoot();
        player4.shoot();

        player1.shoot();
        player2.shoot();
        player3.dribble();
        player4.dribble();
    }
}

