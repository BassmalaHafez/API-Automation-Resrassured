package AutomatedAPIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {
    @Test
    public void getCategories(){
        String endpoint = "http://localhost:8888/API_testing/product/read.php";
        var response = given().when().get(endpoint).then();
        response.log().body();
    }

    @Test
    public void getProduct(){
        String endpoint = "http://localhost:8888/API_testing/product/read_one.php";
        var response =
                given().
                        queryParam("id", 2).
                        when().
                        get(endpoint).
                        then();
        response.log().headers();
    }

}
