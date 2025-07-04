public class ravelTime {
    public static void main(String[] args) {
        int distanceKm = 10;//Расстояние в километрах от дома до офиса
        double taxiSpeed = 50.0;//Средняя скорость такси
        double timeToOffice = (double) distanceKm / taxiSpeed;//Время за которое тестировщик добирается от дома до офиса
        double vehicleDecelerationFactor = 1.4;//Коэффициент замедления транспорта вечером
        double timeHomeFromWork = timeToOffice*vehicleDecelerationFactor;
        System.out.println("Расстояние от дома до офиса "+ distanceKm+" км");
        System.out.println("Средняя скорость такси = "+ taxiSpeed+" км/ч");
        System.out.println("За "+ timeToOffice+" часов тестировщик добирается до офиса");
        System.out.println("Коэффицент замедления "+vehicleDecelerationFactor+" часов");
        System.out.println("Время возвращения домой вечером "+timeHomeFromWork);
    }
}
