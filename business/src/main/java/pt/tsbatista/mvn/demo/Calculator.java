package pt.tsbatista.mvn.demo;

/**
 * Simple calculator that does pretty much nothing!
 *
 * @author tsbatista
 */
public class Calculator {

    /**
     * Add two numbers
     *
     * @param operand1
     * @param operand2
     * @return the addition of the two numbers
     */
    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }

    /**
     * Multiply two numbers
     * @param operand1
     * @param operand2
     * @return The result of a simple integer multiplication
     */
    public Integer multiply(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }

}
