class DiscountFee
{
	public static void main(String args[])
	{
		int fee = 125000;
		int discountPercentage = 10;
		double discount = ((double)fee * discountPercentage) / 100;
		double discountedFee = fee - discount;
	System.out.println(" The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}
