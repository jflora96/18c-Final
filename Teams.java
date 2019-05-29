/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;
import java.util.List;
import java.util.ArrayList;

public class Teams {

    public Teams(String name, Integer identifier, String record)   {
        this.name = name;
        this.identifier = identifier;
        this.record = record;
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

    /**
     * @return the identifier
     */
    public Integer getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }
    private String name;
    private int identifier;
    private String record;
    //public List<Players> players;
    public List<Players> players = new ArrayList<Players>(8);
    private Coaches coach;

    /**
     * @return the coach
     */
    public Coaches getCoach() {
        return coach;
    }

    /**
     * @param coach the coach to set
     */
    public void setCoach(Coaches coach) {
        this.coach = coach;
    }
}
