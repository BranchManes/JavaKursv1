package Praktiks;

public class Invoice {

    private String partnumber;
    private String partdecription;
    private int quantity;
    private double price;

    public Invoice(String partnumber, String partdecription, int quantity, double price) {
        if (partnumber != null) {
            this.partnumber = partnumber;
        } else {
            this.partnumber = "0";
        }
        if (partdecription != null) {
            this.partdecription = partdecription;
        } else {
            this.partdecription = "0";
        }
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public String getParnumbet() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        if (partnumber != null) {
            this.partnumber = partnumber;
        } else {
            this.partnumber = "0";
        }
    }

    public String getPartdecriprion() {
        return partdecription;
    }

    public void setPartdecription(String partdecription) {
        if (partdecription != null) {
            this.partdecription = partdecription;
        } else {
            this.partdecription = "0";
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {

            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }

}

class InvoiceTest {

    public static void main(String[] args) {
        Invoice i = new Invoice("A5445", "Black Book", 10, 50.5);
        System.out.println("Номер товара:" + i.getParnumbet() + ",название товара:" + i.getPartdecriprion() + ",количество:" + i.getQuantity() + ",цена товара: " + i.getPrice());
        System.out.println("Ваш счет: " + i.getInvoiceAmount());
        //  i.setPartdecription("a");
        //  i.setPartnumber("b");
        // i.setPrice(60);               // Тут  объект i с параметрами конструктора перестрает существовать 
        //  i.setQuantity(20);
        //  System.out.println("Номер товара:" + i.getParnumbet() + ",название товара:" + i.getPartdecriprion() + ",количество:" + i.getQuantity() + ",цена товара: " + i.getPrice());
        // System.out.println(i.getParnumbet());
    }

}
