package StreamPrograms.non_string_programs;

public class ArmstrongNumber {
	
	public static void main(String[] args)
	{
		int num = 153;
		
		
	int result = String.valueOf(153).chars().map(a ->(int) Math.pow(Character.getNumericValue(a), String.valueOf(153).length())).sum();
	 if(result ==num)
	 {
		 System.out.println("Armstrong number "+num);
	 }
	 else
	 {
		 System.out.println("Not a armstrong");
	 }
	}

}
