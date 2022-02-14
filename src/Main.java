public class Main
{
    public static void main(String[] args)
    {
	double shippingCost = 0;
    double totalCost = 0;
    double itemPrice =104;

        System.out.println("Enter the price of an item: " + "$" + itemPrice );
            totalCost = totalCost + itemPrice;
            if (itemPrice < 100)
            {
                shippingCost = totalCost * .02;
            }
            else
            {
                shippingCost = 0;
            }
        System.out.println("The total cost of your item is : " + "$" + totalCost);
        System.out.println("With a shipping cost of: " + "$" + shippingCost);
    }
}
