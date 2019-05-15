/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

public class Teams {

    public Teams(String name, Integer identifier)   {
        this.name = name;
        this.identifier = identifier;
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
    public Players[] players;
}
