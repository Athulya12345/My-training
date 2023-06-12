package superkeyword;

public class Season {
	int amount;
	float discount;
	void onseason(int amount)
	{
		this.amount=amount;
		discount=amount*0.20f;
		
		System.out.println(discount);
	}

}
