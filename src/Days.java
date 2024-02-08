import java.util.Scanner;

public enum Days {
    MONDAY {
        @Override
        public void lessons() {
            System.out.println("Дуйшомбу куну программирование боюнча сабак болот");

        }
    },

    TUESDAY {
        @Override
        public void lessons() {
            System.out.println("Шейшемби куну англис тили сабагы болот");
        }
    },
    WEDNESDAY {
        @Override
        public void lessons() {
            System.out.println("Шаршемби куну испан тили боюнча сабак болот");
        }
    },
    THURSDAY {
        @Override
        public void lessons() {
            System.out.println("Бейшемби куну практика болот");
        }
    },
    FRIDAY {
        @Override
        public void lessons() {
            System.out.println("Жума куну кайталоо сабагы болот");
        }
    },
    SATURDAY {
        @Override
        public void lessons() {
            System.out.println("Ишемби куну программирование сабагы болот");
        }
    },
    SUNDAY {
        @Override
        public void lessons() {
            System.out.println("Жекшемби куну дем алабыз");
        }
    };


    public abstract void lessons();

    public void method() {
        System.out.print("Monday [1]\n" +
                "Tuesday [2]\n" +
                "Wednesday [3]\n" +
                "Thursday [4]\n" +
                "Friday [5]\n" +
                "Saturday [6]\n" +
                "Sunday [7]\n" +
                "Бир кунду танданыз: ");
        Scanner scanner = new Scanner(System.in);
        int scanner1 = scanner.nextInt();

        switch (scanner1) {
            case 1:
                MONDAY.lessons();
                break;
            case 2:
                TUESDAY.lessons();
                break;
            case 3:
                WEDNESDAY.lessons();
                break;
            case 4:
                THURSDAY.lessons();
                break;
            case 5:
                FRIDAY.lessons();
                break;
            case 6:
                SATURDAY.lessons();
                break;
            case 7:
                SUNDAY.lessons();
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
    }
}
