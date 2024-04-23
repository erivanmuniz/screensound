package br.com.alura.screensound.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tiulo;

    @ManyToOne
    private Artista artista;

    private Musica(){}

    public Musica(String nomeMusica) {
        this.tiulo = nomeMusica;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTiulo() {
        return tiulo;
    }

    public void setTiulo(String tiulo) {
        this.tiulo = tiulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Musica='" + tiulo + '\'' +
                ", artista=" + artista.getNome();
    }
}
