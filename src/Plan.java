
public class Plan {
	 	private PlanTypeEnum type;
	    private int minutes = 0;
	    private double monto;
	   


	    public Plan(PlanTypeEnum _type, int minutes, double monto) {
	        this.type = _type;
	        this.minutes = minutes;
	        this.monto = monto;
	       
	    }

	    public double getTotalTarifa() {
	        ITarifaCalculator iTarifaCalculator;
	        switch(type) {
	            case POSTPAGO:
	                iTarifaCalculator = new PostpagoTarifaCalculator();
	                return iTarifaCalculator.getTotalTarifa();
	            case PREPAGO:
	            	iTarifaCalculator = new PrepagoTarifaCalculator();
	                return iTarifaCalculator.getTotalTarifa();
	            case WOW:
	            	iTarifaCalculator = new WowCalculator();
	                return iTarifaCalculator.getTotalTarifa();
	        }
	        throw new RuntimeException("Should be unreachable");
	    }

}
