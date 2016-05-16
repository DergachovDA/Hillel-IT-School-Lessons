package homework;

//Квартира 40дол/день, если больше 7 дней то скидка 50дол от общей суммы, если больше 4 дней то 20дол.
//В программу вводим кол-во дней и нам выводит сумму к оплате.

public class RoomRental {

    public static void main(String[] args) {
        int pricePerDay = 40;
        int days;
        days = 2;
        int discount = days > 7 ? 50 : days > 4 ? 20 : 0;
        int price = days * pricePerDay - discount;
        System.out.println("The price for a room for " + days + " days: " + price + "$");
    }
}
