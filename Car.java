    /** Car
     * My company, Zoomster, makes 3 models of car at a single factory.
     * Each car has a VIN, a make, a model, and a license plate number.
     * I want to track the total number of cars I have produced, as well
     * as the number of cars of each model, and the total profits from
     * my factory.
     * <p>
     * The Speedster sells for  $102,000.00 
     * The Roadster  sells for  $206,000.00
     * The Cubester  sells for  $74,000.00
     * <p>
     * VIN: unique ID for each car. VIN starts at A10000 and increases 
     * by one for each sequential car produced by the company.
     * E.g.: Our first car, a Speedster, has VIN A10000. Our second car,
     * a Cubester, has VIN A10001. Our third car, a Speedster, has VIN 
     * A10002. After A99999, VIN becomes B10000.
     * <p>
     * make: the company that produced the car. Should be the same for 
     * each car produced by my company.
     * <p>
     * model: can be any of the 3 models of car that I produce: 
     * the Cubester, the Speedster, or the Roadster.
     * <p>
     * license plate number: remains blank until the car is purchased and 
     * registered by a customer. Should be able to be modified by a 
     * method accessible to the customer.
     */
public class Car {
    // Variables:
    public static int totalCars;
    private String make;
    public static String model; 
    private String VIN;
    private String licensePlate;
    private static double totalProfits;
    private static int cubesterCount;
    private static int speedsterCount;
    private static int roadsterCount;
    // Constructor:
    public Car (String model, String VIN) {
        totalCars++;
        make="Dauuge's Car Company";
        this.model=model;
            if (model.equals("Cubester")) {
                cubesterCount++;
                totalProfits+=74000.00;
            }
            else if (model.equals("Speedster")) {
                speedsterCount++;
                totalProfits+=102000.00
            }
            else if (model.equals("Roadster")) {
                roadsterCount++;
                totalProfits+=206000.00;
            }
        this.VIN=VIN;
        licensePlate="";
    }

    // Methods:
    /**
     * Returns the String VIN of a given Car object.
     * Precondition: Car object must be initialized
     * Postcondition: Returns String VIN accessed from the Car object
     * @return VIN -the VIN of the Car object
     */
    public String getVIN(){
        return VIN;
    }
    /**
     * [your Javadocs here]
     */
    public String getModel(){
        return model;
    }
    /**
     * [your Javadocs here]
     */
    public String getMake(){
        return make;
    }
    /**
     * Sets the String license plate number of a given Car object.
     * Precondition: Car object must be initialized
     * Postcondition: Modifies the license plate number of the Car object
     * @param plateNumber -the customer's String license plate number
     */
    public void setPlateNumber(String plateNumber){
        licensePlate=plateNumber;
    }
    /**
     * Returns the total profits from cars produced by my factory.
     * @return totalProfits -the total sale price of all Car objects created
     */
    public double getTotalProfits(){
        return totalProfits;
    }
    /**
     * Returns the total number of cars produced by my factory.
     * @return totalCars -the total number of Car objects created
     */
    public int getTotalCars(){
        return totalCars;
    }
    /**
     * Returns the  number of Speedster cars produced by my factory.
     * @return totalSpeedsters -the total number of Car objects 
     * with model "Speedster" created
     */
    public int getTotalSpeedsters(){
        return speedsterCount;
    }
    /**
     * Returns the  number of Roadster cars produced by my factory.
     * @return totalRoadsters -the total number of Car objects 
     * with model "Roadster" created
     */
    public int getTotalRoadsters(){
        return roadsterCount;
    }
    /**
     * Returns the  number of Cubester cars produced by my factory.
     * @return totalCubeters -the total number of Car objects 
     * with model "Cubester" created
     */
    public int getTotalCubesters(){
        return cubesterCount;
    }

}