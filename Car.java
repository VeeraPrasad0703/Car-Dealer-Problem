import java.util.*;
public class Car extends Total{
	private static String model;
	Scanner sc=new Scanner(System.in);
	public String getmodel()
	{
		System.out.println("Select any model available:");
		this.model=sc.nextLine();
		return model;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Available car models");
		System.out.println("Polo Trendline");
		System.out.println("Polo Highline");
		System.out.println("virtus Trendline");
		System.out.println("Virtus Highline");
		System.out.println("Taigan Trendline");
		System.out.println("Taigun Highline");
		System.out.println("Taigun Topline");
		Total t=new Total();
		int Totalcost=t.Totalcost();
		if(Totalcost==0)
			System.exit(0);
	}

}
