import java.util.*;

public class look_and_say {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		ystem.out.println("Enter value of n");
		int n=in.nextInt();
		int count=1;
		int k=0;
		String str="11";
		String temp="";
		
		if(n==1){
			System.out.println("1");
		}
		else if(n==2){
			System.out.println("11");
		}
		else{
			System.out.println("1");
			System.out.println("11");
			for(int i=2;i<n;i++){                     //starts from th third index as 1st and 2nd are already initialized for simplicity
				temp="";
				count=1;
				for(int j=0;j<str.length();j++){
					if(j+1==str.length()){
						temp+=String.valueOf(count) ;
						temp+=str.charAt(j);
						str=temp;
						System.out.println(str);
						break;
					}
					
					else if(str.charAt(j+1)!=str.charAt(j)){
						temp+=String.valueOf(count) ;
						temp+=str.charAt(j);
						count=1;
					}
					else{
						count++;
					}
					
				}
				
			}
		}
	}
}
