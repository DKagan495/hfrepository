package ultitestpack;

public class mainclass {
    public static void main(String[] args)
    {
        threading1 thefirstthread = new threading1();
        threading2 thesecondthread = new threading2();
        Thread thread = new Thread(thesecondthread);
        thefirstthread.start();
        thread.start();
    }
}
