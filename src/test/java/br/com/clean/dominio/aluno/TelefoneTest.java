package br.com.clean.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComTelefonesInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("62", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("62", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123"));
    }

    @Test
    void deveriaCriarTelefoneComDDDENumeroValidos() {
        String ddd = "62"; String numero = "981573901";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }

}