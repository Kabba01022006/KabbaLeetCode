1class Solution {
2    public int[] scoreValidator(String[] events) {
3        int score=0;
4        int counter=0;
5        for(int i=0;i<events.length;i++){
6            if(counter==10) break;
7            else if(events[i].equals("0")) score+=0;
8            else if(events[i].equals("1")) score+=1;
9            else if(events[i].equals("2")) score+=2;
10            else if(events[i].equals("3")) score+=3;
11            else if(events[i].equals("4")) score+=4;
12            else if(events[i].equals("6")) score+=6;
13            else if(events[i].equals("W")) counter++;
14            else if(events[i].equals("WD")) score++;
15            else if(events[i].equals("NB")) score++;
16        }
17        int[] arr = {score,counter};
18        return arr;
19    }
20}