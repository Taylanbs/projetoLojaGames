package com.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length =1000)
	@Size(min = 5, max = 1000, message = "O atributo descrição deve conter no mínimo 05 e no máximo 100 caracteres")
	@NotNull(message = "O Atributo Descrição é obrigatório")
	private String descricao;
	
	@NotNull(message = "O Atributo Preço é obrigatório")
	private Long preco;
	
	
	@Column(length =100)
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
	@NotNull(message = "O Atributo Nome é obrigatório")
	private String nome;
	
	 @ManyToOne
		@JsonIgnoreProperties("postagem")
		private Categoria categoria;

	    public Long getId() {
	        return this.id;

}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Long getPreco() {
			return preco;
		}

		public void setPreco(Long preco) {
			this.preco = preco;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}
