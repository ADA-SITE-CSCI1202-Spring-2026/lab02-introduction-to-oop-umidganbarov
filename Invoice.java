public class Invoice {

    // A hissesi


    public String number;
    public String description;
    public int quantity;
    public double pricePerItem;

    // B hissesi
    public Invoice(String number,String description,int quantity,double pricePerItem) {
        this.number=number;
        this.description=description;

        if (quantity>0) {
            this.quantity=quantity;
        } else {
            this.quantity=0;
        }

        if (pricePerItem>0)  this.pricePerItem=pricePerItem;
         else   this.pricePerItem=0.0;
        
    }

    // D hissesi
    public double getInvoiceAmount() {
        return quantity*pricePerItem;
    }
}
