

public class Discount
{
   public static void main(String[] args)
  {
     double i = 0,amount =12000,dis=0;
	if(amount<=10000)
	{
	   i=amount*0.25;
	   dis=amount-i;
	   System.out.println("Discount amount = " + i);
	   System.out.println("total = " + dis);
	}
	else
	{
	   System.out.println("amount = " + amount);
	}
  }
}
	
     
