package co.edu.poli.ces3.universitas.servlet;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public abstract class MyServlet extends HttpServlet {

    public JsonObject getParamsFromPost(HttpServletRequest request) throws IOException {
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            sb.append(line + "\n");
            line = reader.readLine();
        }
        reader.close();

        return JsonParser.parseString(sb.toString()).getAsJsonObject();
    }


    protected abstract void doPatch(HttpServletRequest request, HttpServletResponse response, JsonObject requestBody) throws ServletException, IOException;
}
