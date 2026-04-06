public class kadana {
    
    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = arr[0];
        int currentSum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            currentSum = Math.max(arr[i],currentSum +arr[i]);
                        System.out.println(currentSum); 

            maxSum= Math.max(maxSum,currentSum);
            System.out.println("--------------");
                        System.out.println(maxSum); 

        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
