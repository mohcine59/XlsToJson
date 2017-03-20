import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Main {
  static List<Content> tags;

  public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
    
    
    
    
    tags = ReadXls.readXls("countries.xls");
    RegisterJsonFile.JavaToJson(tags);

  }

}
