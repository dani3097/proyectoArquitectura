
public interface ITarifaCalculator {
	default public double getBaseMonto(int minutes) {
        return (minutes*getBaseMonto());
    }

   
    default double getBaseMonto() {
        return 1;
    }

    double getTotalTarifa();
	

}
