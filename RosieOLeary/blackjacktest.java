package RosieOLeary;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class blackjacktest {

	
@Parameters
public static Collection<Integer[]> data(){
	return Arrays.asList(new Integer[][]{{11,10,11},{21,21,21},{10,10,10},{22,22,0},{13,22,13},{24,23,0}});
			
	}

@Parameter(0) public int Input1;
@Parameter(1) public int Input2;
@Parameter(2) public int Expected;



@Test
public void test(){
	assertEquals(Main.blackJack(Input1,Input2),Expected);
}
	
	
	
	
	
	/*@Test
	public void test() {
		assertEquals(Main.blackJack(21,21),21);
	}
	@Test
	public void test1(){
		assertEquals(Main.blackJack(10,10),10);
	}
	@Test
	public void test2(){
		assertEquals(Main.blackJack(22, 22),0);
	}
	@Test
	public void test3(){
		assertEquals(Main.blackJack(15,10),15);
	}
	@Test
	public void test4(){
		assertEquals(Main.blackJack(30,10),10);	
	}
	@Test
	public void test5(){
		assertEquals(Main.blackJack(30,40),0);
		
	}
	*/

}
