import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 张家坤
 * @since 18-5-9 14:54
 */
@Controller
@EnableAutoConfiguration
public class SpringBootTest {
    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "html/before/login.html";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SpringBootTest.class, args);
    }
}
