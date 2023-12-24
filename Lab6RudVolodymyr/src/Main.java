public class Main {
    public static void main(String[] args) {
        IFVMarder<? super BattleModule> marder1 = new IFVMarder<BattleModule>();
        Mk20 mk20 = new Mk20();
        Pkm akm = new Pkm();

        marder1.AddBattleModule(mk20);
        marder1.AddBattleModule(mk20);
        marder1.AddBattleModule(akm);
        marder1.AddBattleModule(akm);
        marder1.AddBattleModule(akm);

        marder1.findCheaper().Print();
    }
}