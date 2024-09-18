/* 1436. Destination City
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. 
Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

 

Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. 
Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
*/


import java.util.*;
class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> start= new HashSet<>();
        HashSet<String> dest= new HashSet<>();
        for(int i=0;i<paths.size();i++){
            start.add(paths.get(i).get(0));
            dest.add(paths.get(i).get(1));
        }

        for(String s : dest){
            if(!start.contains(s)){
                return s;
            }
        }
        return "";
    }
}