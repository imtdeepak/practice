package singleton;

/**
 * Created by byjumanikkan on 7/13/16.
 */
public class VolatileUsage {
    private volatile boolean houstConstructed = false;
    private Home home ;
    public void firstThreadProcess()
    {
      //house construction
        home = new Home();
        houstConstructed = true;
    }

    public void secondThreadProcess()
    {
      //house usage
        while(!houstConstructed){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(home.property);
    }
}

class Home{
    int property;

}
