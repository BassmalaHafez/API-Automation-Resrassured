package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class VerifyResponseStatusCode {
    @Test
    public void getProduct(){
        String endPoint= "http://localhost:8888/API_testing/product/read_one.php";
        given().
                queryParam("id" , 19).
        when().get(endPoint).then().log().body().assertThat().statusCode(200);

    }

}
