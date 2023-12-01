import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача № 1");
        printIsLeapYear(2021);
        printRecommendedAppVersion(0, 2020);
        printDeliveryDays(90);

    }


    public static void printIsLeapYear(int year) {
        if (isLeap(year)) {
            System.out.println(year + " високосный ");
        } else {
            System.out.println(year + " не високосный ");
            System.out.println();
        }
    }

    static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printRecommendedAppVersion(int clientOs, int deviceYear) {
        System.out.println("задача № 2");
        System.out.print(" Установите ");
        if (isDeviceOld(deviceYear)) {
            System.out.print(" Облегченную ");
        }
        System.out.print(" Версию для ");
        if (clientOs == 0) {
            System.out.println(" iOs ");
        } else {
            System.out.println(" Android ");
            System.out.println();
        }
    }

    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;
    }


    public static void printDeliveryDays(int deliveryDistance) {
        System.out.println();
        System.out.println("задача № 3");
        System.out.println(" потребуется дней - " + calculateDeliveryDays(deliveryDistance));
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance < 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        }
        if (deliveryDistance > 100) {
            result = -1;
        }
        return result;
    }
}












