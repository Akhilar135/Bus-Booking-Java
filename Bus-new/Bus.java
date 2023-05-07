package test;
public class Bus {
    
    String busName;
    int price;
    int num;
    public Bus(String busName, int price,int num) {

        this.busName=busName;
        this.price=price;
        this.num=num;
    }
    @Override
    public String toString(){
return (this.num+"->Bus: "+this.busName+"  Price: "+this.price+"\n");
    }

}
