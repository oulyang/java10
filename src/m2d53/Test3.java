package m2d53;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Test3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Date nowTime=new Date();
		System.out.println(nowTime);
		
		//SimpleDateFormat��java.text����ר�Ÿ������ڸ�ʽ��
		/*  y M d H m s S���ܱ䣬��ʽ����
		 *  yyyy��
		 *  MM��
		 *  dd��
		 *  HHʱ
		 *  mm��
		 *  ss��
		 *  SSS����
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println(sdf.format(nowTime));
		
		String time="2020-2-5 08:08:08 888";
		//��ʽ�������д��Ҫ���ַ�����ʽ��ͬ
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date dt=sdf1.parse(time);
		System.out.println(dt);
		
		//��ȡ1970.1.1 00��00��00 001
		Date t1=new Date(1);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String strt2=sdf2.format(t1);
		System.out.println(strt2);
		
		//��ȡ�����ʱ��
		Date t2= new Date(System.currentTimeMillis()-24*60*60*1000);
		String strt3=sdf2.format(t2);
		System.out.println(strt3);
		
	}

}
