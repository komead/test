package automobiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Truck truck = null;

        List<Truck> truckList = new ArrayList<Truck>();

        int counter = 0, number;
        boolean stopper = true;
        while(stopper)
        {
            System.out.println("__________________________________________");
            System.out.println("Возможные действия:");
            System.out.println("0. Выход");
            System.out.println("1. Создать новый грузовик");
            System.out.println("2. Заполнить/изменить грузовик");
            System.out.println("3. Получить информацию о грузовиках");
            System.out.println("4. Удалить грузовик");

            Scanner input = new Scanner(System.in);

            System.out.print("\nВведите действие: ");
            int action = input.nextInt();

            switch (action)
            {
                case 0:
                    input.close();
                    stopper = false;
                    break;
                case 1:
                    truckList.add(new Truck());
                    System.out.println("Грузовик создан");
                    counter++;
                    break;
                case 2:
                    System.out.println("Всего грузовиков: " + counter);
                    System.out.print("Выберите грузовик для изменения: ");
                    if (counter == 0)
                    {
                        System.out.println("Нечего изменять!");
                        break;
                    }
                    System.out.print("Введите номер грузовика которого хотите изменить: ");
                    number = input.nextInt();
                    if (number < 1 || number >= counter)
                        System.out.print("Нету такого грузовика!");
                    else
                    {
                        System.out.print("Введите максимальную скорость: ");
                        int maxSpeed = input.nextInt();
                        System.out.print("Введите вес: ");
                        float weight = input.nextFloat();
                        System.out.print("Введите цвет: ");
                        String color = input.next();
                        System.out.print("Введите вместимость: ");
                        float capacity = input.nextFloat();
                        (truckList.get(number - 1)).setInformation(maxSpeed, weight, color, capacity);
                        System.out.println("Грузовик №" + number + " изменён!");
                    }
                    break;
                case 3:
                    System.out.println("Всего грузовиков: " + counter);
                    for(int i = 0; i < counter; i++)
                    {
                        System.out.println("Грузовик №" + (i + 1) + ":");
                        (truckList.get(i)).getInformation();
                    }
                    break;
                case 4:
                    System.out.println("Всего грузовиков: " + counter);
                    if (counter == 0)
                    {
                        System.out.println("Нечего удалять!");
                        break;
                    }
                    System.out.print("Введите номер грузовика которого хотите удалить: ");
                    number = input.nextInt();
                    if (number < 1 || number >= counter)
                        System.out.println("Нету такого грузовика!");
                    else
                    {
                        truckList.remove(number - 1);
                        System.out.println("Грузовик №" + number + " удалён!");
                        counter--;
                    }
                    break;
                default:
                    System.out.println("Нету такого действия!");
                    break;
            }
        }
    }
}