package tads.ufrn.aulamvc2023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tads.ufrn.aulamvc2023.model.Anime;
import tads.ufrn.aulamvc2023.repository.AnimeRepository;

@Controller
public class AnimeController {

    AnimeRepository repository;

    public AnimeController(AnimeRepository repository) {

        this.repository = repository;
    }

    @RequestMapping(value = "/animes", method = RequestMethod.GET)

    public String doGet (Model model){

        Anime a = new Anime("Dr.Stone", "Aventura, comédia, ficção científica", "Boichi, Riichiro Inagaki");
        model.addAttribute("anime", a);
        repository.save(a);
        return "index";

    }
}
