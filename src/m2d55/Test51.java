package m2d55;
import java.util.Arrays;
import java.util.Random;
public class Test51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//随机产生5个不同的随机数，将他们放入数组中
		Random r=new Random();//生成随机数对象
		int[] arr=new int[5];//创建数组
		//初始化数组
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		int index=0;
		while(index<arr.length) {
			int num=r.nextInt(100);
			
			if(!contains(arr,num)) {
				arr[index]=num;
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	//判断数组内是否包含某个元素
	public static boolean contains(int[] arr,int ele) {
		/*
		 * //对数组升序排序 Arrays.sort(arr);//排序有问题
		 *  //二分法查找 return Arrays.binarySearch(arr,ele)>=0;
		 */
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return true;
			}
		}
		return false;
	}
}
