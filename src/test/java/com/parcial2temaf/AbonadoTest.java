package com.parcial2temaf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AbonadoTest {

    private Abonado abonado;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando pruebas de la clase Abonado...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando pruebas de la clase Abonado.");
    }

    @Before
    public void setUp() {
        // Inicializamos un abonado base antes de cada prueba
        abonado = new Abonado("Juan Perez", "1122334455", "juan.perez@example.com", true, 1234, null);
    }

    @After
    public void tearDown() {
        abonado = null;
    }

    @Test
    public void testValidarPsw() {
        // Esta prueba DEBE FALLAR según la consigna
        // Verificamos con una contraseña incorrecta y esperamos que sea true, lo que provocará el fallo.
        assertTrue("Esta prueba debe fallar intencionalmente según consigna", abonado.validarIngreso(9999));
    }

    @Test
    public void testValidarEmail() {
        // ÉXITO: El mail es válido
        assertTrue("El email debería ser válido", abonado.validarEmail());
    }

    @Test
    public void testCambioPass() {
        // ÉXITO: Cambiamos la contraseña y verificamos
        abonado.cambioPassword("5678");
        assertEquals("La contraseña debió cambiar a 5678", 5678, abonado.getPassword());
    }

    @Test(timeout = 50)
    public void testDelay() {
        // TIMEOUT: Esta prueba DEBE dar Timeout según la consigna
        // Hacemos que el método tarde más que el timeout configurado (100ms > 50ms)
        abonado.delay(100);
    }

    @Test
    public void testAbonadosDiferentes() {
        // ÉXITO: Comparamos con otro abonado distinto
        Abonado otroAbonado = new Abonado("Maria Lopez", "1199887766", "maria@example.com", false, 4321, null);
        assertTrue("Los abonados deben ser diferentes (distinto nombre)", abonado.abonadosDiferentes(otroAbonado));
    }
}
