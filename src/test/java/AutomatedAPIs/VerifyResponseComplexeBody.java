package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class VerifyResponseComplexeBody {
    @Test
    public void getProduct(){
        String endPoint="http://localhost:8888/API_testing/product/read.php";
        given().queryParam("id", 2).when().get(endPoint).then()
                .log().body().assertThat().statusCode(200)
                .body("records.size()" , equalTo(19))
                .body("records.id" , everyItem(not(nullValue())))
                .body("records.name" , everyItem(notNullValue()))
                .body("records.description" , everyItem(notNullValue()))
                .body("records.price" , everyItem(notNullValue()))
                .body("records.category_id" , everyItem(notNullValue()))
                .body("records.category_name" , everyItem(notNullValue()))
                .body("records.id[0]" , equalTo("19"));
    }
}
