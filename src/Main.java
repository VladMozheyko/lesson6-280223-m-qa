import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    План занятия
    1) Повторение прошлого блока
    2) Знакомство с коллекциями
    3) Рассмотрение базовых примеров
     */

     /*
     Теория
     Алгоритм - это определенный порядок действий. Любая программа - это алгоритм.

     Структура данных - это способ организации данных в памяти компьютера. Каждая структура подразумевает определенный
     алгоритм работы с собой. Универсальных структур данных не существует - для каждой задачи будет эффективна определенная
     структура и определенный алгоритм с ней

     Сложность алгоритма - это количество шагов, которое необходимо для выполнения воставленой задачи. Сложность как правило
     изменяется в зависимости от объема данных. Как правило сложность линейно(прямо - вычисляется по формуле) зависит от объема данных, т.е. можно
     ее записать в виде формулы.
     Сложность обозначается как O(п) = n, где n - количество данных
     Зависимости бывают разные. Самые популярные из них: линейная, квадратичная, логарифмеческая, экспоненциальная,
     константная.

     Обратите внимание на то, что как правило сложность расчитывается по количеству шагов алгоритма, т.е. она никак не
     связана с вычислительной мощностью Вашего устройства

     Иногда алгоритм разрабатывается с учетом системы на которой он будет работать, но как правило используется первый
     подход к оценке сложности алгоритма

     Большинство задач уже имеет готовое решение, которое более-менее подойдет для текущей задачи, чтобы не повторять код
     разработчики языков создали уже готовые решение(библиотеки). В том числе в большинстве языков есть коллекции - набор
     классов для обработки базовых алгоритмов и структур данных.

     По факту при использовании библиотек или фреймворков мы пользуемся чужим кодом, чтобы эффективно им пользоваться нужно
     изучить его документация(API), большинтсва готовых решений есть достаточно подробная документация.

     В случае с освоением материалла по системным бибилотекам Java, кроме официальной документации(весьма громоздкой), существует
     достаточно большое количество упрощенных учебных пособий.

     В случае с коллекциями - они реулизует классические алгоритмы и структуры данных, поэтому знание этих алгоритмов и структур
     данных значительно упростит понимание как работать с коллекциями.

     Изменить код в библиотеке Java невозможно - read only access, но он некоторых возможно унаследоваться и расширить их
     функционал для своих нужд.

     Практическая часть

     Массив - переменная, которая содержит в себе переменные(простое объяснение)

     Массив - структура данных, в которой есть фиксированное количесвтво памяти и каждый элемент располагается возле предыдущего,
     т.е. элементы массива всегда идут последовательно друг за другом.

     Массивы эффективны для доступа к элементам, но неэффективны для модификации себя(удаление, вставка, увеличение числа
     элементов)

     Самостоятельная реализация полноценного алгоритма работы массива - весьма сложна, на этой лекции мы частично ее решим,
     но в Java есть класс ArrayList, который уже всн реализовал за нас. Если нам нужно работать с массивом мы можем просто
     создать объекта этого класса:

     ArrayList<Integer> array = new ArrayList()   -> создаем объект для работы с массивом типа int, в косых спокбах использован
     так называемый дженерик - мы просто указываем какого типа будет наш массив

     Cуществуют два класса для использования базовых алгоритмов: Collections и Arrays


     */

     /*
    Заметки

    Библиотека - это код, написанный другими специалистами, который предназначен для решения вспомогательных задач.
    Бибилиотеки помогают решать задачи, не вникая в устройства кода самой библиотеки.
    В современном мире язык программирования во многом определяется набором библиотек, которые он имеет

    Фреймворк - это готовой шаблон для работы, программисту остается только добавить в него свои данные.

    Integer - класс обертка для типа int.
    В классах обертках реализован дополнительный функционал для каждого примитивного типа.

     */

    public static Scanner scanner = new Scanner(System.in);              // Объект для чтения ввода пользователя
    public static Random random = new Random();                          // Создаю глобальный объект для генерации случайных чисел
    public static void main(String[] args) {                             // Точка входа. В Java всегда исполнение программы начинается отсюда
        /*
        Задача
        Есть необходимость получать данные от пользователя и сохранять их в массив. Данные типа int

        Решение
        Организуем ввод чисел в бесконечном цикле.
         */

//        ArrayList<Integer> array = new ArrayList<>();           // Создаем массив типа int
//        while (true){                                           // Пользовательский цикл. Для запроса чисел
//          System.out.println("Введите число: ");                // Приглашаем ввести число
//          int input = scanner.nextInt();                        // Считываем ввод
//          array.add(input);                                     // Добавляем элемент в массив
//          System.out.println("Массив: ");
//          System.out.println(array);                            // Выводим массив на консоль
//        }

        /*
        Задача
        Заполнить массив произвольными данными типа int и отсортировать его
        Решение
        Создадим объект класса ArrayList, создадим глобальную переменную Random(смотреть вверху)
         */

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 15; i++){                       // В цикле создаем 15 случайных чисел в диапазоне до 50 и добавляем их в массив
            arrayList.add(random.nextInt(50));
        }

        System.out.println("Неупорядоченный массив: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Упорядоченный массив: " + arrayList);

       /*
       Задача
       Реализовать класс для обработки массивов(своя версия ArrayList)
       Решение класс ArrayWorking
        */

        ArrayWorking arrayWorking = new ArrayWorking();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление элемента из массива: ");
        arrayWorking.deleteElement();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление массива: ");
        arrayWorking.deleteArray();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.erase();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        arrayWorking.displayInitialized();

        arrayWorking.erase();      // Исправляем вред от взлома - приводим массив к текущему состоянию
        arrayWorking.add(14);
        arrayWorking.add(17);
        System.out.println("Второе число: " + arrayWorking.get(1));

    }

    /*
    Дз
    1) Повторить(переписать) класс для типа double и типа char
    2) Ознакомиться с классом ArrayList и решить задачи:
    2.1) Вставить в него 5 элементов
    2.2) Удалить из него 4 элемента
    2.3) Снова вставить в него 3 элемента и найти один из элементов в этой структуре - вывести его на консоль

    3*) Сделать игру из проекта BinarySearch для числе от 0 до 1 миллиарда: бинарным поиском и линейным поиском.
    Какая будет сложность у этих алгоритмов?
     */
}
