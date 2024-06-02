package countandsay;

public class Lookandseq {
	static String contious(int n) {
		if(n==1) return "1";
		if(n==2) return "11";
		
		String str ="11";
		for(int i=3;i<=n;i++) {
			str+= '$';
			int len = str.length();
			int cnt =1;
			String temp ="";
			char []arr = str.toCharArray();
			for(int j =1;j<len;j++) {
				if(arr[j]!= arr[j-1]) {
					temp +=cnt;
					temp +=arr[j-1];
					
					cnt =1;
				}
				else cnt++;
			}
			str = temp;
		}
		return str;
		}
	public static  void main(String[]args) {
		int N =3;
		System.out.println(contious(N));
	}
	}


