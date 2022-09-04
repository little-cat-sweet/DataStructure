package LeedCode.Working.OutOfTime;

import java.util.concurrent.TimeUnit;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-06-20 16
 */
public class GCDeath {
    public static GCDeath save_hook;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("The finalize has been executed!!!");
        GCDeath.save_hook=this;

    }
    public void isAlive(){
        System.out.println("Bro, I still alive!!");
    }

    public static void main(String[] args) {
        GCDeath gcDeath=new GCDeath();
        gcDeath=null;
        System.gc();
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(gcDeath!=null){
            gcDeath.isAlive();
        }else{
            System.out.println("I am dead..");
        }
        gcDeath=null;
        System.gc();
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(gcDeath!=null){
            gcDeath.isAlive();
        }else {
            System.out.println("I am dead..");
        }

    }
}
