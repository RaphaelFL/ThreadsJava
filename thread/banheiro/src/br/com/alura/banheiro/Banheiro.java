package br.com.alura.banheiro;

import java.util.*;
import java.util.concurrent.BrokenBarrierException;

public class Banheiro {

    public void fazNumero1() {

        System.out.println("entrando no banheiro");
        System.out.println("fazendo coisa rapida");

try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dando descarga");
        System.out.println("lavando a mao");
        System.out.println("saindo do banheiro");
    }

    public void fazNumero2() {

        System.out.println("entrando no banheiro");
        System.out.println("fazendo coisa demorada");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dando descarga");
        System.out.println("lavando a mao");
        System.out.println("saindo do banheiro");
    }
}