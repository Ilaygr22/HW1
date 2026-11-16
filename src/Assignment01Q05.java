public class Assignment01Q05 {

    public static int findShortestPath(int[][] matrix, int i, int j) {   
        if (i == j) {return 0;}
        int[] queue = new int[matrix.length];
        int b = 0;
        int a = 0;
        int[] distance = new int[matrix.length];

        for (int k = 0; k < matrix.length; k++) {distance[k] = -1;}
        queue[a++] = i;
        distance[i] = 0;

        while (b < matrix.length) {
            int current = queue[b++];
            
            for (int neighbor = 0; neighbor < matrix.length; neighbor++) {  
                if (matrix[current][neighbor] == 1 && distance[neighbor] == -1) {
                    distance[neighbor] = distance[current] + 1;
                    
                    
                    if (neighbor == j) {
                        return distance[neighbor];
                    }
                    
                    queue[a++] = neighbor;
                }
            }
        }

        
        return distance[j];
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