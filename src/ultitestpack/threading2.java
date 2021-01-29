package ultitestpack;

public class threading2 implements Runnable{
    public void run()
    {
        for(int i = 0; i < 12; i++) {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException interruptedException)
            {
                interruptedException.printStackTrace();
            }
            System.out.println("0");
        }
    }
}
