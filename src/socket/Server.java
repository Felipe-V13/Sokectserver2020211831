package socket;
import java.io.DatainputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;




public class Server {
    public static void main (String[] args) throws I{
        ServerSocket ss = new ServerSocket(5556);
        while (true){
            Socket s = null;
            try{
                s = ss.accept();
                System.out.println("se conecto un nuevo cliente"+ s);
                DataImputStream dis = new DataInputStream(s.getImputStream());
                DataoutputStream dos = new DataOutputStreams(s.getoutputStream());

                thread t = new ClientHandler (s, dis, dos)
                t.start();

            }catch (Exception e){
                s.close();
                e.printStackTrace();}sef



        }
        }
    }
}