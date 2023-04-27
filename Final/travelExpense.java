public class travelExpense {
    //Create constants and variables to be used in the class
    private final double DAILY_MEAL = 37.00;
    private final double DAILY_PARK = 10.00;
    private final double DAILY_TAXI = 20.00;
    private final double DAILY_LODGE = 95.00;
    private final double MILE_DRIVE = .27;

    private int days;
    private double meals;
    private double airfare;
    private double carRentalFee;
    private double miles;
    private double parkFee;
    private double taxiFee;
    private double regFee;
    private double lodging;

    //Create the default no args constructor which sets all values to 0
    public travelExpense() {
        days = 0;
        meals = 0;
        airfare = 0.0;
        carRentalFee = 0.0;
        miles = 0.0;
        parkFee = 0.0;
        taxiFee = 0.0;
        regFee = 0.0;
        lodging = 0.0;
    }

    //Create the Accessor methods
    /**
     * Accessor for days
     * @return
     */
    public int getDays() {
        return days;
    }

    /**
     * Accessor for airfare
     * @return
     */
    public double getAirfare() {
        return airfare;
    }

    /**
     * Accessor for meals
     * @return
     */
    public double getMeals() {
        return meals;
    }

    /**
     * Accessor for carRentalFee
     * @return
     */
    public double getCarRental() {
        return carRentalFee;
    }

    /**
     * Accessor for miles
     * @return
     */
    public double getMiles() {
        return miles;
    }

    /**
     * Accessor for parkFee
     * @return
     */
    public double getParkFee() {
        return parkFee;
    }

    /**
     * Accessor for taxiFee
     * @return
     */
    public double getTaxiFee() {
        return taxiFee;
    }

    /**
     * Accessor for regFee
     * @return
     */
    public double getRegFee() {
        return regFee;
    }

    /**
     * Accessor for lodging
     * @return
     */
    public double getLodging() {
        return lodging;
    }

    //Create Mutator methods
    /**
     * Mutator for days
     * @param days
     */
    public void setDays(int days) {
        this.days = days;
    }

    public void setMeals(double meals) {
        this.meals = meals;
    }

    /**
     * Mutator for airfare
     * @param airfare
     */
    public void setAirfare(double airfare) {
        this.airfare = airfare;
    }

    /**
     * Mutator for carRentall
     * @param carRental
     */
    public void setCarRental(double carRental) {
        carRentalFee = carRental;
    }

    /**
     * Mutator for miles
     * @param miles
     */
    public void setMiles(double miles) {
        this.miles = miles;
    }

    /**
     * Mutator for parkFee
     * @param parkFee
     */
    public void setParkFee(double parkFee) {
        this.parkFee = parkFee;
    }

    /**
     * Mutator for taxtFee
     * @param taxiFee
     */
    public void setTaxiFee(double taxiFee) {
        this.taxiFee = taxiFee;
    }

    /**
     * Mutator for regFee
     * @param regFee
     */
    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    /**
     * Mutator for lodging
     * @param lodging
     */
    public void setLodging(double lodging) {
        this.lodging = lodging;
    }


    /**
     * This method calculates the Total Expense that the business person spent overall
     * @return
     */
    public double calcExpenseTotal() {
        //Create variables for the Method
        double totalExpense = 0.0;
        double spentMeals = (days * DAILY_MEAL);

        totalExpense = airfare + spentMeals + carRentalFee + parkFee + taxiFee + (lodging * days) + regFee + (miles * MILE_DRIVE);

        this.setMeals(spentMeals);

        return totalExpense;
    }


    /**
     * This calculates the allowed Total expense that the company will cover for the trip
     * The Allowable expense also includes Registration fee Rental Fee and AirFare cost
     * @return
     */
    public double calcAllowablExpense() {
        //Create varaibles needed for method
        double allowablExpense = 0.0;
        
        if(lodging != 0) {
            allowablExpense += (days * DAILY_LODGE);
        }
        if(parkFee != 0) {
            allowablExpense += (days * DAILY_PARK);
        }
        if(taxiFee != 0) {
            allowablExpense += (days * DAILY_TAXI);
        }
        if(miles != 0) {
            allowablExpense += (miles * MILE_DRIVE);
        }
        if(regFee != 0) {
            allowablExpense += regFee;
        }
        if(carRentalFee != 0) {
            allowablExpense += carRentalFee;
        }
        if(airfare != 0) {
            allowablExpense += airfare;
        }

        allowablExpense += (days * DAILY_MEAL);

        return allowablExpense;
    }

    /**
     * This method is used to calculate either what the busniessperson owes, or the amount that they saved, dependant on the sign of the calculated value
     * @return
     */
    public double calcOwed() {
        //Create variables for the method
        double owed = 0.0;

        owed = this.calcExpenseTotal() - this.calcAllowablExpense();

        return owed;
    }

    /**
     * This is a method that will display all calculated totals
     */
    public void displayMethod() {
        //Create a variable to store the amount that is either owed or saved
        double owed = this.calcOwed();

        System.out.printf("Total Spent: $%.2f\n", this.calcExpenseTotal());
        System.out.printf("Total Allowable: $%.2f\n", this.calcAllowablExpense());
        if(owed >= 0.0) {
            System.out.printf("Expense Amount: $%.2f\n", owed);
        }
        else {
            owed = Math.abs(owed);
            System.out.printf("Amount Saved: $%.2f\n", owed);
        }
    }
}
