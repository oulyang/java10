package m2d54;
import java.math.BigDecimal;
public class Test42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigDecimal���ڴ����ݣ����ȼ��ߣ����������������ͣ�ר�����ڲ������
		
		BigDecimal v1=new BigDecimal(100);
		BigDecimal v2=new BigDecimal(200);
		//v1 v2�������ã�����ֱ�����
		
		BigDecimal v3=v1.add(v2);
		System.out.println(v3);
		
		BigDecimal v4=v2.divide(v1);
		System.out.println(v4);
		
	}

}
