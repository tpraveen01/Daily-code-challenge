public class MinProductVector{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int start=0;
        int end=arr2.length-1;
        while(start<end){
            swap(arr2,start,end);
            start++;
            end--;
        }
        int minimum=0;
        for(int i=0;i<n;i++){
            minimum+=arr1[i]*arr2[i];
        }
        System.out.println(minimum);
    }
    public static void swap(int [] arr2,int first,int second){
            int temp=arr2[first];
            arr2[first]=arr2[second];
            arr2[second]=temp;
    }
}
