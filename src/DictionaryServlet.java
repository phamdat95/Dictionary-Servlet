import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", urlPatterns = "/dictionary")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> map = new HashMap<>();
        map.put("hello","xin chào");
        map.put("hands","đôi tay");
        map.put("joyous","vui vẻ");
        map.put("solve","giải quyết");
        map.put("claim","tự nhận");

        String dic = request.getParameter("text-search");
        String results = map.get(dic);
        PrintWriter writer = response.getWriter();
        if (results != null){
            writer.println("Your word: "+dic+".<br>");
            writer.println("Result: "+results+".");
        } else {
            writer.println("Not found!");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
