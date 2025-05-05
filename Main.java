public class Main{
    public static void main(String[] args) {
        Singletable t1 = new Singletable(4, 60, 74); 
        Singletable t2 = new Singletable(8, 70, 74); 
        Singletable t3 = new Singletable(12, 75, 76); 
        CombinedTable c1 = new CombinedTable(t1, t2); 
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());
        CombinedTable c2 = new CombinedTable(t2, t3); 
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());
        t2.setViewQuality(80);
        System.out.println(c2.getDesirability());
    }
}
