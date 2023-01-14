package AutomatedAPIs;

import Modules.Product;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Challenge1 {
    @Test
    public void createProduct() {
        String endPoint = "http://localhost:8888/API_testing/product/create.php";
        Product product = new Product(
                "Sweatband",
                "Sweatband for daily routine",
                5,
                3,
                "Active Wear-Unisex"
        );

        var response = given().body(product).when().post(endPoint).then();

        response.log().body();
    }
    @Test
    public void updateProduct(){
        String endPoint = "http://localhost:8888/API_testing/product/update.php";
        Product product = new Product(
                20,
                "Sweatband",
                "Sweatband for daily routine",
                6,
                3,
                "Active Wear-Unisex"
        );
        var response =given().body(product).when().put(endPoint).then();
        response.log().body();
    }
    @Test

    public void GetProduct(){
        String endPoint = "http://localhost:8888/API_testing/product/read.php";
        Product product = new Product(
             20
        );
        var response= given().body(product).when().get(endPoint).then();
        response.log().body();

    }
    @Test
    public void deleteProduct(){
        String endPoint= "http://localhost:8888/API_testing/product/delete.php";
        Product product = new Product(
                20
        );
        var response=given().body(product).when().delete(endPoint).then();
        response.log().body();
    }
}
