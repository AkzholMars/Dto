import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        List<User> users = List.of(
                new User(1,"user1",24,"user1@mail.ru"),
                new User(2, "usr2", 25, "user2@gmail.com"),
                new User(3, "useeeer3", 28, "user3@mail.ru"),
                new User(4, "ussser4", 21, "user4@list.ru"),
                new User(5, "uuser5", 30, "user5@gmail.com"),
                new User(6, "user6", 33, "user6@ya.ru"),
                new User(7, "usedasr7", 34, "user7@mail.ru"),
                new User(8, "usasder8", 24, "user8@gmail.com"),
                new User(9, "uer9", 19, "user9@mail.ru"),
                new User(10, "usaer10", 20, "user10@mail.ru"));

        List<UserDto> userDtos = users.stream()
                .map(UserDto::new)
                .sorted(Comparator.comparingInt(UserDto::getAge))
                .toList();

        List<Integer> summ = userDtos.stream()
                .map(UserDto::getAge)
                .toList();
//        System.out.println(summ.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Отсортированный список");
        userDtos.forEach(System.out::println); //#1
        System.out.println("Фильтр по ID");
        users.stream().filter(p -> p.getId() % 2 == 0).forEach(System.out::println); //#2
        System.out.println("Фильтр по длине логина");
        userDtos.stream().filter(p -> p.getLogin().length() <= 5).forEach(System.out::println); //#3
        System.out.println("Фильтр по почте");
        userDtos.stream().filter(p -> p.getEmail().contains(".com")).forEach(System.out::println); //#4
        System.out.println("Список Email");
        userDtos.stream().forEach(p -> System.out.println(p.getEmail())); //#5
        System.out.println("Сумма всех возрастов");
        int sum = 0;
        for (Integer integer : summ) {
            int intValue = integer.intValue();
            sum += intValue;
        }
        System.out.println(sum);

        for (UserDto user: userDtos) {
            hashMap.put(user.getLogin(), user.getEmail());
        }
        System.out.println(hashMap);
    }

}