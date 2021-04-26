package TestClass;

import Users.UserDto;
import Users.UsersMethodAction;
import Utils.CommonClass;
import Utils.Logger;
import Utils.Response;
import Utils.UniversalHeader;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import org.json.*;
import org.testng.asserts.SoftAssert;

public class usersTest extends CommonClass {
    @Test(dataProvider="userData",dataProviderClass=UsersDataprovider.class)
    public void postData(UserDto userDto) throws Exception {
        ObjectMapper objectMapper=new ObjectMapper();
        String payload= objectMapper.writeValueAsString(userDto);
        Response response= UsersMethodAction.PostUser(UniversalHeader.getHeader(),payload);
        SoftAssert softAssert=new SoftAssert();
        JSONObject jsonObject2=new JSONObject(response.getBody());
        Integer code=jsonObject2.getInt("code");
        Logger.log("It failed"+code.toString());
    }
}
