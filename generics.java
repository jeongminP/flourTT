package hw0124;

public class generics<T extends Number>{
	public <T extends Number>double add(T a,T b){
		double v1 = a.doubleValue();
		double v2 = b.doubleValue();
		
		return v1+v2;
	}
	public <T extends Number>double sub(T a,T b){
		double v1 = a.doubleValue();
		double v2 = b.doubleValue();
		
		return v1-v2;
	}
	public <T extends Number>double mul(T a,T b){
		double v1 = a.doubleValue();
		double v2 = b.doubleValue();
		
		return v1*v2;
		
	}
	public <T extends Number>double div(T a,T b){
		double v1 = a.doubleValue();
		double v2 = b.doubleValue();
		
		return v1/v2;
	}
}