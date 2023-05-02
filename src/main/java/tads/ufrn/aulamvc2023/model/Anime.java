package tads.ufrn.aulamvc2023.model;

public class Anime {
    private String id;
    private String titulo;
    private String genero;
    private String autores;

    public Anime(String titulo, String genero, String autores) {
        this.titulo = titulo;
        this.genero = genero;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}
