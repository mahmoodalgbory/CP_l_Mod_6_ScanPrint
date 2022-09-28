import java.sql.SQLOutput;

public class FormattedPrint
{
    public static void main(String[] args)
    {
        String name = "mahmood algbory";
        double salary = 12345.67;
        int age = 19;

        for (int x = 0; x < 10; x++)
        System.out.printf("\nRecord: %-15s%5d%15.2f", name, age, salary);

        System.out.println(String.format("\n%15.2f", salary));
    }
}
