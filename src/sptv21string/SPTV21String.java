/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21string;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SPTV21String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" -----Работа со строкой----- ");
        System.out.print("Введите строку (используйте латиницу):");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        do{
            System.out.println("Функции программы:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Посчитать количество символов в строке");
            System.out.println("2. Посчитать количество слов в строке");
            System.out.println("3. Почсчитать количество слов в строке");
            System.out.println("4. Заменить подстроку в строке на указанную");
            System.out.print("Выберите номер функции: ");
            int numFunc = scanner.nextInt();
            scanner.nextLine();
            if(numFunc == 0){
                break;
            }else if(numFunc == 1){
                System.out.println("Вы выбрали пункт "+numFunc);
                int countCHarInStr=0;
                char[] chars = str.toCharArray();
                int countCharInStr=0;
                for (int i = 0; i < chars.length; i++) {
                    if(chars[i] != ' '){
                        countCharInStr++;
                    }
                }
                System.out.println("В строке "+countCharInStr + " символ. ");
            }else if(numFunc == 2){
                System.out.println("Вы выбрали пункт "+numFunc);
            }else if(numFunc == 3){
                System.out.println("Вы выбрали пункт "+numFunc);
            }else if(numFunc == 4){
                System.out.println("Вы выбрали пункт "+numFunc);
            }
        }while(true);
    }
   
}