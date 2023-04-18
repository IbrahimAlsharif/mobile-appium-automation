/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestRail;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static Base.WebSetup.WebSetupTest.testrailReport;

/**
 * @author HP
 */
public class TestRailManager {

    APIClient client;
    public static int
            PASSED = 1,
            FAILED = 5,
            Blocked = 2,
            UNTESTED = 3,
            RETEST = 4;


    public TestRailManager() {
        client = new APIClient("https://famcare.testrail.io");
        client.setUser("isharif@famcare.app");
        client.setPassword("Famcare@Testrail2022");

    }

    public void getResults() throws IOException, MalformedURLException, APIException {
        JSONObject c = (JSONObject) client.sendGet("get_case/2372");
        System.out.println(c.get("title"));
    }

    public void setResult(String testRunId, String testCaseID, int status, String shotPTH) throws IOException, MalformedURLException, APIException {
            Map data = new HashMap();
            data.put("status_id", status);
            data.put("comment", shotPTH);
            data.put("attachment", (shotPTH));
            JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + testRunId + "/" + testCaseID + "", data);
            if (status == TestRailManager.FAILED) {
                System.out.println(r.toJSONString());
                String result_id = r.get("id").toString();
                System.out.println(result_id);
                client.sendPost("add_attachment_to_result/" + result_id, shotPTH);
            }

    }


    public String createTestRun(String projectName, int projectId) throws APIException, IOException {
        Map data = new HashMap();
        data.put("name", projectName + new Date().toString());
        data.put("include_all", true);
        JSONObject response = (JSONObject) client.sendPost("add_run/" + projectId, data);
        return response.get("id").toString();
    }
}


