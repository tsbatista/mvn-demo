/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.tsbatista.mvn.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author tsbatista
 */
public class CalculatorTest {

    private static final Logger LOG = LoggerFactory.getLogger(CalculatorTest.class);
    private final Calculator sut;

    public CalculatorTest() {
        // sut is stateless and thread safe so we need only one of these
        // do not assume the above for your own systems!
        sut = new Calculator();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(dataProvider = "test")
    public void addTest(int a, int b) {
        int result = sut.add(a, b);
        LOG.debug("The sum of '" + a + "' and '" + b + "' is '" + result + "'");
        Assert.assertEquals(result, a + b);
        // yes.... I did skip an overflow here :D you write the test to catch it!
    }

    @Test(dataProvider = "test")
    public void multiplyTest(int a, int b) {
        int result = sut.multiply(a, b);
        LOG.debug("The multiplication of '" + a + "' and '" + b + "' is '" + result + "'");
        Assert.assertEquals(result, a * b);
    }

    @DataProvider(name = "test")
    public static Object[][] testSumInput() {
        return new Object[][]{{5, 5}, {10, 10}, {20, 20}, {Integer.MAX_VALUE, 0}, {Integer.MAX_VALUE, 1}};
    }

}
