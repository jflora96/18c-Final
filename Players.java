/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;
import java.util.ArrayList;
import java.util.Comparator;

public class Players implements Comparable<Players> {

    public Players(Teams team, int jerseyNumber, String position, String name)
    {
        this.team = team;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.name = name;
    }
    /**
     * @return the team
     */
    public Teams getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(Teams team) {
        this.team = team;
    }

    /**
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    private Teams team;
    private int jerseyNumber;
    private String position;
    private String name;

   @Override
   public int compareTo(Players o)
   {
       return this.name.compareTo(o.name);
   }

    
}
