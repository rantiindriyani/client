import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
public class client2 {
    public static void main(String[] args) {
        Socket s=null;
        PrintStream output;
        BufferedReader pesan;

        try{
            s=new Socket("127.0.0.1",12345); //ip server tujuan dan port-nya
            output=new PrintStream(s.getOutputStream());
            pesan=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("client :"+ s);
            System.out.println("Aku ingin ?:");
            System.out.println("client :");
            output.println(pesan.readLine());

            output.close();
            s.close();
            
        } catch(IOException e) {

        }
    }
}