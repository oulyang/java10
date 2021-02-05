package m2d54;

import java.text.DecimalFormat;

public class Test41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("123");
		DecimalFormat df1=new DecimalFormat("###,###.##");
		String st1=df1.format(11.11111111);
		System.out.println(st1);
		
		DecimalFormat df2=new DecimalFormat("###,###.0000");
		String st2=df2.format(11.111);
		System.out.println(st2);
	}

}
