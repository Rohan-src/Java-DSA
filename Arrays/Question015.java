package Arrays;

class Question015 {
    public int maxSubarraySumCircular(int[] a) {
        int n = a.length;
        int max_normal = maxSubarraySum(a,n);
        if(max_normal<0) // to handle all ele in arr are negative
            return max_normal;

        int sum=0;
        for(int i=0; i<n; i++){
            sum+=a[i];
            a[i] = -a[i];
        }
        int max_circular = sum + maxSubarraySum(a,n);

        return Math.max(max_normal, max_circular);

    }
    int maxSubarraySum(int arr[], int n){

        int sum =0; int max = Integer.MIN_VALUE;
        for(int i =0; i <n; i++){
            sum+= arr[i];
            max = Math.max(max, sum);

            if(sum<0)
                sum=0;
        }
        return max;

    }
}