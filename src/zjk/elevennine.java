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
  		
  		
  		//创建一个二维数组
  		int[][] array=new int[n][n];
  		
  		//下标[row]:行
  		//下标[column]:列
  		
  		//按行,循环赋值,并且输出
  		for(int row=0; row<array.length; row++) {
  			for(int column=0; column<array[row].length; column++) {      
  				
  				array[row][column]=(int) (Math.random()*2);
  				
  				System.out.print(" "+array[row][column] + " ");
  			}
  			
  			//换行
  			System.out.println();
  		}
  		
  //---------------------------------------------------------------------------------------		
  //先通过比较，知道哪一行的和最大
  		
  		//用数组列表来存储——最大值下标
  		ArrayList<Integer> list1=new ArrayList<>();
  		
  		
  		int maxRow1=0;//"行最大值"——(一行的元素相加得到的最大值)
  		int maxIndex1=0;//"行最大值的下标 "——(若某一行具有最大值，则将其下标赋值给maxIndex)    
  		
  		
  		//先计算第一行的和，并且先让它的和为最大值，它的下标为最大值下标。
  		//然后拿这个最大值 与 剩下的行的各自的和相比较，找出真正的最大值和最大值下标         
  		for(int column=0; column<array[0].length; column++) {
  			maxRow1 += array[0][column];
  			list1.add(maxIndex1);//先把 0下标暂时加入数组列表
  		}   
  		
  		
  		//一一比较找出真正的最大值和最大值下标    
  		
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
  //先通过比较，知道哪一列的和最大
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


