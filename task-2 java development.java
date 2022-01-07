import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 String s=sc.nextLine();
	 StringBuilder ans = new StringBuilder();
        String st2=s.toLowerCase();
        for(int i=0;i<st2.length();i++){
            if((st2.charAt(i)>='a'&&st2.charAt(i)<='z')||(st2.charAt(i)>='0'&&st2.charAt(i)<='9')){
                ans.append(st2.charAt(i));
            }
        }
         System.out.println(checkPalindrome(ans.toString()));
	}
	public static boolean checkPalindrome(String ans){
        int l=0,h=ans.length()-1;
        while(l<=h){
            if(ans.charAt(l)!=ans.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}

