package m2d55;
import java.util.Random;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1=new Random();
		int num1=r1.nextInt();
		System.out.println(num1);
		
		//����0~100֮����������������100
		int num2=r1.nextInt(100);
		System.out.println(num2);
	}

}
