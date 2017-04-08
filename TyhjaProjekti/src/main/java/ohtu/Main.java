package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan, ÄLÄ kuitenkaan laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String cUrl = "https://ohtustats2017.herokuapp.com/courses/1.json";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
        String cBodyText = Request.Get(cUrl).execute().returnContent().asString();

        //System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        Course course = mapper.fromJson(cBodyText, Course.class);
        
        int totalHrs = 0;
        int totalDone= 0;
        System.out.println("opiskelijanumero: " + studentNr + "\n");
        for (Submission submission : subs) {
            submission.setCourse(course);
            System.out.println(submission);
            totalHrs += submission.getHours();
            totalDone += submission.getDoneSize();
        }
        System.out.println("Yhteensä: " + totalDone + "tehtävää " + totalHrs 
                + " tuntia");

    }
}
