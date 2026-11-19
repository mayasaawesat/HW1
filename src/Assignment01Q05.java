public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] edges=new int[m.length];
        int[] dist=new int[m.length];
        int curr=0;
        int next=0;
        edges[next]=i;
        next++;
        if(i==j){
            return 0;
        }
        for (int k=0;k<m.length;k++){
            dist[k]=-1;
        }
        dist[i]=0;
        while(curr<next){
            int curr2=edges[curr];
            curr++;
            for (int k2 = 0; k2 < m.length; k2++) {

            if (m[curr2][k2] == 1 && dist[k2] == -1) {

                dist[k2] = dist[curr2] + 1;

                if (k2 == j) {
                    return dist[k2];
                }

                edges[next] = k2;
                next++;
            }
        }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}