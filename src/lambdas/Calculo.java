package lambdas;

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a,double b);
	 
	default String legal() {
		return "legal";
	}
	
	static String muitolegal() {
		return "muito legal";
	}
	
}
