package com.practice;

public class Pyramid {

	
	public static void main(String[] args) {
		
 		int sum=0;
 		
// 		int[] a = {1,2,3,4,5,6,7,8,9,10};
// 		
//		while(sum<5) {
//			
//			for(int i=0;i<=sum;i++) {
//				
//			System.out.print(a[i]+ " ");
//			}
//			sum= sum+1;
//			System.out.println(" ");
//		}
//		
//	}
//}
 		
 		



/*while(sum<5) {
	
	for(int i=0;i<=sum;i++) {
		
	System.out.print("* ");
	}
	sum= sum+1;
	System.out.println(" ");
}
	}}
 		*/
 		
 		while(sum<=5) {
			
 			for(int i=1; i<=sum; i++){
 				  for(int j=1; j<=i; j++){
 				  if((i+j)%2==1){
 				      System.out.print(" 0 ");
 				  }
 				  else{
 				      System.out.print(" 1 ");
 				  }
 				  
 				}
 					}
 					sum= sum+1;
 					System.out.println(" ");
 				}
 		}
 		}