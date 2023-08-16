package seleninumSample;

public class ConvertPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posVal=123;
		int negVal=((posVal -1));
		System.out.println("Positive value converted to Negative = " +negVal);
		posVal=(negVal - 1);
		System.out.println("Acutal Positive Value =" +posVal);
		negVal=-456;
		System.out.println("Actual Negative Value =" +negVal);
		System.out.println("Negative value converted to Positive=" +posVal);
	}

}
