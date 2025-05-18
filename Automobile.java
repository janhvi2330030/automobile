class Automobile {
    String type;
    class TwoWheeler {
     double price_twowheeler;
     TwoWheeler(String type, double price) {
    Automobile.this.type = type;
    this.price_twowheeler = price;
        }
        void display() {
    System.out.println("Type: " + Automobile.this.type);
   System.out.println("Price of Two Wheeler: " + price_twowheeler);
        }
    }
    class FourWheeler {
  double price_fourwheeler;
 FourWheeler(String type, double price) {
   Automobile.this.type = type;
   this.price_fourwheeler = price;
        }
        void display() {
      System.out.println("Type: " + Automobile.this.type);
 System.out.println("Price of Four Wheeler: " + price_fourwheeler);
    }
    }
    public static void main(String[] args) {
  Automobile automobile = new Automobile();
  TwoWheeler bike = automobile.new TwoWheeler("Bike", 15000);
  FourWheeler car = automobile.new FourWheeler("Car", 250000);
 bike.display();
 car.display();
 }
}