/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

/**
 *
 * @author jimmy
 */
public class Coaches {

    
    
    public Coaches(String name, Integer record)   {
        this.name = name;
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
     * @return the record
     */
    public Integer getRecord() {
        return record;
    }

    /**
     * @param record the record to set
     */
    public void setRecord(Integer record) {
        this.record = record;
    }
    private String name;
    private Integer record;
    
}
