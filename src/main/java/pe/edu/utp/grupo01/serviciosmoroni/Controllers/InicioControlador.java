package pe.edu.utp.grupo01.serviciosmoroni.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class InicioControlador {

    @GetMapping("/inicio")
    public String index(Model model){
        model.addAttribute("currentPage", "inicio");
        return "index";
    }

    @GetMapping("/contacto")
    public String contacto(Model model){
        model.addAttribute("currentPage", "contacto");
        return "contacto";
    }

    @GetMapping("/empresa")
    public String empresa(Model model){
        model.addAttribute("currentPage", "empresa");
        return "empresa";
    }

    @GetMapping("/galeria")
    public String galeria(Model model){
        model.addAttribute("currentPage", "galeria");
        return "galeria";
    }

    @GetMapping("/servicios")
    public String servicios(Model model){
        model.addAttribute("currentPage", "servicios");
        return "servicios";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("currentPage", "login");
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("currentPage", "register");
        return "register";
    }
}
