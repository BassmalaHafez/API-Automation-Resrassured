package AutomatedAPIs;

import Modules.Product;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTesting {
    @Test
    public void createSerializedProduct(){
        String endPoint = "http://localhost:8888/API_testing/product/create.php";
        Product product = new Product(
                "water bottle1",
                "blue water bottle",
                15.5,
                3,
                "Active Wear-Unisex"

        );

       var response = given().body(product).when().post(endPoint).then();
       response.log().body();

    }
}
