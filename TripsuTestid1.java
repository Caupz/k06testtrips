import org.junit.*;
import static org.junit.Assert.*;
public class TripsuTestid1{
	Tripsuliides laud;
	@Test(expected=NullPointerException.class)
	public void korrahaldus(){
	   laud.alusta('0');
	   assertEquals('0', laud.kelleKord());
	   laud.paiguta('0', 2, 2);
	   assertEquals('X', laud.kelleKord());
	}
	@Test(expected=NullPointerException.class)
    public void alustus1(){
	   laud.alusta('S');
	}
}
