import java.util.ArrayList;
import java.util.List;

public class IFVMarder <T extends BattleModule>{
    private List<T> battleModules =new ArrayList<>();

    public List<T> getBattleModules() {
        return battleModules;
    }

    public void setBattleModules(List<T> battleModules) {
        this.battleModules = battleModules;
    }
    public void AddBattleModule(T module){
        battleModules.add(module);
    }
    public void DeleteBattleModule(int i)
    {
        battleModules.remove(i);
    }
    public T findCheaper()
    {
        if (!battleModules.isEmpty())
        {
            T min = battleModules.get(0);
            for (int i=1; i< battleModules.size(); i++)
            {
                if ( battleModules.get(i).compareTo(min) < 0 )
                    min = battleModules.get(i);
            }
            return min;
        }
        return null;
    }
}
