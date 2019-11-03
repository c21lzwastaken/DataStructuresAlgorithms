import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProblemSet1Test {
    int[] a = new int[200000001];

    @Before
    public void before() {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    @Test
    public void linearTestfalse() {
        assertThat(ProblemSet1.linearSearch(a, 0), is(1));
    }
    @Test
    public void binaryTest1false() {
        assertThat(ProblemSet1.binarySearch1(a, 0), is(1));
    }
    @Test
    public void binaryTest2false() {
        assertThat(ProblemSet1.binarySearch2(a, 0), is(1));
    }

    @Test
    public void linearTesttrue() {
        assertThat(ProblemSet1.linearSearch(a, 1), is(1));
    }
    @Test
    public void binaryTest1true() {
        assertThat(ProblemSet1.binarySearch1(a, 1), is(1));
    }
    @Test
    public void binaryTest2true() {
        assertThat(ProblemSet1.binarySearch2(a, 1), is(1));
    }

    @Test
    public void linearTest1() {
        assertThat(ProblemSet1.linearSearch(a, 5), is(5));
    }
    @Test
    public void binaryTest11() {
        assertThat(ProblemSet1.binarySearch1(a, 5), is(5));
    }
    @Test
    public void binaryTest21() {
        assertThat(ProblemSet1.binarySearch2(a, 5), is(5));
    }

    @Test
    public void linearTest2() {
        assertThat(ProblemSet1.linearSearch(a, 500), is(500));
    }
    @Test
    public void binaryTest12() {
        assertThat(ProblemSet1.binarySearch1(a, 500), is(500));
    }
    @Test
    public void binaryTest22() {
        assertThat(ProblemSet1.binarySearch2(a, 500), is(500));
    }

    @Test
    public void linearTest3() {
        assertThat(ProblemSet1.linearSearch(a, 5000), is(5000));
    }
    @Test
    public void binaryTest13() {
        assertThat(ProblemSet1.binarySearch1(a, 5000), is(5000));
    }
    @Test
    public void binaryTest23() {
        assertThat(ProblemSet1.binarySearch2(a, 5000), is(5000));
    }

    @Test
    public void linearTest4() {
        assertThat(ProblemSet1.linearSearch(a, 1000000), is(1000000));
    }
    @Test
    public void binaryTest14() {
        assertThat(ProblemSet1.binarySearch1(a, 1000000), is(1000000));
    }
    @Test
    public void binaryTest24() {
        assertThat(ProblemSet1.binarySearch2(a, 1000000), is(1000000));
    }

    @Test
    public void linearTest5() {
        assertThat(ProblemSet1.linearSearch(a, 10000000), is(10000000));
    }
    @Test
    public void binaryTest15() {
        assertThat(ProblemSet1.binarySearch1(a, 10000000), is(10000000));
    }
    @Test
    public void binaryTest25() {
        assertThat(ProblemSet1.binarySearch2(a, 10000000), is(10000000));
    }

    @Test
    public void linearTest6() {
        assertThat(ProblemSet1.linearSearch(a, 50000000), is(50000000));
    }
    @Test
    public void binaryTest16() {
        assertThat(ProblemSet1.binarySearch1(a, 50000000), is(50000000));
    }
    @Test
    public void binaryTest26() {
        assertThat(ProblemSet1.binarySearch2(a, 50000000), is(50000000));
    }

    @Test
    public void linearTest7() {
        assertThat(ProblemSet1.linearSearch(a, 100000000), is(100000000));
    }
    @Test
    public void binaryTest17() {
        assertThat(ProblemSet1.binarySearch1(a, 100000000), is(100000000));
    }
    @Test
    public void binaryTest27() {
        assertThat(ProblemSet1.binarySearch2(a, 100000000), is(100000000));
    }

    @Test
    public void linearTest8() {
        assertThat(ProblemSet1.linearSearch(a, 200000000), is(200000000));
    }
    @Test
    public void binaryTest18() {
        assertThat(ProblemSet1.binarySearch1(a, 200000000), is(200000000));
    }
    @Test
    public void binaryTest28() {
        assertThat(ProblemSet1.binarySearch2(a, 200000000), is(200000000));
    }
}

