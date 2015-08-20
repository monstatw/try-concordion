package tw.monsta.tryConcordion.toys;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HelloTest description
 *
 * @author johnson
 * @since 2015-08-20
 */
public class HelloTest {

    @Test
    public void firstTest() {
        assertThat(trueFunction()).isTrue();
    }

    private boolean trueFunction() {
        return true;
    }
}
