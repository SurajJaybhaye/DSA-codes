
public class P001_Majority_Element {

    public static int majElement(int arr[]){                      // BruteForce   TC - O(n2)

        int maxCount = 0;
        int val = 0;
        for(int i=0; i< arr.length; i++){
             int count = 0;                                // Count make 0 after every iteration of every loop
             for(int j=i; j< arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
             }
             if(count > maxCount){
                maxCount = count;
                val = arr[i];
             }
        }
        if(maxCount > (arr.length)/2){
            return val;
        }
        return -1;
    }

    public static int majElement2(int arr[]){                  // Optimal  O(n)
        int candidate = arr[0];
        int count = 1;
        for(int i=1; i < arr.length;i++){
            if(arr[i] == candidate){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        count = 0;                                            // Recheck the candidate count is must      
        for(int i=0; i< arr.length; i++){
            if(candidate == arr[i]){
                count++;
            }
        }
        if(count > (arr.length / 2)){
            return candidate;
        }
        return -1;
    }
   public static void main(String[] args) {
    int arr[] = {3,2,3};

    System.out.println(majElement(arr));
    System.out.println(majElement2(arr));
   } 
}
