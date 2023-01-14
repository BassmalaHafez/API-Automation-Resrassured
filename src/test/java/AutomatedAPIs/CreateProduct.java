package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateProduct {
    @Test
    public void createProduct(){
        String endPoint= "http://localhost:8888/API_testing/product/create.php";
        String requestBody = """
    {
    "name":"Water Bottle",
    "description":"BLue Water Bottle , holds 46 ounces ",
    "price":12,
    "category_id":3
    }
    """;

      var response = given().body(requestBody).when().post(endPoint).then();
      response.log().body();
    }
}
