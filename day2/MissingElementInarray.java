

package week1.day2;

import java.util.Arrays;

public class MissingElementInarray {

	public static void main(String[] args) {
		int[] ele= {9,4,7,5,1,3,2,8};
		Arrays.sort(ele);
		for (int i = 0; i<ele.length-1; i++) {
			if(ele[i]!=(i+1)) {
				System.out.println("missing number"+(i+1));
				break;
				
			}
		}
		
		
		
		

	}

}
