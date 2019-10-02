import java.util.Arrays;

class MaximumSum{

    int[] Maximum(int[] arr){

        int max_sum=-1000;
        int sum=0;
        int start=0;
        int end=arr.length;

        for(int i=0; i<arr.length;i++)
        {

            for(int j=arr.length-1;j>=i;j--){

                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }

                if(max_sum<sum){
                    max_sum=sum;
                    start=i;
                    end=j;
                }

            }

        }

        int[] result=new int[end-start+1];

        int count=0;
        int x=start;
        while(count<result.length && x<=end){
            result[count]=arr[x];
            count++;
            x++;
        }

        return result;

    }

    public static void main(String[]args){

        int[] arr={-2,-5,6,-2,-3,1,5,-6};

        MaximumSum r1=new MaximumSum();

        int [] result =r1.Maximum(arr);

        System.out.println(Arrays.toString(result));

    }

}
