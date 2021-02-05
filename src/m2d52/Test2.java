package m2d52;

/**
 * �����쳣:
 * ��ָ���쳣 NullPointException
 * ����ת���쳣 ClassCastException
 * �����±�Խ���쳣 ArrayIndexOutOfBoundsException
 * ���ָ�ʽ���쳣 NumberFormatException
 * 
 * 
 * int String Integet��������ת��
 * 
 * 					 String                                      String
 * 						 ^									    	^
Integer.parseInt("123")| |����+""           Integer.ValueOf("123")| |
 * 					   | |									      | |
 * 					   | |String.valueOf(int)			  		  | |String.valueOf(Integer����)	
 * 					   V 								     	  V
 * 			        	int		  ---װ��Integer.ValueOf(100)--->Integer
 * 						          <--   ����intValue()����   ----			
 * @author yyds
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static int parseInt(String s)
		int ret1=Integer.parseInt("123");
		System.out.println(ret1);
		
		double ret2=Integer.parseInt("123.0");
		System.out.println(ret2);
		
		float ret3=Integer.parseInt("123.0");
		System.out.println(ret3);
		
		
		//String->int
		String s1="100";
		int i1=Integer.parseInt(s1);
		System.out.println(i1+1);
		
		//int->String
		String s2=i1+"123";
		System.out.println(s2+1);
		
		//int->Integer
		Integer x=100;
		
		//Integer->int
		int y=x;
		
		//String->Integer
		Integer in=Integer.valueOf("111");
		
		//Integer->String
		String str=String.valueOf(in);
		
		
	}

}
