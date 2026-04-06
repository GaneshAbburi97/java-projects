import java.io.BufferedWriter;
import java.io.FileWriter;
public class buffer {
    public static void main(String[] args) {
        {
            try {
                FileWriter fw=new FileWriter("bufferoutput1.txt",true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write("Hey man");
                bw.newLine();
                bw.write("okay");
                bw.close();
                System.out.println("sucess");
                
            } catch (Exception e) {
                System.out.println("Something happended");
            }
        }
    }
}
