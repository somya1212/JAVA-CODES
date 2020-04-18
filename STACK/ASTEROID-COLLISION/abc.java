import java.util.*;
class abc
{
    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids)
        {
            if(i<0)
            {
                while(!st.isEmpty() && (st.peek()>0 && Math.abs(st.peek())<Math.abs(i)))
                    st.pop();
                if(!st.isEmpty() && st.peek()==Math.abs(i))
                {
                    st.pop();
                    continue;
                }
                if(st.isEmpty() || (st.peek()<0))
                    st.push(i);
                continue;
            }
            st.push(i);
        }
        ArrayList<Integer> al=new ArrayList<>();
        while(!st.isEmpty())
        {
            al.add(st.pop());
        }
        int res[]=new int[al.size()];
        int k=0;
        for(int i=al.size()-1;i>-1;i--)
        {
            res[k++]=al.get(i);
        }
        return res;
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
        int res[]=asteroidCollision(a);
        for(int i:res)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}