public class Battery extends Product {
       private boolean rechargeable;
       
       
       public Battery() {
       super();
       }


       public boolean isRechargeable() {
              return rechargeable;
       }


       public void setRechargeable(boolean rechargeable) {
              this.rechargeable = rechargeable;
       }


       public Battery(String pname, double price) {
              super(pname, price);
              // TODO Auto-generated constructor stub
       }
       
       

}
