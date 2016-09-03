/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contrloedeestoque.entidades;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wellington
 */
public class CategoriaTest {
    
    public CategoriaTest() {
    }

    /**
     * Test of getId method, of class Categoria.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Categoria instance = new Categoria();
          instance.setId(1);
        Integer expResult = 1;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Categoria.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 1;
        Categoria instance = new Categoria();
        instance.setId(id);
    }

    /**
     * Test of getDescricao method, of class Categoria.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Categoria instance = new Categoria();
        instance.setDescricao("teste");
        String expResult = "teste";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescricao method, of class Categoria.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "nada";
        Categoria instance = new Categoria();
        instance.setDescricao(descricao);
       
    }
    
}
