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

        void display(){
            System.out.println("Brand: " + brand);
            System.out.println("Screen Size: " + screenSize);
            System.out.println("Price: " + price);
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
