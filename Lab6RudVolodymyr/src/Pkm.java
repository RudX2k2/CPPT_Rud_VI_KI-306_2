public class Pkm implements BattleModule{
    private double PriceOfBullet7_62 = 0.36;

    public double getPriceOfBullet7_62() {
        return PriceOfBullet7_62;
    }

    public void setPriceOfBullet7_62(double priceOfBullet7_62) {
        PriceOfBullet7_62 = priceOfBullet7_62;
    }
    public Pkm()
    {

    }
    public Pkm(double priceOfBullet7_62)
    {
        setPriceOfBullet7_62(priceOfBullet7_62);
    }

    @Override
    public void Print() {
        System.out.println("This is AKM and price of 7.62 mm catrige is " + PriceOfBullet7_62);
    }
    @Override
    public double priceOfSecondsOfFire() {
        return PriceOfBullet7_62*10;

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
