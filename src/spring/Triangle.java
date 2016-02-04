package spring;

/**
 * Created by ishtiyaq on 1/20/2016.
 */
public class Triangle {
    private String type;
    private String height;

    public Triangle(String type, String height) {
        this.type = type;
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(getType()+" Triangle Drawn of"+ getHeight());
    }
}
