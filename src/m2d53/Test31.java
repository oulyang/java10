package m2d53;

/**
 * System.out.println() out��System��ľ�̬������println��PrintStream��ķ���
 * System.gc()  ������������������
 * System.currentTimeMillis() ��ȡ1970-1-1 0��0��0 000����ĺ�����
 * System.exit() �˳�JVM
 * 
 * @author yyds
 *
 */
public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡ1970-1-1 0��0��0 000����ĺ�����
		long nowTimeMillis=System.currentTimeMillis();
		System.out.println(nowTimeMillis);
		
		//ͳ��һ��������ʱ
		long beginTimeMillis=System.currentTimeMillis();
		print();
		long endTimeMillis=System.currentTimeMillis();
		System.out.println("�ķ�"+(endTimeMillis-beginTimeMillis)+"ms");
		
		
	}
	
	public static void print() {
		for(int i=0;i<100;i++) {
			System.out.println("i="+i);
		}
	}

}
