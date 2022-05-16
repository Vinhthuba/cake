import java.util.List;
import java.util.ArrayList;
public class TestDemo {
    public static void main(String[] args) {
        List<Demo> loaiBanh = new ArrayList<>();
        loaiBanh.add(new Demo("Banh chung",1));
        loaiBanh.add(new Demo ("Banh mi",2));
        loaiBanh.add(new Demo("Banh bao",3));
        loaiBanh.forEach(loaibanh ->{
            System.out.println("Ten banh: "+loaibanh.getName()+", So luong: "+loaibanh.getSoluong());
        });
        System.out.println("Does names Array contain \"Banh chung\"? : " + loaiBanh.contains("Banh chung"));
        if(loaiBanh.contains("Banh chung")==false)
        {
            System.out.println("Banh chung dung cho ngay tet");
        }
        loaiBanh.add(new Demo("Banh tet",2));
        System.out.println("Them loai banh thanh cong");
        System.out.println(loaiBanh);


        loaiBanh.remove(3);
        System.out.println("Danh sach sau khi xoa la: ");
        System.out.println(loaiBanh);
    }
}
