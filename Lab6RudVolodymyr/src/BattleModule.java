public interface BattleModule extends Comparable<BattleModule>{
    double priceOfSecondsOfFire();
    void Print();

    @Override
    int compareTo(BattleModule o);
}
