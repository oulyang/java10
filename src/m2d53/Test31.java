package m2d53;

/**
 * System.out.println() out是System类的静态变量，println是PrintStream类的方法
 * System.gc()  建议启动垃圾回收器
 * System.currentTimeMillis() 获取1970-1-1 0：0：0 000至今的毫秒数
 * System.exit() 退出JVM
 * 
 * @author yyds
 *
 */
public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取1970-1-1 0：0：0 000至今的毫秒数
		long nowTimeMillis=System.currentTimeMillis();
		System.out.println(nowTimeMillis);
		
		//统计一个方法耗时
		long beginTimeMillis=System.currentTimeMillis();
		print();
		long endTimeMillis=System.currentTimeMillis();
		System.out.println("耗费"+(endTimeMillis-beginTimeMillis)+"ms");
		
		
	}
	
	public static void print() {
		for(int i=0;i<100;i++) {
			System.out.println("i="+i);
		}
	}

}
