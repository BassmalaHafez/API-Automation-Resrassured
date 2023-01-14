package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateProduct {
    @Test
    public void updateProduct(){
        String endPoint = "http://localhost:8888/API_testing/product/update.php";
        String body = """
                {
                "id":19,
                "name":"Water Bottle",
                "description":"BLue Water Bottle , holds 46 ounces ",
                "price":15,
                "category_id":3
                }
                """;
         var response= given().body(body).when().put(endPoint).then();
         response.log().body();
    }
}
