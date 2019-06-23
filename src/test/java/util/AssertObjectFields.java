package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.skyscreamer.jsonassert.JSONCompareMode.LENIENT;
import static org.skyscreamer.jsonassert.JSONCompareMode.STRICT;

public class AssertObjectFields {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void assertEquals(Object expectedObj, Object actualObj, boolean strict)
            throws JSONException, JsonProcessingException {
        JSONAssert.assertEquals(jsonStr(expectedObj), jsonStr(actualObj), strict ? STRICT : LENIENT);
    }

    public static void assertNotEquals(Object expectedObj, Object actualObj, boolean strict)
            throws JSONException, JsonProcessingException {
        JSONAssert.assertNotEquals(jsonStr(expectedObj), jsonStr(actualObj), strict ? STRICT : LENIENT);
    }

    private static String jsonStr(Object arun) throws JsonProcessingException {
        return objectMapper.writeValueAsString(arun);
    }


}
