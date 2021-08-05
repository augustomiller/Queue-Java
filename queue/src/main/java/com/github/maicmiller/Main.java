package com.github.maicmiller;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Car> queueCars = new LinkedList<>();

        queueCars.add(new Car("1º Ford"));
        queueCars.add(new Car("2º Chevrolet"));
        queueCars.add(new Car("3º Fiat"));

        System.out.println(queueCars.add(new Car("4º Peugeot")));
        System.out.println("My queue -> " + queueCars);

        /*
        * Offer: retorna "false" se não conseguir executar e "true" caso consiga...
        * Parecido com o add, mas o add retorna um "erro" quando não consegue executar...
        * */
        System.out.println(queueCars.offer(new Car("Renault")));
        System.out.println("My queue -> " + queueCars);

        /*
        * O peek pega (mas não remove) o elemento da cabeça da fila e caso estiver vazia,
        * e retorna "null"...
        * */
        System.out.println(queueCars.peek());
        System.out.println("My queue -> " + queueCars);

        /*
         * O peek pega (e remove) o elemento da cabeça da fila...
         * */
        System.out.println(queueCars.poll());
        System.out.println("My queue -> " + queueCars);

        /*
        * Verificar se a fila esta vazia...
        * */
        System.out.println("Is empty? -> " + queueCars.isEmpty());

        /*
        * Verifica o tamanho da fila...
        * */
        System.out.println("Size? -> " + queueCars.size());
    }
}
