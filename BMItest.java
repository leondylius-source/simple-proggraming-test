import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BMItest {
    @Test
    public void testMath() {
        assertEquals(24.22, BMIcalculator.method(170, 70), 0.01);
    }

    @Test
    public void testNormalCategory() {
        // 24.22 should be "Normal"
        assertEquals("Normal", BMIcalculator.getCategory(24.22));
    }

    @Test
    public void testObeseCategory() {
        // 35.0 should be "Obese"
        assertEquals("Obese", BMIcalculator.getCategory(35.0));
    }

    @Test
    public void testUnderweight() {
        assertEquals("Underweight", BMIcalculator.getCategory(16.0));
    }

    @Test
    public void testExtremeObese() {
        assertEquals("Extreme Obese", BMIcalculator.getCategory(45.0));
    }

    @Test
    public void testOverweight() {
        // This will turn the 'else if (bmi >= 25)' branch GREEN
        assertEquals("Overweight", BMIcalculator.getCategory(27.0));
    }
}