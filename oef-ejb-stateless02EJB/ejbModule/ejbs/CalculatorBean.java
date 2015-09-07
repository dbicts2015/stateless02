package ejbs;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculatorBean
 */
@Stateless
public class CalculatorBean implements CalculatorBeanLocal {

    /**
     * Default constructor. 
     */
    public CalculatorBean() {
        // TODO Auto-generated constructor stub
    }
    
    public int optellen(int a, int b) {
    	return a + b;
    }

}
