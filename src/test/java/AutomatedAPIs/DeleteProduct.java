package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteProduct {
    @Test
    public void deleteProduct(){
        String endPoint= "http://localhost:8888/API_testing/product/delete.php";
        String body = """
                {
                "id":19
                }
                """;
        var response =given().body(body).when().delete(endPoint).then();
        response.log().body();
    }
}
