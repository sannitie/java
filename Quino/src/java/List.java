/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Snorre
 */
@WebServlet(urlPatterns = {"/List"})
public class List extends HttpServlet {

    private ArrayList<Info> arraylist;
    private HashMap<Info, Date> historymap;

    /**
     * Constructor.
     */
    public List() {
        arraylist = new ArrayList<>();
        historymap = new HashMap<>();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String operator = " ";
    }

    /**
     * Add a TVShow to the TVList.
     */
    public void addToList(Info newInfo) {
        arraylist.add(newInfo);
    }

    /**
     * Add the current date and time to the value in the history map. Add a
     * TVShow or movie to the key in the history map.
     *
     * @param newInfo The object that is getting added to the map.
     */
    public void addToHistoryMap(Info newInfo) {
        Date date = new Date(System.currentTimeMillis());
        historymap.put(newInfo, date);
    }

    /**
     * Prints out a list of all TV-shows and all information about each TV-show.
     */
    public void printTVList() {
        for (Info tvshow : arraylist) {
            if (tvshow instanceof TVShow) {
                tvshow.printInfo();
                System.out.println("");
            }
        }
        System.out.println("");
    }

    /**
     * Prints out a list of all TV-shows and all information about each TV-show.
     */
    public void printMovieList() {
        for (Info movie : arraylist) {
            if (movie instanceof Movie) {
                movie.printInfo();
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void createObjects() {

        TVShow oneTVShow = new TVShow("Scorpion", "Action, Drama", 8, 40, 3, 64, true);
        addToList(oneTVShow);
        addToHistoryMap(oneTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        TVShow twoTVShow = new TVShow("Smallville", "Adventure, Drama", 6, 40, 10, 217, false);
        addToList(twoTVShow);
        addToHistoryMap(twoTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Movie oneMovie = new Movie("The Prestige", "Drama, Mystery, Sci-fi", 10, 130);
        addToList(oneMovie);
        addToHistoryMap(oneMovie);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        TVShow thrTVShow = new TVShow("Friday Night Lights", "Drama, Sport", 9, 40, 5, 73, false);
        addToList(thrTVShow);
        addToHistoryMap(thrTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        TVShow fouTVShow = new TVShow("Leverage", "Crime, Thriller", 7, 40, 5, 70, false);
        addToList(fouTVShow);
        addToHistoryMap(fouTVShow);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Movie twoMovie = new Movie("Lucky Number Slevin", "Crime, Drama, Mystery", 8, 110);
        addToList(twoMovie);
        addToHistoryMap(twoMovie);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Movie thrMovie = new Movie("The Dark Knight", "Action, Crime, Drama", 9, 152);
        addToList(thrMovie);
        addToHistoryMap(thrMovie);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
