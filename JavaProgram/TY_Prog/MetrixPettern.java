package TY_Prog;

public class MetrixPettern {
	
	public static void main(String[] args) {
		int n=5;
//		for (int i = 0; i <n; i++) {
//			  
//			for (int j = 0; j < n; j++) {
//				
//				System.out.print("*"+" ");
//				
//			}
//			System.out.println();
//		}
	
//		0,0  0,1  0,2  0,3  0,4  
//		1,0  1,1  1,2  1,3  1,4  
//		2,0  2,1  2,2  2,3  2,4  
//		3,0  3,1  3,2  3,3  3,4  
//		4,0  4,1  4,2  4,3  4,4  
		
		
//		for (int i = 0; i <n; i++) {
//			  
//			for (int j = 0; j < n; j++) {
//				
//				System.out.print(i+","+j+"  ");
//				
//			}
//			System.out.println();
//		}
		
//		A  A  A  A  A  
//		B  B  B  B  B  
//		C  C  C  C  C  
//		D  D  D  D  D  
//		E  E  E  E  E  

		
//		for (int i = 0; i <n; i++) {
//			  
//			for (int j = 0; j < n; j++) {
//				
//				System.out.print((char)(i+65)+"  ");
//				
//			}
//			System.out.println();
//		}
	
//		A  B  C  D  E  
//		A  B  C  D  E  
//		A  B  C  D  E  
//		A  B  C  D  E  
//		A  B  C  D  E 
		
//		for (int i = 0; i <n; i++) {
//			  
//			for (int j = 0; j < n; j++) {
//				
//				System.out.print((char)(j+65)+"  ");
//				
//			}
//			System.out.println();
//		}
//		
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * * * 
		
		
//		for (int i = 0; i <=n; i++) {
//			  
//			for (int j = 0; j <=i; j++) {
//				
//				System.out.print("*"+" ");
//				
//			}
//			System.out.println();
//		}
		
//		0 
//		1 1 
//		0 0 0 
//		1 1 1 1 
//		0 0 0 0 0 
//		1 1 1 1 1 1 
		
//		for (int i = 0; i <=n; i++) {
//			  
//			for (int j = 0; j <=i; j++) {
//				
//				System.out.print(i%2+" ");
//				
//			}
//			System.out.println();
//		}
		
//		0 
//		0 1 
//		0 1 0 
//		0 1 0 1 
//		0 1 0 1 0 
//		0 1 0 1 0 1
		
//		for (int i = 0; i <=n; i++) {
//			  
//			for (int j = 0; j <=i; j++) {
//				
//				System.out.print(j%2+" ");
//				
//			}
//			System.out.println();
//		}
		
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//     	* 
      	
//		for (int i = n; i >=0; i--) {
//			  
//			for (int j = 0; j<=i; j++) {
//				
//				if(j==1 || j==i || i==1 || i==n) {				
//				System.out.print("*"+" ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
//		* * * * * * 
//		  * * * * * 
//		    * * * * 
//		      * * * 
//		        * * 
//		          * 
		
//		for (int i = n; i >=0; i--) {
//			for (int j = 0; j <n-i; j++) {
//				System.out.print("  ");
//			}
//			  
//			for (int j = 0; j<=i; j++) {
//				
//				System.out.print("*"+" ");
//				
//			}
//			System.out.println();
//		}

		
//	      * 
//	     * * 
//	    * * * 
//	   * * * * 
//	  * * * * * 
//	 * * * * * * 	
//		for (int i =0; i <=n; i++) {
//			for (int j = 0; j <n-i; j++) {
//				System.out.print(" ");
//			}
//			  
//			for (int j = 0; j<=i; j++) {
//				
//				System.out.print("*"+" ");
//				
//			}
//			System.out.println();
//		}
		
//		* * * * * * 
//		 * * * * * 
//		  * * * * 
//		   * * * 
//		    * * 
//		     * 
		
//		for (int i =n; i >=0; i--) {
//			for (int j = 0; j <n-i; j++) {
//				System.out.print(" ");
//			}
//			  
//			for (int j = 0; j<=i; j++) {
//				
//				System.out.print("*"+" ");
//				
//			}
//			System.out.println();
//		}
		
		
//		* * * * * * 
//		 * * * * * 
//		  * * * * 
//		   * * * 
//		    * * 
//		     * 
		
		
//		for (int i =n; i >=0; i--) {
//			for (int j = 0; j <n-i; j++) {
//				System.out.print(" ");
//			}
//			  
//			for (int j = 0; j<=i; j++) {
//				
//				System.out.print("*"+" ");
//				
//			}
//			System.out.println();
//		}
		
		
//	     1 
//	    2 2 
//	   3 3 3 
//	  4 4 4 4 
//	 5 5 5 5 5 
		
//		for (int i =0; i <=n; i++) {
//			for (int j = 0; j <n-i; j++) {
//				System.out.print(" ");
//			}
//			  
//			for (int j = 1; j<=i; j++) {
//				
//				System.out.print(i+" ");
//				
//			}
//			System.out.println();
//		}
		
		
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 
		
//		for (int i =1; i <=n; i++) {
////		for (int j = 0; j <n-i; j++) {
////			System.out.print(" ");
////		}
//		  
//		for (int j = 1; j<=i; j++) {
//			
//			System.out.print(i+" ");
//			
//		}
//		System.out.println();
//	}
		
//		for (int i =1; i <=n; i++) {
//	for (int j = 0; j <n-i; j++) {
//		System.out.print(" ");
//	}
			
//			5 
//			5 4 
//			5 4 3 
//			5 4 3 2 
//			5 4 3 2 1 
			
			
//	  int k=5;
//	for (int j = 1; j<=i; j++) {
//		
//		System.out.print(k+" ");
//		k--;
//		
//	}
//	System.out.println();
//}
			
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1		
		
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= n - i; j++) {
//					System.out.print("  ");
//				}
//				int x = 1;
//				for (int j = 1; j <= (2*i - 1); j++) {
//					System.out.print(x + " ");
//					if (j <= (i * 2 - 1) / 2) {
//						x++;
//					} else {
//						x--;
//					}
//
//				}
//				System.out.println();
//			}
		
		
//		A  B  C  D  E  
//		F  G  H  I  J  
//		K  L  M  N  O  
//		P  Q  R  S  T  
//		U  V  W  X  Y 
		
//		int x=65;
//		for (int i = 0; i <n; i++) {
//		  
//			
//		for (int j = 0; j < n; j++) {
//			
//			System.out.print((char)(x)+"  ");
//			x++;
//			
//		}
//		System.out.println();
//	}
		
		
	//	or
		
//		A  B  C  D  E  
//		F  G  H  I  J  
//		K  L  M  N  O  
//		P  Q  R  S  T  
//		U  V  W  X  Y 
		
//		char x='A';
//		for (int i = 0; i <n; i++) {
//		  
//			
//		for (int j = 0; j < n; j++) {
//			
//			System.out.print(x++ +"  ");
//		 
//		}
//		System.out.println();
//	}
		
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 
		
//		
//		for (int i = 0; i <=n; i++) {
//		  
//		for (int j = 0; j <=i; j++) {
//			
//			System.out.print((char)(j+65)+" ");
//			
//		}
//		System.out.println();
//	}	
		
		
	 	
	}

}

