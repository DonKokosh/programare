public class patrat implements patrulater, Comparable<patrat>
{
	private double latura;	
	
	public patrat(double latura) {
		super();
		this.latura = latura;
	}


	public double calculeazaPerimetru()
	{
		return 4*latura;
	}
	
	public double calculeazaAria()
	{
		return latura*latura;
	}

	
	@Override
	public int compareTo(patrat o) 
    {
		if(this.calculeazaAria()<o.calculeazaAria())
			return 1;
		else if(this.calculeazaAria()== o.calculeazaAria())
			return 0;
		else
			return -1;
	}

	@Override
	public String toString() 
    {
		return "Patrat [aria=" + calculeazaAria() + "]";
	}
	
	
	
}