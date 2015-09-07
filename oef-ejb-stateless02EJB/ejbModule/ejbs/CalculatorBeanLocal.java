package ejbs;

import javax.ejb.Local;

@Local
public interface CalculatorBeanLocal {

	public abstract int optellen(int a, int b);

}
