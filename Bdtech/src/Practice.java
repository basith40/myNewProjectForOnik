import java.util.Arrays;

public class Practice { 
	
     public static void main(String[] args){
    	int [] numbers = {12,23,34,45,56,67};
    	System.out.println("origanal arrays : "+Arrays.toString(numbers));
    	int removeIndex = 4;
    	for (int i = removeIndex; i < numbers.length - 1; i++) {
			numbers [i]= numbers[i+1];
		}
    	System.out.println("after removeing arrays : "+Arrays.toString(numbers));
    	  
    	  
     } 	

}
