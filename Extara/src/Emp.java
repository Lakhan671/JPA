import java.util.ArrayList;
import java.util.List;


public class Emp {

	public static void main(String[] args) {
		
		int nu=81;
		Integer b=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=2;i<=nu;i++){
			while(nu!=0){
				b=nu%i;
				if(b==0){
					a.add(i);
				}
			}
			nu=nu/i;
			
	}
		System.out.println("out put as");
System.out.println(a+"");
	}
}
