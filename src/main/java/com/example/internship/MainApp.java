package com.example.internship;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.example.internship.dao.FeedbackDAO;
import com.example.internship.dao.LectureDAO;
import com.example.internship.dao.StudentDAO;
import com.example.internship.entity.Feedback;
import com.example.internship.entity.Lecture;
import com.example.internship.entity.Student;

public class MainApp 

{
    public static void main(String[] args)
    
    {
        Scanner sc = new Scanner(System.in);
        
        LectureDAO lectureDAO = new LectureDAO();
        StudentDAO studentDAO = new StudentDAO();
        FeedbackDAO feedbackDAO = new FeedbackDAO();

        while (true)
        
        {
        	
            System.out.println("\n--- Internship Lecture System ---");
            System.out.println("1. Add Lecture");
            System.out.println("2. Register Student");
            System.out.println("3. Give Feedback");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            String input = sc.nextLine();
            
              if (input.isBlank())
            	  
            	  continue;

            int ch = Integer.parseInt(input);

            switch (ch)
            
            {
                case 1:
                    Lecture l = new Lecture();
                    System.out.print("Enter Topic Name : ");
                    l.setTopic(sc.nextLine());

                    System.out.print("Enter Speaker Name: ");
                    l.setSpeaker(sc.nextLine());

                    System.out.print("Enter The Date (yyyy-MM-dd): ");
                    l.setDate(LocalDate.parse(sc.nextLine()));

                    lectureDAO.addLecture(l);
                    System.out.println("Lecture added successfully.");
                    break;

                case 2:
                	
                    Student s = new Student();
                    System.out.print("Enter Student Name: ");
                    s.setName(sc.nextLine());

                    System.out.print("Enter Student Email: ");
                    s.setEmail(sc.nextLine());

                    studentDAO.addStudent(s);
                    
                    System.out.println("Student registered successfully.");
                    break;

                case 3:
                	
                    List<Student> students = studentDAO.getAllStudents();
                    List<Lecture> lectures = lectureDAO.getAllLectures();

                    if (students.isEmpty() || lectures.isEmpty())
                    
                    {
                        System.out.println("Please add both students and lectures first!");
                        break;
                    }

                    System.out.println("Students:");
                    
                    for (Student stu : students)
                    
                    {
                        System.out.println("ID: " + stu.getId() + ", Name: " + stu.getName());
                    }

                    System.out.println("Lectures:");
                    for (Lecture ll : lectures) 
                    
                    {
                        System.out.println("ID: " + ll.getId() + ", Topic: " + l.getTopic());
                    }

                    Feedback f = new Feedback();
                    
                    System.out.print("Student ID: ");
                    int sid = Integer.parseInt(sc.nextLine());

                    System.out.print("Lecture ID: ");
                    int lid = Integer.parseInt(sc.nextLine());

                    System.out.print("Comments: ");
                    f.setComments(sc.nextLine());

                    System.out.print("Rating (1-5): ");
                    f.setRating(Integer.parseInt(sc.nextLine()));

                    feedbackDAO.addFeedback(f, sid, lid);
                    break;
                    
                case 4:
                	
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    studentDAO.deleteStudent(deleteId);
                    break;

   

                case 5:
                	
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                	
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
