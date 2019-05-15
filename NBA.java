
package nba;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class NBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Teams Celtics = new Teams("Celtics", 1);
        Players KyrieIrving;
        KyrieIrving = new Players(Celtics, 12, "Point Guard", "Kyrie Irving");
        Players[] playerArray;
        playerArray = new Players[20];
        playerArray[0] = KyrieIrving;
        
        
        HashMap<Integer, Teams> map = new HashMap<>();
        map.put(Celtics.getIdentifier(), Celtics);
        
        for (int i = 0; i < 200; i++)
        {
           
            if (playerArray[i].getTeam() == Celtics)
            {
                int j = 0;
                while (Celtics.players[j] != null)
                {
                    j++;
                    if (Celtics.players[j] == null)
                    {
                        playerArray[i] = Celtics.players[j];
                    }
                }
            }
        }
        
        Arrays.sort(playerArray, new SortByNumber());
    }
    
}
