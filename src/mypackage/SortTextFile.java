package mypackage;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class SortTextFile
{
    public static void main(String[] args)throws IOException
    {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\input.txt"));

        ArrayList<Student> students = new ArrayList<>();

        String currentLine = reader.readLine();

        while (currentLine != null)
        {
            String[] studentParameter = currentLine.split(" ");

            String name = studentParameter[0];
            String faculty = studentParameter[1];
            String mail = studentParameter[2];
            int ball = Integer.valueOf(studentParameter[3]);

            students.add(new Student(name, faculty, mail, ball));

            currentLine = reader.readLine();
        }


        students.sort(new ballCompare());

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\output.txt"));

        for (Student student : students)
        {
            writer.write(student.name);
            writer.write(" "+student.faculty);
            writer.write(" "+student.mail);
            writer.write(" "+student.ball);

            writer.newLine();
        }

        reader.close();

        writer.close();
    }
}
