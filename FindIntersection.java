package seleninumSample;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int Arr1[]= {12,25,36,43,52};
     int Arr2[]= {43,67,52,77,98};
     System.out.println("Intersection of the arrays :");
     for(int i=0;i<Arr1.length;i++)
     {
    	 for(int j=0;j<Arr2.length;j++)
    	 {
    		 if(Arr1[i]==Arr2[j])
    		 {
    			 System.out.println(Arr2[j]);
    		 }
    	 }
     }
	}

}
