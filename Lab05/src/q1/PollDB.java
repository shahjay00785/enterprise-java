package q1;

public class PollDB {
	
	public static void main(String[]  arg){
		passArray pa=new passArray();
		int[] p = pa.pass();
		for(int i=0;i<p.length;i++)
			System.out.println(p[i]);
		System.out.println();		
	}
}
