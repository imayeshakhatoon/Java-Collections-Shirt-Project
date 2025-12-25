class Shirt{
    String brand, color;
    double price;
    int size;
    Shirt(){
        Shirt(String brand,String color,double price,int size){
            this.brand=brand;
            this.color=color;
            this.price=price;
            this.size=size;

        }
        @override
        public String toString(){
            return"Brand:"+brand+"\tColor:"+color+"\tPrice:"+price+"\tSize:"+size;
        }
    }
}