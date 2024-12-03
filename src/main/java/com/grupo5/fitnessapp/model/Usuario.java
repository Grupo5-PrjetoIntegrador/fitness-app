package com.grupo5.fitnessapp.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres.")
	private String nome;
	
	@NotBlank(message = "O atributo idade é obrigatório!")
	private Long idade;
	
	@NotBlank(message = "O atributo altura é obrigatório!")
	private BigDecimal altura;
	
	@NotBlank(message = "O atributo peso é obrigatório!")
	private BigDecimal peso;
	
	@NotBlank(message = "O atributo gênero é obrigatório!")
	@Size(min = 8, max = 20, message = "O atributo gênero deve conter no mínimo 05 e no máximo 20 caracteres.")
	private String genero;

	@NotBlank(message = "O atributo Nível de Atividade é obrigatório!")
	@Size(min = 10, max = 30, message = "O atributo Nível de Atividade deve conter no mínimo 10 e no máximo 30 caracteres.")
	private String nivelAtividade;
	
	@NotBlank(message = "O atributo email é obrigatório!")
	@Size(min = 10, max = 50, message = "O atributo email deve conter no mínimo 10 e no máximo 50 caracteres.")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNivelAtividade() {
		return nivelAtividade;
	}

	public void setNivelAtividade(String nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
