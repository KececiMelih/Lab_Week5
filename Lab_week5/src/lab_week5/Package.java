
package lab_week5;

public class Package {
    String senderName, senderAddress, senderCity, senderState, senderZIP;
    String recipientName, recipientAddress, recipientCity, recipientState, recipientZIP;
    double weight, costPerOunce;

    public Package(String senderName, String senderAddress,
                   String senderCity, String senderState, String senderZIP,
                   String recipientName, String recipientAddress,
                   String recipientCity, String recipientState, String recipientZIP,
                   double weight, double costPerOunce) {

        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZIP = senderZIP;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZIP = recipientZIP;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }

    public void info() {
        System.out.println("Sender: " + senderName);
        System.out.println("Sender Address: " + senderAddress + ", " + senderCity
                           + ", " + senderState + " " + senderZIP);
        System.out.println("Recipient: " + recipientName);
        System.out.println("Recipient Address: " + recipientAddress + ", " + recipientCity
                           + ", " + recipientState + " " + recipientZIP);
        System.out.println("Weight: " + weight + " ounces");
        System.out.println("Cost Per Ounce: $" + costPerOunce);
        System.out.println("Total Cost: $" + calculateCost());
    }
}
