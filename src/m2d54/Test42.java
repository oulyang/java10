package m2d54;
import java.math.BigDecimal;
public class Test42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigDecimal属于大数据，精度极高，属于引用数据类型，专门用于财务软件
		
		BigDecimal v1=new BigDecimal(100);
		BigDecimal v2=new BigDecimal(200);
		//v1 v2都是引用，不能直接相加
		
		BigDecimal v3=v1.add(v2);
		System.out.println(v3);
		
		BigDecimal v4=v2.divide(v1);
		System.out.println(v4);
		
	}

}
