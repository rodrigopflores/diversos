package projetos.udemy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class LeagueTable<T extends TeamAbstract> {

    private String leagueName;
    private ArrayList<T> teamList = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;

    }

    public void addTeam(T newTeam){
        this.teamList.add(newTeam);
    }

    public void printLeague(){
        Collections.sort(teamList);
        for (T i : teamList){
            System.out.println(i.getPoints() + " - " + i.getName());
        }
    }




}
