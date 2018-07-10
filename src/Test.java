import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class Test {
    Trojkat trojkat;

    @Before
    public void Dane(){
        trojkat=new Trojkat(7,4,5);
    }
    @org.junit.Test
    public void JestProstokatny() {
        assertEquals(false, trojkat.TrajkatProstokatny());
    }

}
