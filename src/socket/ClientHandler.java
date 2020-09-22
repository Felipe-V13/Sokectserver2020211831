package socket;
import java.io.DatainputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.text.Dateformat
import java.text.SimpleDataFormat;


public class ClientHandler extends Thread{
    DateFDormat fordate = new SimpleDateFormat (pattern: "yyyy/MM/dd");
    DateFormat fortime = new SimpleDateFormat (pattern: "hh:mm:ss");

    final DataImputStream dis;
    final DataOutputStream dos;
    final socket s;

    public ClientHandler(Socket s, DataImputStream dis, DataOutputStream dos){
        this.s = s;
        this.dis = dis;
        this.dos = dos;
    }
    @override
    public void run (){
        String received;
        String Toreturn;
        While (true){
            try{
                dos.writeUF(str "Que informacion quiere [Fecha]...\n" + "Escriba Salir para terminar");


                received = dis.readUTF();

                if (received.equals ("Exit")){
                    System.out.printl("CLiente" + this.s )
                }

            } catch (IOExecption e){
                e.printStackTrace();
            }
        }
    }
}
