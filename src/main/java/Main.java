public class Main {
    public static void main (String args[]){
        Info film1 = new Info("Pirates of the Carribean", 90, 5);
        Info film2 = new Info("Terminator");
        film1.durationInfo();
        film1.status();
        film2.durationInfo();
        film2.status();
    }
}
