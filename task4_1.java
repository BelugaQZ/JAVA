/*
    Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    * */

public class task4_1 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1); //помещает элемент в конец очереди
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue()); //возвращает первый элемент из очереди и удаляет его
        System.out.println(queue.first()); //возвращает первый элемент из очереди, не удаляя
        System.out.println("Сумма всех элементов: " + queue.sum()); //сумма всех элементов
    }
}
