package m2d51;

/**
 * java��8�л����������Ͷ�Ӧ��8�ְ�װ���ͣ���װ���������������ͣ�������Object
 * 
 * 8�ְ�װ����д�ã�����ֱ����
 * java.lang.Short(Number)
 * java.lang.Byte(Number)
 * java.lang.Integer(Number)
 * java.lang.Long(Number)
 * java.lang.Float(Number)
 * java.lang.Double(Number)
 * java.lang.Boolean(Object)
 * java.lang.Character(Object)
 * 
 * Number���������·���(����)
 * 
 * public abstract int intValue();
 * public abstract long longValue();
 * public abstract float floatValue();
 * public abstract double doubleValue();
 * public byte byteValue() {
        return (byte)intValue();
    }
   public short shortValue() {
        return (short)intValue();
    }
 * @author yyds
 *
 */
public class Test1 {

	/*
	 * public static void main(String[] args) { 
	 * 		// TODO Auto-generated method stub
	 *		 MyInt mi=new MyInt(100); 
	 *		 dosome(mi); }
	 * 
	 * public static void dosome(Object obj) { 
	 * 		System.out.println(obj); }
	 */
	
/*	public static void main(String[] args) {
		Integer i=new Integer(111);//�����������͡�������>������������(װ��)
		float f=i.floatValue();//�����������͡�������>�����������ͣ����䣩
		System.out.println(f);*/
	
	public static void main(String[] args) {
		
		//Ϊ��߳���ִ��Ч�ʣ�java��-128~127֮������а�װ���󴴽��ã����뷽��ȥ���ġ������ͳ����ء���
		//Ŀ����ֻҪʹ����������ڵ����ݲ���Ҫnew������ֱ��ȡ��
		Integer a=128;
		Integer b=128;
		System.out.println(a==b);
		
		Integer x=127;
		Integer y=127;
		System.out.println(x==y);
	}
	
}
