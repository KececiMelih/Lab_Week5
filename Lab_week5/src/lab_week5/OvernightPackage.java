
package lab_week5;


public class OvernightPackage extends Package {
      double extraFeePerOunce;

    public OvernightPackage(String senderName, String senderAddress,
                            String senderCity, String senderState, String senderZIP,
                            String recipientName, String recipientAddress,
                            String recipientCity, String recipientState, String recipientZIP,
                            double weight, double costPerOunce,
                            double extraFeePerOunce) {

        super(senderName, senderAddress, senderCity, senderState, senderZIP,
              recipientName, recipientAddress, recipientCity, recipientState,
              recipientZIP, weight, costPerOunce);

        this.extraFeePerOunce = extraFeePerOunce;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + (weight * extraFeePerOunce);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Delivery Type: Overnight");
        System.out.println("Extra Fee Per Ounce: $" + extraFeePerOunce);
       
    }
}
