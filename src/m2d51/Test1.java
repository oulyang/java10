package m2d51;

/**
 * java中8中基本数据类型对应了8种包装类型，包装类型属于引用类型，父类是Object
 * 
 * 8种包装类已写好，可以直接用
 * java.lang.Short(Number)
 * java.lang.Byte(Number)
 * java.lang.Integer(Number)
 * java.lang.Long(Number)
 * java.lang.Float(Number)
 * java.lang.Double(Number)
 * java.lang.Boolean(Object)
 * java.lang.Character(Object)
 * 
 * Number类中有以下方法(拆箱)
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
		Integer i=new Integer(111);//基本数据类型————>引用数据类型(装箱)
		float f=i.floatValue();//引用数据类型————>基本数据类型（拆箱）
		System.out.println(f);*/
	
	public static void main(String[] args) {
		
		//为提高程序执行效率，java将-128~127之间的所有包装对象创建好，放入方法去区的“整数型常量池”，
		//目的是只要使用这个区间内的数据不需要new，而是直接取出
		Integer a=128;
		Integer b=128;
		System.out.println(a==b);
		
		Integer x=127;
		Integer y=127;
		System.out.println(x==y);
	}
	
}
