package com.github.kyriosdata.exemplo.Exercicios;

import com.github.kyriosdata.exemplo.Exercicios.Exercicio1;
import static Exercicio1.erastostenes;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TesteExercicio1 {

    /**
     *
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Exercicio1.somaNaturais(-1);
    }    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Exercicio1.protudoInteiros(1,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void xMenorQue0yMenorque0UmInvalido() {
        Exercicios.potencia(-1,-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMenorque0eMaiorQue9999Invalido() {
        Exercicios.propriedade3025(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMaiorQue9999Menorque0eInvalido() {
        Exercicios.propriedade153(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMaiorQue1() {
        assertEquals(4, numeroPrimo(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMaiorQue1Vetoraigual0imenorigual2emaiorigualn() {
        assertEquals(0, erastostenes.NumeroPrimo(new int[] {1,2,3,4,5}, 2));
    }

    @Test (expected = IllegalArgumentException.class)
    public void bMenorIgualabMaiorIgual0() {
        assertEquals(6, maiorDivisor.numeroPrimo(29, 2, 2015));
    }

    @Test (expected = IllegalArgumentException.class)
    public void bMaiorIgual0bMenorIguala() {
        int diaDaSemana = LocalDate.of(5000, 1, 1).getDayOfWeek().ordinal();
        assertEquals(diaDaSemana, CrivoEratostenesSub.diaDaSemana(1, 1, 5000));
    }

    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Calendario();
    }

    private Object numeroPrimo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object erastostenes(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}