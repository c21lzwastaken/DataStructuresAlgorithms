import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void myMethod() {
        assertThat(Sample.myMethod(), is(0));
    }

}
