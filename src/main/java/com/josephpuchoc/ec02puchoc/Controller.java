package com.josephpuchoc.ec02puchoc;
import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controller{

    @GetMapping(path="/")
    public String home (){
        return "AT75832011 - Joseph Puchoc Hilario";
    }

    @GetMapping(path="idat/codigo")
    public String codigo(){
        return "AT75832011";
    }

    @GetMapping(path="idat/nombre-completo")
    public String nombre(){
        return "Joseph Puchoc Hilario";
    }

}