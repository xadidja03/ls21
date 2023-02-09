package service;

import util.MenuUtil;

public class ManagementService {
    private static final double incrementEnergyByMeat=1.09;
    private static final double incrementEnergyByMilk=1.08;
    public static void manage(){
        MenuUtil menuUtil=new MenuUtil();
        byte option=menuUtil.entry();
        while (true){
            EnergyService energyService=new EnergyService();
            switch (option){
                case 1:
                    energyService.incrementEnergyByMilk();
                    break;
                case 2:
                    energyService.incrementEnergyByMeat();
                    break;
                case 3:
                    energyService.showEnergy();
                    break;
                default:
                    System.out.println("Invalid number");
        }

        }
    }
}
