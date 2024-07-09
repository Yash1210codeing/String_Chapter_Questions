package String_Chapter_Questions;
public class String_Numeric_Sub_String_Print_Length_Wise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="84513";
        PrintSubString(str);
	}
	public static void PrintSubString(String s) {
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;
				System.out.println(s.substring(i,j)+" ");
			}
		}
		
	}

}
