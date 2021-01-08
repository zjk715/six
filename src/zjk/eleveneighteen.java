package zjk;

import java.util.ArrayList;
import java.util.Scanner;

public class eleveneighteen {
	public static ArrayList<Character> toCharacterArray(String s){
	    ArrayList<Character> ass = new ArrayList<>();
	    for(int i=0;i<s.length();i++)
	        ass.add(s.charAt(i));
	    return ass;
	}

}
