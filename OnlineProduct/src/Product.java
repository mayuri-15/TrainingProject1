public class Product {
private String pname;
private double price;


public Product() {
       super();
       // TODO Auto-generated constructor stub
}


public String getPname() {
       return pname;
}


public void setPname(String pname) {
       this.pname = pname;
}


public double getPrice() {
       return price;
}


public void setPrice(double price) {
       this.price = price;
}


public Product(String pname, double price) {
       super();
       this.pname = pname;
       this.price = price;
}

public String toString() {
return pname + " " + price;
}


}

