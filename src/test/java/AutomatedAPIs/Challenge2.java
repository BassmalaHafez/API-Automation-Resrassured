package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Challenge2 {
    @Test
    public void getProduct(){
        String endPoint= "http://localhost:8888/API_testing/product/read_one.php";
        given().
                queryParam("id" , "18").
                when().get(endPoint).then().log().body().assertThat().statusCode(200).header("Content-Type", equalTo("application/json"))
                .body("id" , equalTo("18"))
                .body("name" , equalTo("Multi-Vitamin (90 capsules)"))
                .body("description" , equalTo("A daily dose of our Multi-Vitamins " +
                        "fulfills a day’s nutritional needs for over 12 vitamins and minerals."))
                .body("price" , equalTo("10.00"))
                .body("category_id" ,equalTo("4"))
                .body("category_name" , equalTo("Supplements"));
    }
}
