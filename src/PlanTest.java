import static org.junit.Assert.*;

import org.junit.Test;

public class PlanTest {

	
	 @Test
	    public void getMontoOfPrepagoPlan() {
	        Plan plan = new Plan(PlanTypeEnum.POSTPAGO, 0, 0);
	        assertEquals(plan.getTotalTarifa(), 0);
	    }


}
