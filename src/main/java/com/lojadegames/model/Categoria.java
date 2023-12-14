package com.lojadegames.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria") // cria a tabela

public class Categoria {
	
	 @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		
		@NotBlank(message = "O atributo categoria é Obrigatório!") 
		@Column(length =100)
		@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
		private String nome;

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
		
		
		

	   
	  

}
