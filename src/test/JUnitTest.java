package test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class JUnitTest {
	@Test
public void test(){
	Spiellogik spiel=new Spiellogik();
    assertThat(spiel.nenneStartHoelzer(), is(not(0)));

}
}












