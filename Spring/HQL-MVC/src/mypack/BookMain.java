package mypack;

import java.util.List;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class BookMain {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n1) INSERT");
            System.out.println("2) SHOW ALL RECORDS");
            System.out.println("3) RETRIEVE SPECIFIC RECORD");
            System.out.println("4) UPDATE RECORD");
            System.out.println("5) DELETE RECORD");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            switch (ch) {

            case 1: { // INSERT
                Book book = new Book();
                System.out.print("Enter Book Name: ");
                book.setBname(sc.next());
                System.out.print("Enter Price: ");
                book.setBprice(sc.nextInt());

                session.save(book);
                tx.commit();
                System.out.println("Inserted Successfully");
                break;
            }

            case 2: { // SHOW ALL
                Query<Book> q = session.createQuery("from Book", Book.class);
                List<Book> list = q.list();

                for (Book b : list) {
                    System.out.println(b.getBid() + " " + b.getBname() + " " + b.getBprice());
                }
                break;
            }

            case 3: { // RETRIEVE BY ID
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                Book b = session.get(Book.class, id);
                if (b != null)
                    System.out.println(b.getBid() + " " + b.getBname() + " " + b.getBprice());
                else
                    System.out.println("Record not found");
                break;
            }

            case 4: { // UPDATE
                Query q = session.createQuery(
                        "update Book set bprice=:p where bid=:id");
                q.setParameter("p", 1200);
                q.setParameter("id", 1);

                int rows = q.executeUpdate();
                tx.commit();
                System.out.println(rows + " record updated");
                break;
            }

            case 5: { // DELETE
                Query q = session.createQuery(
                        "delete from Book where bid=:id");
                q.setParameter("id", 2);

                int rows = q.executeUpdate();
                tx.commit();
                System.out.println(rows + " record deleted");
                break;
            }

            default:
                System.out.println("Invalid choice");
            }

            session.close();

            System.out.print("Do you want to continue (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice != 'n');

        sf.close();
        sc.close();
    }
}
