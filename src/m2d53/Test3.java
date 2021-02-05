package m2d53;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Test3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Date nowTime=new Date();
		System.out.println(nowTime);
		
		//SimpleDateFormat是java.text包下专门负责日期格式化
		/*  y M d H m s S不能变，格式随意
		 *  yyyy年
		 *  MM月
		 *  dd日
		 *  HH时
		 *  mm分
		 *  ss秒
		 *  SSS毫秒
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println(sdf.format(nowTime));
		
		String time="2020-2-5 08:08:08 888";
		//格式不能随便写，要与字符串格式相同
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date dt=sdf1.parse(time);
		System.out.println(dt);
		
		//获取1970.1.1 00：00：00 001
		Date t1=new Date(1);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String strt2=sdf2.format(t1);
		System.out.println(strt2);
		
		//获取昨天的时间
		Date t2= new Date(System.currentTimeMillis()-24*60*60*1000);
		String strt3=sdf2.format(t2);
		System.out.println(strt3);
		
	}

}
