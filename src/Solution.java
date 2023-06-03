import java.util.*;

class Solution {
    int time =0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, List<Integer>>graph=new HashMap<>();
        for (int i=0;i<n;i++)
        {
            if (!graph.containsKey(manager[i]))
            {
                graph.put(manager[i],new ArrayList<>());
            }
            graph.get(manager[i]).add(i);
        }
        dfs(headID,informTime,graph,0);
        return time;

    }
    void dfs(int employee,int[]informTime,HashMap<Integer,List<Integer>>graph,int tempTime)
    {
        if (!graph.containsKey(employee))
        {
            time=Math.max(time,tempTime);
            return ;
        }
        tempTime+=informTime[employee];
        for (int temp:graph.get(employee))
        {
            dfs(temp,informTime,graph,tempTime);
        }

    }
}
