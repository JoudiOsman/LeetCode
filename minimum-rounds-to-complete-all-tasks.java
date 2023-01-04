//Problem:
//You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.
//Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.

 class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int rounds = 0;
        for(int i = 0; i<tasks.length; i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i], map.get(tasks[i])+1);
            }
            else{
                map.put(tasks[i],1);
            }
        }
        for(Integer val: map.values()){
            if(val == 1){
                return -1;
            }
            else if(val % 3 ==0){
                rounds += val/3;
            }
            else{
                rounds+= val/3 +1;
            }
        }
        return rounds;
    }
}
