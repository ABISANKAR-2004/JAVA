import java.util.*;
class subString{
	public static String getSmallestAndLargest(String s, int k){
		String smallest="";
		String largest="";
		smallest=s.substring(0,k);
		largest=s.substring(0,k);
		for(int i=0;i<=s.length()-k;i++){
			String sub=s.substring(i,i+k);
			if(sub.compareTo(smallest)<0)
				smallest=sub;
			if(sub.compareTo(largest)>0)
				largest=sub;
		}
		return smallest+"\n"+largest;
	}
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
     
}}
