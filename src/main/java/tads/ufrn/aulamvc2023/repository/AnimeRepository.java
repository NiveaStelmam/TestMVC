package tads.ufrn.aulamvc2023.repository;

import org.springframework.stereotype.Repository;
import tads.ufrn.aulamvc2023.model.Anime;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimeRepository {
    List<Anime> animes = new ArrayList<>(); // cria um arrayList chamado de "animes"  que contém elementos do tipo Anime
    public List<Anime> listAll(){ // método chamado de listAll(listar tudo) do tipo Anime
        return animes;
    }

    public void save(Anime a ){
        animes.add(a);
    }


}
