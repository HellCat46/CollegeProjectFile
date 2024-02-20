import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class socketServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(3000);
        while(true){
            Socket socket = ss.accept();
            System.out.println(new String(socket.getInputStream().readAllBytes(), StandardCharsets.UTF_8));
        }
    }
}
