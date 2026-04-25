package day9_apr25.laptop;

public class Laptop {

        private String brand;
        private double screenSize;
        private double price;

        public Laptop(String b, double size, double cost)
        {
            this.brand = b;
            this.screenSize = size;
            this.price = cost;
        }
        public String getBrand()
        {
            return brand;
        }
        public double getPrice()
        {
            return price;
        }
        public double getScreenSize(){
            return screenSize;
        }

}
