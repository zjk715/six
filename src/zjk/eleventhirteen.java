package zjk;

import java.util.ArrayList;
import java.util.Scanner;

public class eleventhirteen {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//����һ������ list
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.print("Enter 10 integers: ");
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		int n4=input.nextInt();
		int n5=input.nextInt();
		int n6=input.nextInt();
		int n7=input.nextInt();
		int n8=input.nextInt();
		int n9=input.nextInt();
		int n10=input.nextInt();
		
		input.close(); 
		
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.add(n6);
		list.add(n7);
		list.add(n8);
		list.add(n9);
		list.add(n10);
		
		//ȥ���ظ�������
		removeDuplicate(list);
		
 
	}
 
	
	public static void removeDuplicate(ArrayList<Integer> list) {      
		
		ArrayList<Integer> newList=new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			//���"������"����newList��û�� "������"����list���Ԫ��ֵ
			//������Ԫ�ؼ���"������"����newList����     
			if( !newList.contains(list.get(i)) ) {   
				newList.add(list.get(i));
			}
		}
		
		
		
	
		
		//�����ʽ����
		System.out.print("The distinct integers are ");
		for(int i=0; i<newList.size(); i++) {
			System.out.print(" " + newList.get(i));
		}
	}
}
