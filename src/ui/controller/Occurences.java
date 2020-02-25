package ui.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Occurences")
public class Occurences extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String woord = request.getParameter("woord");
        String letter = request.getParameter("letter");
        int aantalKeer = 0;

        for (int i = 0; i < woord.length(); i++){
            char eersteLetter = woord.charAt(i);
            String stringeersteletter = String.valueOf(eersteLetter);
            if (stringeersteletter.equals(letter)){
                aantalKeer++;
            }
        }

        request.setAttribute("aantal", aantalKeer);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
