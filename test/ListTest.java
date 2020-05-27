import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListTest {
    /*
    Stuff to test:
    Arraylist:
    Add
    Get
    getCapacity
    insert
    remove
    set
    size


    Arraylist oneA = new Arraylist();
    Arraylist oneB = new Arraylist();
    Arraylist oneC = new Arraylist();
    Arraylist twoA = new Arraylist();
    Arraylist twoB = new Arraylist();

    LinkedList onea = new LinkedList();
    LinkedList oneb = new LinkedList();
    LinkedList onec = new LinkedList();
    LinkedList oned = new LinkedList();
    LinkedList onee = new LinkedList();

     */

    Arraylist Test1A = new Arraylist();
    LinkedList Test1L = new LinkedList();

    Arraylist Test2A = new Arraylist();
    LinkedList Test2L = new LinkedList();

    @Before
    public void setup(){
        /*
        oneA.add(1);

        oneB.add(1);
        oneB.add(2);
        oneB.remove(1);

        oneC.add(1);
        oneC.add(2);
        oneC.add(4);
        oneC.insert(3,2);
        oneC.set(5,1);

        for (int i = 0; i < 2000; i++) {
            twoA.add(i);
        }
        for (int i = 0; i < 2000; i++) {
            twoB.add(i);
        }
        twoB.remove(1000);
        twoB.set(1,3000);

        onea.add(1);

        for (int i = 0; i < 2000; i++) {
            oneb.add(i);
        }
        for (int i = 0; i < 2000; i++) {
            onec.add(i);
        }
        onec.insert(50,55);
        for (int i = 0; i < 2000; i++) {
            oned.add(i);
        }
        oned.remove(1000);
        for (int i = 0; i < 2000; i++) {
            onee.add(i);
        }
        onee.push(20);
        onee.set(50,1);
         */

        for (int i = 0; i < 200; i++) {
            Test1A.add(i);
        }
        for (int i = 0; i < 200; i++) {
            Test1L.add(i);
        }
        for (int i = 0; i < 120000; i++) {
            Test2A.add(i);
        }
        for (int i = 0; i < 120000; i++) {
            Test2L.add(i);
        }
    }

    /*
    Testing functions
    @Test
    public void basicaddA (){assertThat(oneA.get(0), is(1));}
    @Test
    public void basicgetcapacityA (){assertThat(oneA.getCapacity(), is(9));}
    @Test
    public void basicremoveA (){assertThat(oneB.get(0), is(1));}
    @Test
    public void basicinsertA (){assertThat(oneC.get(2), is(3));}
    @Test
    public void basicinsertA2 (){assertThat(oneC.get(3), is(4));}
    @Test
    public void basicsetA (){assertThat(oneC.get(1), is(5));}
    @Test
    public void basicsize (){assertThat(oneC.getSize(), is(4));}

    @Test
    public void addA (){assertThat(twoA.get(1000), is(1000));}
    @Test
    public void removeA (){assertThat(twoB.get(1000), is(1001));}
    @Test
    public void setoutsideA (){assertThat(twoB.get(3000), is(1));}

    @Test
    public void basicaddL (){assertThat(onea.get(0), is(1));}
    @Test
    public void addL (){assertThat(oneb.get(1000), is(1000));}
    @Test
    public void insertL (){assertThat(onec.get(55), is(50));}
    @Test
    public void removeL (){assertThat(oned.get(1000), is(1001));}
    @Test
    public void removeL2 (){assertThat(oned.get(999), is(999));}
    @Test
    public void popL (){assertThat(oned.pop(), is(0));}
    @Test
    public void pushL (){assertThat(onee.get(0), is(20));}
    @Test
    public void setL (){assertThat(onee.get(1), is(50));}
    @Test
    public void sizeL (){assertThat(onee.size(), is(2001));}
    */

    //Actual data gathering

    @Test
    public void middle2A (){assertThat(Test2A.get(60000), is(60000));}
    @Test
    public void middle2L (){assertThat(Test2L.get(60000), is(60000));}

    @Test
    public void middle1A (){assertThat(Test1A.get(100), is(100));}
    @Test
    public void middle1L (){assertThat(Test1L.get(100), is(100));}

    @Test
    public void pop1A (){assertThat(Test1A.pop(), is(0));}
    @Test
    public void pop1L (){assertThat(Test1L.pop(), is(0));}
    @Test
    public void pop2A (){assertThat(Test2A.pop(), is(0));}
    @Test
    public void pop2L (){assertThat(Test2L.pop(), is(0));}

    @Test
    public void push1A (){assertThat(Test1A.pushget(0), is(0));}
    @Test
    public void push1L (){assertThat(Test1L.pushget(0), is(0));}
    @Test
    public void push2A (){assertThat(Test2A.pushget(0), is(0));}
    @Test
    public void push2L (){assertThat(Test2L.pushget(0), is(0));}

    @Test
    public void remove1A (){assertThat(Test1A.removeget(199), is(199));}
    @Test
    public void remove1L (){assertThat(Test1L.removeget(199), is(199));}
    @Test
    public void remove2A (){assertThat(Test2A.removeget(1999), is(1999));}
    @Test
    public void remove2L (){assertThat(Test2L.removeget(1999), is(1999));}


}
