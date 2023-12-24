import java.util.stream.BaseStream;

public class Mk20 implements BattleModule{
    private double Price20mmCatrige = 27;

    public double getPrice20mmCatrige() {
        return Price20mmCatrige;
    }

    public void setPrice20mmCatrige(double price20mmCatrige) {
        Price20mmCatrige = price20mmCatrige;
    }
    public Mk20(){}
    public Mk20(double price20mmCatrige)
    {
        setPrice20mmCatrige(price20mmCatrige);
    }

    @Override
    public void Print() {
        System.out.println("This is MK20 and price of 20 mm catrige is " + Price20mmCatrige);
    }

    @Override
    public double priceOfSecondsOfFire() {
        return Price20mmCatrige*16.67;
    }

    @Override
    public int compareTo(BattleModule o) {
        if(o.priceOfSecondsOfFire() > this.priceOfSecondsOfFire())
        {
            return -1;
        }
        else if(o.priceOfSecondsOfFire() < this.priceOfSecondsOfFire())
        {
            return 1;
        }
        return 0;
    }
}
