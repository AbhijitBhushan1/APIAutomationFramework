package Users;

import Enviornments.BaseUrls;
import Utils.BaseAPI;
import Utils.Response;

import java.util.Map;

public class UsersMethodAction {
    public static Response getUser( Map<String,String> header) throws Exception {
        return BaseAPI.sendGet(BaseUrls.users,header);
    }
    public static Response putUser(Map<String,String> header,String payload) throws Exception {
        return BaseAPI.sendPut(BaseUrls.users,header,payload);
    }
    public static Response PostUser(Map<String,String> header,String payload) throws Exception {
        return BaseAPI.sendPost(BaseUrls.getUsers()+Endpoints.users,header,payload);
    }
}
