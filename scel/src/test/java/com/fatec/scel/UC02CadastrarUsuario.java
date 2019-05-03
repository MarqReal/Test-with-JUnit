package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.Usuario;

public class UC02CadastrarUsuario {
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("121212");
			umUsuario.setNome("Marcos e Franklin");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT02CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("");
			umUsuario.setNome("Marcos e Franklin");
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("Ra invalido", e.getMessage());
		}
	}
	@Test
	public void CT03CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa(null);
			umUsuario.setNome("Marcos e Franklin");
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("Ra invalido", e.getMessage());
		}
	}
	@Test
	public void CT04CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("121212");
			umUsuario.setNome("");
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	@Test
	public void CT05CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("121212");
			umUsuario.setNome(null);
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	@Test
	public void CT06Verifica_obtem_ra() {
		//cenario
		Usuario umUsuario = new Usuario();
		try {
			//acao
			umUsuario.setRa("121212");
			umUsuario.setNome("Marcos e Franklin");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umUsuario.getRa());
	}
	@Test
	public void CT07Verifica_obtem_ra() {
		//cenario
		Usuario umUsuario = new Usuario();
		try {
			//acao
			umUsuario.setRa("121212");
			umUsuario.setNome("Marcos e Franklin");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");
		}
		assertEquals("Marcos e Franklin", umUsuario.getNome());
	}
}
