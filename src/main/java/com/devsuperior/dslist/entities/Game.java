package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //entidade da tabela. referencia o banco de dados
@Table(name = "tb_game") //referencia na tabela de banco de dados que a tabela deve ser o que está descrito
public class Game{

    @Id //referencia uma chave PK no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //referencia um auto incremento dos ids na tabela de banco de dados
    private Long id;
    private String title;

    @Column(name = "game_year") //renomeia a coluna da tabela de banco de dados
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    
    @Column(columnDefinition = "TEXT") //define a tipagem da coluna do banco de dados
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game(){
    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
                String shortDescription, String longDescription){
    	
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platforms;
    }

    public void setPlatform(String platforms) {
        this.platforms = platforms;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override //Indica que uma declaração de método tem a intenção de substituir uma declaração de método em um supertipo.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}