package edu.escuelaing.arem;

import spark.Request;
import spark.Response;

import static spark.Spark.*;

/**
 * Minimal web app example for Heroku using SparkWeb
 *@author Camila Fetecua y Luis Daniel Benavides
 */
public class App {
    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        staticFiles.location("/public");
        port(getPort());
        get("/results", (req, res) -> resultsPage(req, res));
        get("/inputDataIEXCloud", App::inputDataPageIEXCloud);

    }



    private static String resultsPage(Request req, Response res) {
        return req.queryParams("firstname") + " " +
                req.queryParams("lastname");
    }

    private static String inputDataPageIEXCloud(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action=\"/iexService\">"
                + "  Stock:<br>"
                + "  <input type=\"text\" name=\"stock\" value=\"aapl\">"
                + "  <br>"
                + "  Time Series:<br>"
                + "  <input type=\"text\" name=\"time_series\" value=\"today\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4589; //returns default port if heroku-port isn't set (i.e. on localhost)
    }


 }