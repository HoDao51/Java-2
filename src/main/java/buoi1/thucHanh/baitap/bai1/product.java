package buoi1.thucHanh.baitap.bai1;

public class product {
    private String name;
    private double price;
    private int quantity;
    private String description;

    public product() {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getDescription(){
        return this.description;
    }

    public product setName(String name) {
        if (!name.trim().isEmpty() && name.length() > 2){
            this.name = name;
        }else {
            System.out.println("Ten khong hop le!");
        }
        return this;
    }

    public product setPrice(double price){
        if (price >= 0){
            this.price = price;
        }else {
            System.out.println("Gia khong hop le!");
        }
        return this;
    }

    public product setDescription(String description) {
        if (!description.trim().isEmpty() && description.length() > 1){
            this.description = description;
        }else {
            System.out.println("Mo ta khong hop le!");
        }
        return this;
    }

    public product setQuantity(int quantity) {
        if (quantity >= 0){
            this.quantity = quantity;
        }else {
            System.out.println("So luong khong hop le!");
        }
        return this;
    }

}
