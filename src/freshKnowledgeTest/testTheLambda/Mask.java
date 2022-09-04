package freshKnowledgeTest.testTheLambda;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-09-10 10
 */
public class Mask {
    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    Mask(String brand,String type){
        this.brand = brand;
        this.type = type;
    }
}
