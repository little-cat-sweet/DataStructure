package Concurrent;

/**
 * @Author HongYun on 2022/6/30
 */

public class DoubleCheckedLocking {

    private volatile static Boy boy;
    public static Boy getBoy(){
        if(boy == null){
            synchronized (DoubleCheckedLocking.class){
                if(boy == null){
                    return new Boy();
                }
            }
        }
        return boy;
    }
}
class Boy{

}
