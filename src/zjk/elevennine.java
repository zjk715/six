package zjk;
import java.util.ArrayList;
import java.util.Scanner;
public class elevennine {
	
      public static void main(String[] args)
	    {
    	  Scanner input=new Scanner(System.in);
  		System.out.print("Enter the array size n: ");
  		int n=input.nextInt();
  		
  		input.close();
  		
  		System.out.println("The random array is : ");
  		
  		
  		//����һ����ά����
  		int[][] array=new int[n][n];
  		
  		//�±�[row]:��
  		//�±�[column]:��
  		
  		//����,ѭ����ֵ,�������
  		for(int row=0; row<array.length; row++) {
  			for(int column=0; column<array[row].length; column++) {      
  				
  				array[row][column]=(int) (Math.random()*2);
  				
  				System.out.print(" "+array[row][column] + " ");
  			}
  			
  			//����
  			System.out.println();
  		}
  		
  //---------------------------------------------------------------------------------------		
  //��ͨ���Ƚϣ�֪����һ�еĺ����
  		
  		//�������б����洢�������ֵ�±�
  		ArrayList<Integer> list1=new ArrayList<>();
  		
  		
  		int maxRow1=0;//"�����ֵ"����(һ�е�Ԫ����ӵõ������ֵ)
  		int maxIndex1=0;//"�����ֵ���±� "����(��ĳһ�о������ֵ�������±긳ֵ��maxIndex)    
  		
  		
  		//�ȼ����һ�еĺͣ������������ĺ�Ϊ���ֵ�������±�Ϊ���ֵ�±ꡣ
  		//Ȼ����������ֵ �� ʣ�µ��еĸ��Եĺ���Ƚϣ��ҳ����������ֵ�����ֵ�±�         
  		for(int column=0; column<array[0].length; column++) {
  			maxRow1 += array[0][column];
  			list1.add(maxIndex1);//�Ȱ� 0�±���ʱ���������б�
  		}   
  		
  		
  		//һһ�Ƚ��ҳ����������ֵ�����ֵ�±�    
  		
  		for(int row=0; row<array.length; row++) {
  			
  			int total=0;
  			for(int column=0; column<array[row].length; column++) {
  				total += array[row][column];
  			}
  				
  			if(maxRow1<total) {
  				list1.clear();
  				maxRow1=total;
  				maxIndex1=row;
  				list1.add(maxIndex1);
  				
  			}
  			else if(maxRow1==total) {
  				list1.add(row);
  			}
  			
  		}
  		
  		
  		System.out.println("The largest row index: "+list1.toString());  
  		
  //--------------------------------------------------------------------------------------		
  //��ͨ���Ƚϣ�֪����һ�еĺ����
  		ArrayList<Integer> list2=new ArrayList<>();
  		
  		int maxColumn=0;
  		int MaxIndex=0;
  		
  		for(int row=0; row<array.length; row++) {
  			maxColumn += array[row][0];
  			list2.add(MaxIndex);
  		}
  		
  		
  		for(int column=1; column<array[1].length; column++) {
  			
  			int all=0;
  			for(int row=0; row<array.length; row++) {
  				all += array[row][column];
  			}
  			
  			if(maxColumn<all) {
  				list2.clear();
  				maxColumn=all;
  				MaxIndex=column;
  				list2.add(MaxIndex);
  			}
  			else if(maxColumn==all) {
  				list2.add(column);
  			}
  		}
  		
  		System.out.println("The largest column index: "+list2.toString());
  		
  		
	}
}


