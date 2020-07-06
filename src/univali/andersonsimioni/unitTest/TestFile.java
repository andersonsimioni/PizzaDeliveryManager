package univali.andersonsimioni.unitTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import univali.andersonsimioni.File;

public class TestFile {

    public static void run(){
        File.getPizzasByFile("sources/pizzas.json");
    }
}
