class Solution
{
    public int findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
       int min=Integer.MAX_VALUE;
       Collections.sort(a);
       for(int i=0;i+m-1<n;i++){
           int d=a.get(i+m-1)-a.get(i);
           if(min>d){
               min=d;
           }
           
       }
    //   for(int i=start;i<end;i++){
           
    //   }
        return min;
    }
}