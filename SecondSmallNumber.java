package seleninumSample;

public class SecondSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec, size;
		int array[] = {10,25,36,24,42,76};
		size = array.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					sec =array[i];
					array[i]=array[j];
					array[j]=sec;
					
					
				}
			}
		
		}
          System.out.println(" Second Smallest Number in array:" +array[0]);
	}

}
