package m2d55;
import java.util.Arrays;
import java.util.Random;
public class Test51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//�������5����ͬ��������������Ƿ���������
		Random r=new Random();//�������������
		int[] arr=new int[5];//��������
		//��ʼ������
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
	
	//�ж��������Ƿ����ĳ��Ԫ��
	public static boolean contains(int[] arr,int ele) {
		/*
		 * //�������������� Arrays.sort(arr);//����������
		 *  //���ַ����� return Arrays.binarySearch(arr,ele)>=0;
		 */
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return true;
			}
		}
		return false;
	}
}
