package tw.monsta.tryConcordion.toys;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/**
 * CalculatorAddFixture description
 *
 * @author johnson
 * @since 2015-08-20
 */
@RunWith(ConcordionRunner.class)
public class CalculatorAddFixture {

    public Integer getAddingResult(Integer summand, Integer addend) {
        return summand + addend;
    }
}
