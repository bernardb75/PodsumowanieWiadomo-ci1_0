import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class Test {
    Trojkat trojkat;

    @Before
    public void Dane(){
        trojkat=new Trojkat(5,4,3);
    }
    @org.junit.Test
    public void JestProstokatny() {
        assertEquals(true, trojkat.TrajkatProstokatny());
    }

}
