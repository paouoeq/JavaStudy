package exam02;

import java.util.Scanner;

public class Break_Continue {
	
	public static void main(String[] args) {
		
		// 반복문의 break/continue
		for(int n = 1;n<6; n++ ){
            if(n==3)break;
            System.out.println("hello: "+ n);
        }

        for(int n = 1;n<6; n++ ){
        	System.out.println("world1: "+ n);
            if(n==3) continue;
            System.out.println("world2: "+ n);
            System.out.println("world3: "+ n);
        }

	}
}
