/**
 * Created by Ben Maxwell on 1/31/17.
 * Established constructor, setters, and getters for this class
 */
public class Team {

    String sport; //i.e. football, basketball, baseball, etc.
    String name;
    String location;
    int numPlayers; //number of players on team roster (does not include players of practice squad)
    int wins; //number of wins
    int losses; //number of losses
    int ties; //number of ties
    int rank; //latest ranking of the team in the league

    public Team(String sport, String name, String location, int numPlayers, int wins, int losses, int ties, int rank) {
        this.sport = sport;
        this.name = name;
        this.location = location;
        this.numPlayers = numPlayers;
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
        this.rank = rank;
    }


    public static void main(String[] args) {

    }

    //Creates getter for sport
    public String getSport() {
        return sport;
    }

    //Creates setter for sport
    public void setSport(String sport) {
        this.sport = sport;
    }

    //Creates getter for team name
    public String getName() {
        return name;
    }

    //Creates setter for team name
    public void setName(String name) {
        this.name = name;
    }

    //Creates getter for location
    public String getLocation() {
        return location;
    }

    //Creates setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    //Creates getter for number of players
    public int getNumPlayers() {
        return numPlayers;
    }

    //Creates setter for number of players
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    //Creates getter for wins
    public int getWins() {
        return wins;
    }

    //Creates setter for number of wins
    public void setWins(int wins) {
        this.wins = wins;
    }

    //Creates getter for losses
    public int getLosses() {
        return losses;
    }

    //Creates setter for losses
    public void setLosses(int losses) {
        this.losses = losses;
    }

    //Creates getter for ties
    public int getTies() {
        return ties;
    }

    //Creates setter for ties
    public void setTies(int ties) {
        this.ties = ties;
    }

    //Creates getter for rank
    public int getRank() {
        return rank;
    }

    //Creates setter for rank
    public void setRank(int rank) {
        if(rank < 1){
            System.out.println("This team is not ranked");
        } else {
            this.rank = rank;
        }
    }
}
