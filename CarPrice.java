import java.util.*;
public class CarPrice {
		private String model;
		public String getmodelname()
		{
			return this.model;
		}
		public int price()
		{
			model=new Car().getmodel();
			if(model.equals("Polo Trendline"))
				return 870000;
			else if(model.equals("Polo Highline"))
				return 1009000;
			else if(model.equals("virtus Trendline"))
				return 1105000;
			else if(model.equals("Virtus Highline"))
				return 1308000;
			else if(model.equals("Taigan Trendline"))
				return 1489000;
			else if(model.equals("Taigun Highline"))
				return 1542000;
			else if(model.equals("Taigun Topline"))
				return 1771000;
			else
				return 0;
		}
		Scanner sc=new Scanner(System.in);
		public boolean checkinsurance()
		{
			System.out.println("select yes for insurance");
			String s=sc.next();
			if(s.equalsIgnoreCase("yes"))
				return true;
			return false;
		}
		public boolean checkAccessories()
		{
			System.out.println("Select yes for Accessories");
			String s=sc.next();
			if(s.equalsIgnoreCase("yes"))
				return true;
			return false;
		}
		
}
