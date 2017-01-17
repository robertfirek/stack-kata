import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.rules.ExpectedException.none;


public class StackShould {

    @Rule
    public ExpectedException thrown = none();

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void throw_exception_if_popped_when_empty() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("you can not pop an empty stack");

        stack.pop();
    }

    @Test
    public void pop_last_pushed_object() {
        Object pushed = "pushed";
        stack.push(pushed);

        Object popped = stack.pop();

        assertThat(popped, is(pushed));
    }
}