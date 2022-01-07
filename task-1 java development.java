import java.util.*;
public class Main{
    public static int map(char c){
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        if(c=='L')
            return 50;
        if(c=='C')
            return 100;
        if(c=='D')
            return 500;
        return 1000;
    }
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   String s=sc.next();
	   Stack<Character>st= new Stack<Character>();
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            st.push(s.charAt(i));
        }
        while(st.size()!=0)
        {
            if(st.size()==1)
            {
                ans+= map(st.pop());
                break;
            }
            char a= st.pop();
            if(map(a)<map(st.peek()))
            ans-=map(a);
            else
            ans+=map(a);
            
        }
        System.out.println(ans);
	}
}

