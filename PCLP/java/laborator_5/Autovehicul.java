public class Autovehicul 
{
    
	private String nrInmatriculare;
	private double consumD0;
	private double consumPU;
	private double consumPA;
	private double consumTotal;

	public Autovehicul(String nrInmatriculare, double consumD0, double consumPU, double consumPA) 
    {
		this.nrInmatriculare = nrInmatriculare;
		this.consumD0 = consumD0;
		this.consumPU = consumPU;
		this.consumPA = consumPA;
		this.consumTotal = 0;
	}

	public String getNrInmatriculare() 
    {
		return nrInmatriculare;
	}

	public double getConsumD0() 
    {
		return consumD0;
	}

	
	public double getConsumPU() 
    {
		return consumPU;
	}

		public double getConsumPA() 
    {
		return consumPA;
	}
	
	
	
	public double getConsumTotal() 
    {
		return consumTotal;
	}

	
	public void setConsumTotal(double consumTotal) 
    {
		this.consumTotal = consumTotal;
	}

	
	
	@Override
	public String toString() 
    {
		return "Autovehicul [nrInmatriculare=" + nrInmatriculare + ", consumD0=" + consumD0 + ", consumPU=" + consumPU
				+ ", consumPA=" + consumPA + ", consumTotal=" + consumTotal + "]";
	}    
}
