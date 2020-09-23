package socket;
import java.io.DatainputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.Dateformat
import java.text.SimpleDataFormat;
import.java.util.Date;


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
                dos.writeUF(str "Que informacion quiere [Fecha | Hora ]...\n" + "Escriba Salir para terminar");


                received = dis.readUTF();

                if (received.equals ("Exit")){
                    System.out.println("Cliente" + this.s + "quiere cerrar la conexion");
                    System.out.println("Cerrando la conexion...");
                    this.s.close
                    System.out.println("Se cerró la conexión");
                    break;

                }
                Date date = new Date();

                swicht (received){
                    case "Fecha" :
                        toreturn = fordate.format(date);
                        dos.writeUTF(toreturn);
                        break;
                    case "time":
                        toreturn = fortime.format(date);
                        dos.writeUTF(toreturn);
                        break;
                    default:
                        dos.writeUTF(str "Entrada inválida")

                }

            } catch (IOExecption e){
                e.printStackTrace();
            }
        }
        try{
            this.close();
            this.dos.close();

        }catch(IOExeption e){
            e.printStackTrace
        }
    }
}
