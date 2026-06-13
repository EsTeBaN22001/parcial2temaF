package com.parcial2temaf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterABOTest {

    @ParameterizedTest
    @CsvSource({
            "valido@example.com, true",
            "invalido-sin-arroba, false",
            "valido2@dominio.com.ar, true",
            "@sindominio.com, false",
            "sin.extension@dominio, false"
    })
    public void testValidarEmailParametrizado(String mail, boolean resultadoEsperado) {
        // Inicializamos un abonado con el email parametrizado
        Abonado abonado = new Abonado("Test Parametrizado", "123456", mail, false, 1234, null);
        
        // Verificamos si la regex valida correctamente o no según lo esperado
        assertEquals(resultadoEsperado, abonado.validarEmail(), 
            "El resultado de validar el email '" + mail + "' no fue el esperado.");
    }
}
