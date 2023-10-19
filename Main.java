import java.time.LocalDate;

public class Main {
    static FamilyTree testTree(){
        FamilyTree tree = new FamilyTree();

        Human vasya = new Human("Василий", Gender.Male, LocalDate.of(1991, 12, 10));
        Human masha = new Human("Мария", Gender.Female, LocalDate.of(1965, 9, 15));
        tree.add(vasya);
        tree.add(masha);
        tree.setWedding(vasya, masha);

        Human christina = new Human("Кристина", Gender.Female, LocalDate.of(1988, 7, 5));
        Human semyon = new Human("Семён", Gender.Male, LocalDate.of(1991, 1, 21));
        tree.add(christina);
        tree.add(semyon);

        Human larisa = new Human("Лариса", Gender.Female, LocalDate.of(1945, 9, 1));
        larisa.addChild(vasya);
        tree.add(larisa);

        return tree;
    }

}
