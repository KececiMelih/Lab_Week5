
package lab_week5;


public class TwoDayPackage extends Package  {
    double flatFee;

    public TwoDayPackage(String senderName, String senderAddress,
                         String senderCity, String senderState, String senderZIP,
                         String recipientName, String recipientAddress,
                         String recipientCity, String recipientState, String recipientZIP,
                         double weight, double costPerOunce, double flatFee) {

        super(senderName, senderAddress, senderCity, senderState, senderZIP,
              recipientName, recipientAddress, recipientCity, recipientState,
              recipientZIP, weight, costPerOunce);

        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Delivery Type: Two Day");
        System.out.println("Flat Fee: $" + flatFee);
       
    } 
}
