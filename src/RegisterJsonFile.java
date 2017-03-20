import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RegisterJsonFile {

  private static String jsonInString;

  public static void JavaToJson(Object object) throws JsonGenerationException, JsonMappingException, IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    //Object to JSON in file
    mapper.writeValue(new File("file.json"), object);

    jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    
    System.out.println(jsonInString);
    
    
    System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object));
  }
  
  public static Object JsonToJava(String file) throws JsonParseException, JsonMappingException, IOException {
    ObjectMapper mapper = new ObjectMapper();

    //JSON from file to Object
    Object object = mapper.readValue(new File(file), Object.class);

    //JSON from String to Object
   // Object object = mapper.readValue(jsonInString, Object.class);
    return object;
  }
}
