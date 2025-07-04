public class Cup {
    public static void main(String[] args) {
        int glassVolumeInMilliliters = 60;//Объем стакана в миллиметрах
        double percent = 50.0;//На сколько процентов заполнен стакан
        double waterInTheGlass = (glassVolumeInMilliliters * percent)/100;//Сколько миллилитров воды в стакане
        System.out.println("Стакан заполнен на "+percent);
        System.out.println("Объем стакана "+ glassVolumeInMilliliters +"мл.");
        System.out.println(waterInTheGlass + " миллилитров воды в стакане.");
    }
}