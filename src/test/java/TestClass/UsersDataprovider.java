package TestClass;

import Users.UserDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class UsersDataprovider {
    public static ObjectMapper objectMapper=new ObjectMapper();
    public String USER_DATA="src/test/java/TestData/usersdata.json";
    @DataProvider(name ="userData")
    public Object[][] sendDatatoUser() throws IOException {
        String createdData=new String(Files.readAllBytes(Paths.get(USER_DATA)));
        TypeReference typeReference=new TypeReference<List<UserDto>>() {
        };
        List<UserDto> userDtos=objectMapper.readValue(createdData,typeReference);
        Object[][] obj=new Object[userDtos.size()][];
        for (int i=0;i<userDtos.size();i++)
        {
            obj[i]=new Object[]{userDtos.get(i)};
        }
        return obj;
    }
}
