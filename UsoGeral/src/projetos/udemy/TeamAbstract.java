package projetos.udemy;

public abstract class TeamAbstract implements Comparable<TeamAbstract> {

    private String name;
    private int points;

    public TeamAbstract(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points){
        this.points += points;
    }

    @Override
    public int compareTo(TeamAbstract o) {
        if(this.points > o.points) return -1;
        if(this.points < o.points) return 1;
        return 0;
    }
}
