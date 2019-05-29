
package nba;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class NBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coaches coach1;
        coach1 = new Coaches("bob", 5);
        Teams Celtics = new Teams("Celtics", 1, "10-2");
        Celtics.setCoach(coach1);
        Teams Lakers = new Teams("Lakers", 2, "3-8");
        Teams Jazz = new Teams ("Jazz", 3, "5-5");
        Teams Pistons = new Teams("Pistons", 4, "6-4");
        Teams Spurs = new Teams("Spurs", 5, "7-3");
        Teams Warriors = new Teams("Warriors", 6, "8-2");
        Teams Clippers = new Teams("Clippers", 7, "9-1");
        Teams Raptors = new Teams("Raptors", 8 , "10-0");
        Players KyrieIrving = new Players(Celtics, 12, "Point Guard", "Kyrie Irving");
        Players AronBanes = new Players(Celtics, 46, "Forward", "Aron Banes");
        Players JaylenBrown = new Players(Celtics, 7, "Guard", "Jaylen Brown");
        Players PJDozier = new Players(Celtics, 50, "Forward", "PJ Dozier");
        Players GordonHayward = new Players(Celtics, 20, "Forward", "Gordon Hayward");
        Players AlHorford = new Players(Celtics, 42, "Center", "Al Horford");
        Players RJHunter = new Players (Celtics, 28, "Guard", "RJ Hunter");
        Players MarcusMorris = new Players(Celtics, 13, "Forward", "MarcusMorris");
        Players LonzoBall = new Players(Lakers, 2, "Point Guard", "Lonzo Ball");
        Players ReggieBullock = new Players(Lakers, 35, "Shooting Guard", "Reggie Bullock");
        Players AlexCaruso = new Players(Lakers, 4, "Shooting Guard", "Alex Caruso");
        Players LamarcusAldridge = new Players(Spurs, 15, "Power Forward", "Lamarcus Alrdidge");
        Players ZazaPechulia = new Players(Warriors, 16, "Center", "Zaza Pechulia");
        ArrayList<Players> playerArray = new ArrayList(20);
        playerArray.add(KyrieIrving);
        playerArray.add(ZazaPechulia);
        playerArray.add(LamarcusAldridge);
        playerArray.add(AronBanes);
        playerArray.add(JaylenBrown);
        playerArray.add(PJDozier);
        playerArray.add(GordonHayward);
        playerArray.add(AlHorford);
        playerArray.add(RJHunter);
        playerArray.add(MarcusMorris);
        
        ArrayList<Coaches> coachArray = new ArrayList(8);
        coachArray.add(coach1);
        
        
        HashMap<String, Teams> map = new HashMap<>();
        map.put(Celtics.getName(), Celtics);
        map.put(Lakers.getName(), Lakers);
        map.put(Jazz.getName(), Jazz);
        map.put(Pistons.getName(), Pistons);
        map.put(Spurs.getName(), Spurs);
        map.put(Warriors.getName(), Warriors);
        map.put(Clippers.getName(), Clippers);
        map.put(Raptors.getName(), Raptors);
        
        for (int i = 0; i < 10; i++)
        {
           
            if (playerArray.get(i).getTeam() == Celtics)
            {
                    Celtics.players.add(playerArray.get(i));            
            }
            else if (playerArray.get(i).getTeam() == Lakers)
            {
                    Lakers.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Jazz)
            {
                    Jazz.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Pistons)
            {
                    Pistons.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Spurs)
            {
                    Spurs.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Warriors)
            {
                    Warriors.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Clippers)
            {
                    Clippers.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Raptors)
            {
                    Raptors.players.add(playerArray.get(i));
            }
        }
        
        Collections.sort(Celtics.players);
        Collections.sort(Lakers.players);
        Collections.sort(Jazz.players);
        Collections.sort(Pistons.players);
        Collections.sort(Spurs.players);
        Collections.sort(Warriors.players);
        Collections.sort(Clippers.players);
        Collections.sort(Raptors.players);
        
        
    String option = JOptionPane.showInputDialog("1. Search by Team \n2. Search by Player\n3. Search by Coach");
    int choice = Integer.parseInt(option);
    
    if (choice == 1)
    {
        String option2 = JOptionPane.showInputDialog("1. Show all Teams \n2. Enter a team name");
        int choice2 = Integer.parseInt(option2);
        {
            if (choice2 == 1)
            {
                 JOptionPane.showMessageDialog(null, (Arrays.asList(map)));
            }
            else if (choice2 == 2)
            {
                String option3 = JOptionPane.showInputDialog("Enter team name:");
                if (map.containsKey(option3))
                {
                    Teams a = map.get(option3); 
                    String sum = " ";
                    for (int i=0; i<a.players.size(); i++) 
                    {
                        Players b = a.players.get(i);
                        sum += b.getName() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, sum);
                 } 
            }
        }
    }
    
    else if (choice == 2)
    {
        String option4 = JOptionPane.showInputDialog("1. Search by Player Name \n2. Search by Jersey Number");
        int choice4 = Integer.parseInt(option4);
        if (choice4 == 1)
        {
            String option5 = JOptionPane.showInputDialog("Enter Player's name:");
            //binary search for that name in playerArray
        }
        else if (choice == 2)
        {
            String option6 = JOptionPane.showInputDialog("Enter Player's Jersey Number: ");
            //binary search for that number in playerArray
        }
    }
    
    else if (choice == 3)
    {
        String option6 = JOptionPane.showInputDialog("1. Search by Coach Name\n 2. Display a Team's coach");
        int choice6 = Integer.parseInt(option6);
        if (choice6 == 1)
        {
            String option7 = JOptionPane.showInputDialog("Enter the Coach's Name: ");
            //binary search
        }
        
        else if (choice6 == 2)
        {
            String option8 = JOptionPane.showInputDialog("Enter a Team: ");
            if (map.containsKey(option8))
                {
                    Teams a = map.get(option8); 
                    Coaches b = a.getCoach();
                    JOptionPane.showMessageDialog(null, b.getName() + " " + b.getRecord());
                }
        }
    }
  }
    
}

}
