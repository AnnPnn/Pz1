package mypackage;

import java.util.Comparator;

class ballCompare implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s2.ball - s1.ball;
    }
}