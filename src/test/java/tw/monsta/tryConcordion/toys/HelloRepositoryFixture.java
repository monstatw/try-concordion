package tw.monsta.tryConcordion.toys;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/**
 * HelloRepositoryFixture description
 *
 * @author johnson
 * @since 2015-08-20
 */
@RunWith(ConcordionRunner.class)
public class HelloRepositoryFixture {

    public String getGreeting(String name) {
        return "Hello " + name + "!";
    }
}
