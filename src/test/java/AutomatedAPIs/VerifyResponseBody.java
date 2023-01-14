package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VerifyResponseBody {
    @Test
    public void getProduct(){
        String endPoint= "http://localhost:8888/API_testing/product/read_one.php";

       given().queryParam("id" , 19).
               when().get(endPoint).
               then().body("id", equalTo("19"))
                .body("name" , equalTo("water bottle"))
                .body("description" , equalTo("blue water bottle"))
                .body("price" , equalTo("14.50"))
                .body("category_id" , equalTo("3"))
                .body("category_name" , equalTo("Active Wear - Unisex")).assertThat().statusCode(200);
    }
}
