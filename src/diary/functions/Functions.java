package diary.functions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lyudmila Abdullina
 * 29.05.2020
 */
public class Functions implements FunctionsInterface{

    private int size = 0;
    String[] array;
    Scanner sc = new Scanner(System.in);

    public Functions(){

        array = new String[20];

    }

    public String get(int index){

        if(index < size){

            return array[index];

        }else{

            throw new ArrayIndexOutOfBoundsException();

        }
    }

    public void increaseArraySize(){

        array = Arrays.copyOf(array, array.length * 2);

    }

    public int newSize(){

        return size;

    }

    public void add(String obj){// функция для добавления новой записи

        if(array.length - size <= 10){

            increaseArraySize();

        }

        array[size++] = obj;

    }

    public void meeting(){



        System.out.print("+-------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println();
        System.out.println("|                                                 Привет,друг!                                                                                    |");
        System.out.println("|                               Вы видите перед собой ежедневник, где вы можете делать некоторые записи.                                          |");
        System.out.print("|                                     Попробуйте что-нибудь написать: "                                                         );
        sc.nextLine();


        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                              Спасибо! Теперь мне нужна ваша команда для того, чтобы понять, что делать дальше.                                  |");
        System.out.println("|                                  Если вы хотите делать новые записи, напишите \"make a new note\" .                                               |");
        System.out.println("|                             Если вы хотите прочесть прошлые записи, напишите \"read past notes\" .                                                |");
        System.out.println("| ВНИМАНИЕ! Если вы хотите после того, как, например, прочли старые записи, сделать новые записи, вам для этого нужно перезапускать программу.    |");
        System.out.println("|              Кроме этого, пишите ваши записи на английском языке, или на транслите,для избежания ошибок кодировки(пример: proverka)             |");
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.print("Ваша команда: ");
    }
}

