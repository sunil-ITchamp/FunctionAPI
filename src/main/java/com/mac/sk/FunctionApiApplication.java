package com.mac.sk;

import com.mac.sk.employee.EmployeeRepository2;
import com.mac.sk.learning.*;
import com.mac.sk.learning.inheritance.singletablestrategy.Video;
import com.mac.sk.learning.inheritance.singletablestrategy.VideoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@SpringBootApplication
@Slf4j
public class FunctionApiApplication {

    private final DepartmentRepository departmentRepository;

    public FunctionApiApplication(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(FunctionApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(VideoRepository videoRepository, EmployeeRepository employeeRepository, AuthorRepository authorRepository, CourseRepository courseRepository, DepartmentRepository departmentRepository) {
        return args -> {
//            log.info("inside commandLineRunner");
//            Department department1 = Department.builder().name("IT").build();
//
//            Employee employee1 = Employee.builder().name("Tom").department(department1).build();
//            Employee employee2 = Employee.builder().name("Adam").department(department1).build();
//            Employee employee3 = Employee.builder().name("Tony").department(department1).build();
//
//            List<Employee> employeeList = new ArrayList<>();
//            employeeList.add(employee1);
//            employeeList.add(employee2);
//            employeeList.add(employee3);
//
//            department1.setEmployees(employeeList);
//            departmentRepository.save(department1);
//            departmentRepository.flush();
//
//            Department department = departmentRepository.findById(1L).get();
//            System.out.println(department.getName());
//
//            department.getEmployees().forEach(employee -> {
//                System.out.println(employee.getName());
//            });
//        };


            // One to One
            // =====  One to One Mapping Author to Course test start ===========
//            Author author1 = Author.builder().firstName("thomas").lastName("snow").email("tom@snow.com").build();
//            Course course1 = Course.builder().name("Java").description("Java Programming").build();
//            course1.setAuthor(author1);
//            author1.setCourse(course1);
//
//            authorRepository.save(author1);
//
//            //Approach 2 - save course
//            Author author2 = Author.builder().firstName("Ricky").lastName("Martin").email("ricky@gmail.com").build();
//            Course course2 = Course.builder().name("Spring").description("Spring Programming").build();
//            course2.setAuthor(author2);
//            author2.setCourse(course2);
//            courseRepository.save(course2);
//
            // =====  One to One Mapping Author to Course test over ===========

            // =====  One to Many Mapping Author to Course test START ===========
            Author author1 = new Author();
            author1.setFirstName("Thomas");
            author1.setLastName("Snow");
            author1.setEmail("thomas@gmail.com");

            Author author2 = new Author();
            author2.setFirstName("Ravi");
            author2.setLastName("Kumar");
            author2.setEmail("ravi@gmail.com");

            Course course1 = new Course();
            course1.setName(".NET");
            course1.setDescription("C# scripting");

            Course course2 = new Course();
            course2.setName("JavaScript");
            course2.setDescription("scripting");

            course1.getAuthors().add(author1);
            course1.getAuthors().add(author2);

            course2.getAuthors().add(author1);
            course2.getAuthors().add(author2);

            author1.getCourses().add(course1);
            author1.getCourses().add(course2);

            author2.getCourses().add(course1);
            author2.getCourses().add(course2);

            courseRepository.save(course1);
            courseRepository.save(course2);
            authorRepository.save(author1);
            authorRepository.save(author2);

            //USING BUILDER Pattern - there is an issue as Lists are getting null value at creation
//            Author author3 = Author.builder().firstName("Shyam").lastName("Thakur").email("shyam@gmail.com").build();
//            Course course3 = Course.builder().name("Python").description("Python Programming").build();
//
//            System.out.println(" " + Objects.isNull(author3.getCourses()));
//            System.out.println(" " + Objects.isNull(course3.getAuthors()));
//            course3.getAuthors().add(author3);
//            author3.getCourses().add(course3);
//            courseRepository.save(course3);
//            authorRepository.save(author3);

            var video = Video.builder()
                    .videoLength(10)
                    .name("good video")
                    .url("www.good.com")
                    .build();
            videoRepository.save(video);
        };
    }
}