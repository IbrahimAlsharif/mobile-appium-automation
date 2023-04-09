package API;

import io.restassured.response.ValidatableResponse;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginTest {
    String baseUrl = "https://dashboard.famcare.app/";
    //String baseUrl = "https://backend-develop.famcare.app/";
    String loginAPI = baseUrl + "api/v2/users/login";

    @Test
    public void login() {
        JSONObject body = new JSONObject();
        body.put("mobile", "+966588001230");
        body.put("password", "123456");
        body.put("device_id", "3B21C4EB-1287-4E30-A8F7-38C46D4C5D8D");
        body.put("device_token", "e94d663be19dadae7fa7c5a2baf4506295e6cb47230b04943248cccb9a21a742");
        body.put("device_type", "ios");
        body.put("player_id", "65aec8b8-9c0a-44eb-b781-7b4da66c05bf");
        body.put("referral_link", null);
        ValidatableResponse response = given().
                header("Content-Type", "application/json")
                .body(body).when().post(loginAPI).then()
                .assertThat().statusCode(200)
                //.header("host",equalTo("dashboard.famcare.app" ))
                .body("data.id", is(104760))
                .body("data.name", notNullValue())
                .body("data.mobile", is("+966588001230"))
                .body("data.is_verified", equalTo(true)
                );
        response.log().body();

    }


    @Test
    public void login01() {
        UserLogin userLogin = new UserLogin("+966588001230",
                "123456",
                null,
                "3B21C4EB-1287-4E30-A8F7-38C46D4C5D8D",
                "e94d663be19dadae7fa7c5a2baf4506295e6cb47230b04943248cccb9a21a742",
                "ios",
                "65aec8b8-9c0a-44eb-b781-7b4da66c05bf");


        ValidatableResponse response = given().
                header("Content-Type", "application/json")
                .body(userLogin).when().post(loginAPI).then()
                .assertThat().statusCode(200)
                //.header("host",equalTo("dashboard.famcare.app" ))
                .body("data.id", is(104760))
                .body("data.name", notNullValue())
                .body("data.mobile", is("+966588001230"))
                .body("data.is_verified", equalTo(true)

                );
        response.log().body();

    }

    @Test
    public void login02() {
        UserLogin userLogin = new UserLogin("+966588001230",
                "123456",
                null,
                "3B21C4EB-1287-4E30-A8F7-38C46D4C5D8D",
                "e94d663be19dadae7fa7c5a2baf4506295e6cb47230b04943248cccb9a21a742",
                "ios",
                "65aec8b8-9c0a-44eb-b781-7b4da66c05bf");


        UserObject response = given().
                header("Content-Type", "application/json")
                .body(userLogin).when().post(loginAPI).then().extract().as(UserObject.class);

//        UserObject expected= new UserObject();
//        assertThat(response, samePropertyValuesAs(expected));
        assertThat(response.getData().getId(), is(104760));
        assertThat(response.getData().getMobile(), is("+966588001230"));
        assertThat(response.getData().getIs_verified(), is(true));
    }
}
