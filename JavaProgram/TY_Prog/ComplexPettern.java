package TY_Prog;

public class ComplexPettern {
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		int n=12;
//		int ele=12;
//		int sp=0;
//		
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <=ele; j++) {
//				System.out.print("*"+" ");
//				if(j==ele/2) {
//					for (int j2 = 1; j2 <=sp; j2++) {
//						System.out.print("  ");
//					}
//				}
//				 
//								 
//			}
//			if(i<n/2) {
//				sp=sp+2;
//				ele=ele-2;
//			}else {
//				sp=sp-2;
//				ele=ele+2;
//			}
//			
//			System.out.println();
//			
//		}
		
//	          * 
//	        * * * 
//	      * * * * * 
//	    * * * * * * * 
//	  * * * * * * * * * 
//	    * * * * * * * 
//	      * * * * * 
//	        * * * 
//	          * 
		
		 
//	          * 
//	        *   * 
//	      *       * 
//	    *           * 
//	  *               * 
//	    *           * 
//	      *       * 
//	        *   * 
//	          * 
		
		
//		int n=10;
//		int ele=1;
//		int sp=n/2;
//		
//		for (int i = 1; i <=n; i++) {
//			 for (int j = 1; j <=sp; j++) {
//				 System.out.print("  ");
//				
//			}
//			 for (int j = 1; j <=ele; j++) {
//				 
//				if(j==1||j==ele) {
//					System.out.print("*"+" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//	 
//			if(i<n/2) {
//				sp--;
//				ele=ele+2;
//			}else {
//				sp++;
//				ele=ele-2;
//			}
//			
//			System.out.println();
//			
//		}
		
//		
//		* * * * * * * 
//		  * * * * * 
//		    * * * 
//		      * 
//		    * * * 
//		  * * * * * 
//		* * * * * * *
		
//		* * * * * * * 
//		  *       * 
//		    *   * 
//		      * 
//		    *   * 
//		  *       * 
//		* * * * * * * 
		
//		int n=7;
//		int ele=7;
//		int sp=0;
//		
//		for (int i = 1; i <=n; i++) {
//			 for (int j = 1; j <=sp; j++) {
//				 System.out.print("  ");
//				
//			}
//			 for (int j = 1; j <=ele; j++) {
////				 System.out.print("*"+" ");
//				 
//				if(j==1||j==ele|| i==1 || i==n) {
//					System.out.print("*"+" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//	 
//			if(i<=n/2) {
//				sp++;
//				ele=ele-2;
//				
//			}else {
//				sp--;
//				ele=ele+2;
//			}
//			
//			System.out.println();
//			
//		}
		
//		* * * * * * * 
//		*           * 
//		*           * 
//		*           * 
//		*           * 
//		*           * 
//		* * * * * * *
		
//	 
//		for (int i = 1; i <=n; i++) {
//			 
//			 for (int j = 1; j <=n; j++) {
//				  
//				 if(i==1 || j==1 || i==n || j==n ) {
//					 System.out.print("*"+" ");
//				 }else {
//					 System.out.print("  ");
//				 }
//			}
//	 
//		 
//			 
//			
//			System.out.println();
//			
//		}
		
//		* * * * * * * * * * 
//		* *           *   * 
//		*   *       *     * 
//		*     *   *       * 
//		*       *         * 
//		*     *   *       * 
//		*   *       *     * 
//		* *           *   * 
//		*               * * 
//		* * * * * * * * * *
		
//		* * * * * * * * * * 
//		* *             * * 
//		*   *         *   * 
//		*     *     *     * 
//		*       * *       * 
//		*       * *       * 
//		*     *     *     * 
//		*   *         *   * 
//		* *             * * 
//		* * * * * * * * * * 
		
//		 int n=10;
//			for (int i = 1; i <=n; i++) {
//				 
//				 for (int j = 1; j <=n; j++) {
//					  
//					 if(i==1 || j==1 || i==n || j==n ||   j==i|| j==n-i+1) {
//						 System.out.print("*"+" ");
//						// Thread.sleep(500);
//					 }else {
//						 System.out.print("  ");
//					 }
//				}
//		 
//			 
//				 
//				
//				System.out.println();
//				
//			}
		
//		int n=7;
//		int ele=7;
//		int sp=0;
//		
//		for (int i = 1; i <=n; i++) {
//			 for (int j = 1; j <=sp; j++) {
//				 System.out.print("  ");
//				
//			}
		
		
//		*                         * 
//		* *                     * * 
//		* * *                 * * * 
//		* * * *             * * * * 
//		* * * * *         * * * * * 
//		* * * * * *     * * * * * * 
//		* * * * * * * * * * * * * * 
//		* * * * * *     * * * * * * 
//		* * * * *         * * * * * 
//		* * * *             * * * * 
//		* * *                 * * * 
//		* *                     * * 
//		*                         * 
		     
		int n=11;
		int ele=2;
		int sp=n-2;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=ele; j++) {
			  		 System.out.print("*"+" ");
			  		 
			  		 if(j==ele/2) {
			  			for (int k = 1; k <=sp; k++) {
							System.out.print("  ");
						}
			  		 }
			  		 
			}
			
			if(i<n/2) {
				sp=sp-2;
				ele=ele+2;
			}
			else {
				sp=sp+2;
				ele=ele-2;
			}
			
			System.out.println();
			
		}
		
 
		
	}

}
