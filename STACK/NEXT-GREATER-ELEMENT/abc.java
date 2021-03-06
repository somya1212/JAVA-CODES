import java.util.*;
class abc
{
    static void nextGreat(int a[],int n)
    {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && a[st.peek()]<=a[i])
            {
                res[st.pop()]=a[i];
            }
            st.push(i);
        }
        for(int i:res)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        nextGreat(a,n);
    }
}