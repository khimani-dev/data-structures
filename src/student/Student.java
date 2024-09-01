package student;

//FINDING THE MAXIMUM MARKS IN A SUBJECT

public class Student {
    int[] marks = {78, 95, 86, 75, 15, 70};

    public static void main(String[] args) {
        Student student = new Student(); //create the instance of the Student Class
        int maxMarks = student.getMaximum();//calling the getMaximum method
        System.out.println("Maximum marks:" + maxMarks);
    }

    public int getMaximum() {
        int maximum = 0;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }
}


//FINDING THE MINIMUM MARK OF THE STUDENTS
/*public class Student {
    int[] marks={58,29,86,30,75};

    public static void main(String[] args) {
        Student student=new Student();
        int minMarks= student.getMinimum();
            System.out.println("Minimum marks:" + minMarks);
    }
    public int getMinimum(){
        int minimum=Integer.MAX_VALUE; //The MAX_VALUE is used to set the highest value to access from before getting the minimum
        for (int mark:marks){
            if (mark<minimum){
                minimum=mark;
            }
        }
        return minimum;
    }
}
*/
