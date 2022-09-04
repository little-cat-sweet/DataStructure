package LeedCode.Working;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-10-03 16
 */
public class Basket {
    protected Material material;

    public void change(Basket basket, Material material){
        this.material = material;
        basket.material = material;
    }
}
