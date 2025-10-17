public class P002_Find_Missing_Repeated_Values {
    

    public int[] findMissingAndRepeatedValues(int[][] grid) {           // O(n2)
        int missingNumber = -1;
        int repeat = -1;
        int hash[] = new int[(grid.length * grid.length)+1];
        for (int i=0;i<grid.length;i++){
            for(int j=0; j < grid[0].length;j++){
                hash[grid[i][j]]++;
            }
        }

        for(int i=1; i< hash.length;i++){             // i=1 always because we have to check range (1-n2)
            if(hash[i] == 0){
                missingNumber = i;
            }
            if(hash[i] == 2){
                repeat = i;
            }
        }
        return new int[] {repeat, missingNumber};
    }

}
