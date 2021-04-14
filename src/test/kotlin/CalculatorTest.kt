import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun `Adding three and two should return five`() {
        val result = Calculator().add(3,2)
        Assertions.assertEquals(5, result)
    }


}