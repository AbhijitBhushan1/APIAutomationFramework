package Users;

public class Endpoints {
    public static String users="/users";
    public static String withParams(String pagenumber)
    {
        return "/public-api/users?page="+pagenumber;
    }
}
