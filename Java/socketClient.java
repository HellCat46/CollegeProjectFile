import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class socketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",3000);

        OutputStream out = socket.getOutputStream();
        out.write("Hello".getBytes(StandardCharsets.UTF_8));
    }
}
