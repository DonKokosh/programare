public class Arbore 
{
	private String denumire;
	private String gen;
	private int inaltime;
	private int varsta;
	private String tipFrunza;
	
	public Arbore(String denumire, String gen, int inaltime, int varsta, String tipFrunza) 
    {
		super();
		this.denumire = denumire;
		this.gen = gen;
		this.inaltime = inaltime;
		this.varsta = varsta;
		this.tipFrunza = tipFrunza;
	}

	public String getDenumire() 
    {
		return denumire;
	}

	public void setDenumire(String denumire) 
    {
		this.denumire = denumire;
	}

	public String getGen() 
    {
		return gen;
	}

	public void setGen(String gen) 
    {
		this.gen = gen;
	}

	public int getInaltime() 
    {
		return inaltime;
	}

	public void setInaltime(int inaltime) 
    {
		this.inaltime = inaltime;
	}

	public int getVarsta() 
    {
		return varsta;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getTipFrunza() 
    {
		return tipFrunza;
	}

	public void setTipFrunza(String tipFrunza) 
    {
		this.tipFrunza = tipFrunza;
	}
	
	
	
	
}
