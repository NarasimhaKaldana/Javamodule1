package oopsday3;

public class Calc2 implements mathIface {

	private Calc num =new Calc(50);
	@Override
	public int factorial(int n) {
		// TODO Auto-generated method stub
		int f = 1;
		for(int i=1;i<=num.getN();i++) {
			f = f*i;
			
		}
		return f;
	}

	@Override
	public int primeOrnot(int n) {
		// TODO Auto-generated method stub
		int flag=0, count=0;
		for(int i=0;i<=n;i++)
		{
			if(num.getN()%i == 0)
				{
				count++;
				}
				}
		
		if(count==2)
			flag=1;
		else
			flag=0;
	}

	@Override
	public int armstrong(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int evenOrodd(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
