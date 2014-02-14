package edu.ucsb.cs56.w14.lab05.OliverHKU;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for RealMadridPlayer

    @author Phill Conrad
    @author Wenjian Li
    @version 2014/02/06 for lab04, cs56, W14
    @see RealMadridPlayer

*/

public class RealMadridPlayerTest {

    /** Test case for getNumber method of RealMadridPlayer
     @see RealMadridPlayer#getNumber
    */

    @Test
	public void test_getNumber() {
	RealMadridPlayer c1 = new RealMadridPlayer(7,"Cristiano Ronaldo","CF");
	assertEquals(7,c1.getNumber());
    }


    /** Test case for getName method of RealMadridPlayer
     @see RealMadridPlayer#getName
    */

    @Test
	public void test_getName() {
	RealMadridPlayer c1 = new RealMadridPlayer(1,"Iker Casillas","GK");
	assertEquals("Iker Casillas",c1.getName());
    }

    /** Test case for getPosition
     @see RealMadridPlayer#getPosition
    */

    @Test
	public void test_getPosition() {
	RealMadridPlayer c1 = new RealMadridPlayer(22,"Di Maria","LMF");
	assertEquals("LMF",c1.getPosition());
    }

    /** Test case for toString
     @see RealMadridPlayer#toString
    */

    @Test
	public void test_toString() {
	RealMadridPlayer c1 = new RealMadridPlayer(9,"Benzema","CF");
	assertEquals("[9,Benzema,CF]",c1.toString());
    }

    /** Test case 1 for .equals
     @see RealMadridPlayer#equals
    */

    @Test
	public void test_equals1() {
	RealMadridPlayer c1 = new RealMadridPlayer(17,"Alberoa","RB");
	RealMadridPlayer c2 = new RealMadridPlayer(17,"Alberoa","RB");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see RealMadridPlayer#equals
    */

    @Test
	public void test_equals2() {
	RealMadridPlayer c1 = new RealMadridPlayer(25,"Diego Lopez","GK");
	RealMadridPlayer c2 = new RealMadridPlayer(20,"Jese Rodriguez Ruiz","RF");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see RealMadridPlayer#hashCode
    */

    @Test
	public void test_hashCode1() {
	RealMadridPlayer c1 = new RealMadridPlayer(3,"Pepe","CB");
	RealMadridPlayer c2 = new RealMadridPlayer(3,"Pepe","CB");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see RealMadridPlayer#hashCode
    */

    @Test
	public void test_hashCode2() {
	RealMadridPlayer c1 = new RealMadridPlayer(4,"Sergio Ramos","CB");
	RealMadridPlayer c3 = new RealMadridPlayer(12,"Marcelo","LB");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
