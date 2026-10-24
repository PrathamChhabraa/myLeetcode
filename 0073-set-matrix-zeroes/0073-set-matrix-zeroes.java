class Solution {
    public void setZeroes(int[][] matrix) {
        // List<Integer> r=new ArrayList<>();
        // List<Integer> c=new ArrayList<>();
        // int m=matrix.length;
        // int n=matrix[0].length;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             r.add(i);
        //             c.add(j);
        //         }
        //     }
        // }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(r.contains(i)||c.contains(j)){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }

        int m = matrix.length;
        int n = matrix[0].length;

        int[] r = new int[m];
        int[] c = new int[n];

        // Store rows and columns containing original zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }

        // Set cells to zero using the markers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}