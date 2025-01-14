package org.example.vending;

import java.util.Scanner;

public class VendingUI {

    //메서드들간 공유할만한
    private Scanner scanner;
    //협력자/조력자
    private VendingMachine vendingMachine;

    public VendingUI(){
        this.scanner = new Scanner(System.in);
        this.vendingMachine = new VendingMachine();
    }


    public void use() {

        while(true){
            System.out.println("1.아아 2.티 3.밀크커피 4.종료");
            String oper = this.scanner.nextLine();

            switch (oper){
                case "1":
                    System.out.println(vendingMachine.makeIA());
                    break;
                case "2":
                    System.out.println(vendingMachine.makeTea());
                    break;
                case "3":
                    System.out.println(vendingMachine.makeMilkCoffee());
                    break;
                case "4":
                    System.out.println("프로그램 종료 합니다.");
                    break;
            }//end switch
        }


    }

}
