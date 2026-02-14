public class InvoiceTEST {
    public static void main(String[] args) 
    {

        Invoice invoice = new Invoice("ABC", "Alfabet", 221, 7.59);

        System.out.println("number= "+invoice.number);
        System.out.println("description= "+invoice.description);
        System.out.println("quantity= "+invoice.quantity);
        System.out.println("pricePerItem= "+invoice.pricePerItem);
        System.out.println("AMount= "+invoice.getInvoiceAmount());
    }
}
