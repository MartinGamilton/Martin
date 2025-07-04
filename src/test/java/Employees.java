public class Employees {
    public static void main(String[] args) {
      int programmers = 10;
      int testersPerProgrammers = 3;
      int supportPerProgrammers = 1;
      int totalTesters = programmers* testersPerProgrammers; //Количество тестеров
      int totalSupport = programmers*supportPerProgrammers;//Количество специалистов поддержки
      int technicalSpecialists = programmers* totalTesters * totalSupport;//Всего специалистов
      System.out.println("Программистов на проекте - " + programmers);
      System.out.println("Тестировщиков на проекте - "+ totalTesters);
      System.out.println("Специалистов поддержки на проекте - "+ totalSupport);
      System.out.println("Общее количество специалистов на проекте - "+ technicalSpecialists);
    }
}
