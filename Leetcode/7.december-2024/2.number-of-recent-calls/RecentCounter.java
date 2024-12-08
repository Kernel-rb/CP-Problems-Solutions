import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> q = new LinkedList<>();  

    public RecentCounter() {
       this.q = q;
    }
    
    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) { 
            q.poll();
        }
        return q.size();
    }
}

