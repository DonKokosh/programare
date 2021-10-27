public class Dreptunghi implements patrulater, Comparable<Dreptunghi>
{
	double lungime;
	double latime;
	double perimetru;
	double arie;


	public Dreptunghi(double lungime, double latime) {
		super();
		this.lungime = lungime;
		this.latime = latime;
	}

	@Override
	public double calculeazaPerimetru() {
		
		perimetru =2*(lungime+latime);
		return 	perimetru;
	}

	@Override
	public double calculeazaAria() {
		arie  = lungime*latime;
		return arie;
	}

	@Override
	public int compareTo(Dreptunghi o) {
		
		return (int) (calculeazaPerimetru()-o.calculeazaPerimetru());
	}
	
}
