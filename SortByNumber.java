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
public class SortByNumber implements Comparable<Players>{

    public int compareTo(Players a, Players b) 
    { 
       if (a.getJerseyNumber() > b.getJerseyNumber())
       {
           return -1;
       }
       else if (a.getJerseyNumber() < b.getJerseyNumber())
       {
           return 1;
       }
       else
       {
           return 0;
       }
    } 

    @Override
    public int compareTo(Players o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

} 

