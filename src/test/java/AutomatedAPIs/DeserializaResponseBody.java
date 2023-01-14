package AutomatedAPIs;

import Modules.Product;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeserializaResponseBody {
    @Test
    public void getProductDeserializeResponseBody(){
        String endPoint= "http://localhost:8888/API_testing/product/read_one.php";
        given().queryParam("id" , "2")
                .when().get(endPoint)
                .as(Product.class);
    }
}
