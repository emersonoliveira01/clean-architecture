package br.com.clean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("02766563180"));
    }

    @Test
    void deveriaCriarCPFComNumeroValidos() {
        String numero = "027.665.631-80";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }

}