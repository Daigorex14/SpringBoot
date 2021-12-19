package nvc.it.test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest3 {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "<center><h1>INDEX</h1><br><h2>Thanakit S.</h2> <br> <a href='/name'> Go to Name page</a></center>";
    }

    @RequestMapping("/name")
    @ResponseBody
    public String name (){
        return "<center><h1>I am Ultra Thanakit</h1> <a href='/'> Go to Index page</a> <br> <a href='/about'> Go to About page</a> <br> <a href='/contect'> Go to Contect page</a> </center>";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "<center><h1>About</h1> <br> <a href='/name'> Go to Name page</a> </center>";
    }

    @RequestMapping("/contect")
    @ResponseBody
    public String contect(){
        return "<center><h1>Contect</h1> <br> <a href='/name'> Go to Name page</a></center>";
    }
}
