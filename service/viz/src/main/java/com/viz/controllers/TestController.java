import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @RequestMapping("/test")
  public String testApplication() {
    return "Hello World!!";
  }
}