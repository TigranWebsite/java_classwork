public class Main {
    public static void main(String[] args) {
/*
@Davit
Barev Davit, indz mek harc er hetaqrqrum, inchpes anem chisht
 vor mievnuyn baznum tarber ashxatoxneri anunner u tvyalner grem,
 Sa hyuranocayin volorti ashxatakicneri hamar em grel, bazinner@ karox em shatacnel u shatacnel, bayc hetaqrqrum er
 ete mek baznum tarber ashxatoxner linen inch kargov avelacnem vor chisht lini,
 */
        GeneralManager general = new GeneralManager("Gayane", "Sahakyan", "Head Office ",
                "GM ", 4, 300000);
        general.printGM();
        general.print();

        FrontOffice frontM = new FrontOffice("Mariam", "Aydikyan", "Front Office", "Manager",
                2, 200000);
        frontM.printFR();
        frontM.print();

        Marketing mark = new Marketing("Rudik", "Rafayelyan", "Marketing", frontM.supervisor,
                4, 180000);
        mark.printMark();
        mark.print();

        Accountant accountant = new Accountant("Anahit", "Sahakyan", "Accoutant",
                mark.intership, 0, 100000);
        accountant.printAc();
        accountant.print();


    }


}
