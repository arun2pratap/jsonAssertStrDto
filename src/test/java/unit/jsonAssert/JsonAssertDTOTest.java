package unit.jsonAssert;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Employee;
import dto.Manager;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import util.AssertObjectFields;

public class JsonAssertDTOTest {
    @Test
    public void assertDto_field_values_not_type_class_assertion() throws JsonProcessingException, JSONException {
        Employee employee = new Employee("Arun", 3, new String[]{"BA", "MA"});
        Manager manager = new Manager("Arun", 3, new String[]{"BA", "MA3"});
        AssertObjectFields.assertEquals(employee, manager, true);
    }

    // can perform all the test from JsonAssertUnitTest
}
