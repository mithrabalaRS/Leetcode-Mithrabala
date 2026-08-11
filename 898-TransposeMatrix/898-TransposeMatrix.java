// Last updated: 8/11/2026, 2:20:28 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans[][]=new int[n][m];
        int i,j;
        // for(i=0;i<n;i++){
        //     for(j=0;j<n;j++){
        //         ans[i][j]=matrix.nextInt();
        //     }
        // }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
            }
        }

        return ans;

    
}
}
