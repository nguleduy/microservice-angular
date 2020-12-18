package com.example.microservicecoursemanagement.service;

import com.example.microservicecoursemanagement.model.Course;
import com.example.microservicecoursemanagement.model.Transaction;

import java.util.List;

public interface CourseService {

  List<Course> allCourses();

  Course findCourseById(Long courseId);

  List<Transaction> findTransactionsOfUser(Long userId);

  List<Transaction> findTransactionsOfCourse(Long courseId);

  Transaction saveTransaction(Transaction transaction);
}
