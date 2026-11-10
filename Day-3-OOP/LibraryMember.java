import java.util.Scanner;

abstract class Member {
    abstract int getLoanLimit();
}

class StudentMember extends Member {
    int getLoanLimit() {
        return 3;
    }
}

class FacultyMember extends Member {
    int getLoanLimit() {
        return 10;
    }
}

public class LibraryMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        int books = sc.nextInt();

        Member member;

        if (type.equals("S")) {
            member = new StudentMember();
        } else {
            member = new FacultyMember();
        }

        if (books >= 0 && books <= member.getLoanLimit()) {
            System.out.println("Allowed");
        } else {
            System.out.println("Denied");
        }
    }
}