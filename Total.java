import java.util.*;
public class Total {
	private int Totalcost;
	private final int RTO=113990;
	private final int tcscharge=11000;
	public int Totalcost() {
		CarPrice p=new CarPrice();
		int carprice=p.price();
		String discount;
		Scanner sc=new Scanner(System.in);
		int discount1;
		boolean insurance=p.checkinsurance();
		boolean accessories=p.checkAccessories();
		if(carprice==0) {
			System.out.println("Please select a valid model");
			return 0;
		}
		else
		{
			Totalcost+=carprice;
			int insurance1=0;
			int acessories1=0;
			if(insurance)
			{
				insurance1=47300;
				Totalcost+=insurance1;
			}
			if(accessories)
			{
				acessories1=15000;
				Totalcost+=acessories1;
			}
			Totalcost+=RTO;
			Totalcost+=tcscharge;
			System.out.println("Dealer discount:");
			discount=sc.next();
			int len=discount.length();
			if(discount.substring(len-1).equals("%"))
			{
				discount1=carprice*Integer.parseInt(discount.substring(0,len-1))/100;
			}
			else
			{
				discount1=Integer.parseInt(discount);
			}
			if(!(insurance || accessories))
			{
				discount1=0;
			}
			Totalcost-=discount1;
			System.out.println("Total cost"+Totalcost+"("+p.getmodelname()+ carprice + " + 1,13,990(RTO) + " + insurance1+"(Insurance) + " +
					"11,000(TCS)" +" + "+ acessories1 + "(Additional Accessories)" +"-"+ discount1 +"(Dealer discount)");
			return Totalcost;
		}
	}

}
