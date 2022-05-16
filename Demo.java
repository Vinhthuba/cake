import java.util.ArrayList;
import java.util.List;

public class Demo {
    private String name;
    private int soluong;
    public Demo(String name,int soluong){
        this.name=name;
        this.soluong=soluong;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getSoluong()
    {
        return soluong;
    }
    public void setSoluong()
    {
        this.soluong=soluong;
    }
    public String toString ()
    {
        return "Ten banh: " + name +", So luong: "+soluong;
    }
}
