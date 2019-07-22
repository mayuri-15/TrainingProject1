public class Disc extends Product{
       private int capacity;
       
       
       public Disc() {
       super();
       }


       public Disc(String pname, double price) {
              super(pname, price);
              // TODO Auto-generated constructor stub
       }


       public int getCapacity() {
              return capacity;
       }


       public void setCapacity(int capacity) {
              this.capacity = capacity;
       }
       
       
       
}
