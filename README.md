# Student Management System

This repository contains a comprehensive Student Management System developed using Core Java with a strong emphasis on Object-Oriented Programming (OOP) principles. The system is designed to manage various aspects of student information, including courses, attendance, fees, and topics covered.

## Table of Contents

- [Features](#features)
- [Class Structure](#class-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Contact](#contact)

## Features

- **Manage Courses**: Add, view, and remove courses with associated topics and fees.
- **Manage Students**: Add, view, and remove student information including address details.
- **Attendance Management**: Record and view attendance for students, with functionality to track absentees on specific dates.
- **Fee Management**: Process fee payments, view total fees, and check outstanding balances.
- **Topic Management**: View and manage topics covered in courses, including the ability to record topics covered by individual students.

## Class Structure

### Core Classes

- **App.java**: The main entry point for the application, providing a menu-driven interface for accessing different functionalities.
- **Address.java**: Handles the address details of students.
- **Attendance.java**: Represents the attendance record for a student.
- **AttendanceRepo.java**: Repository for storing attendance records.
- **AttendanceService.java**: Service class for managing attendance-related operations.
- **Course.java**: Represents a course with details such as code, name, topics, and fees.
- **CourseEnrolled.java**: Represents the enrollment of a student in a course.
- **CourseEnrolledRepo.java**: Repository for storing course enrollment details.
- **CourseRepo.java**: Repository for storing course details.
- **CourseService.java**: Service class for managing course-related operations.
- **ExceptionHandling.java**: Utility class for handling exceptions and validating inputs.
- **Fees.java**: Represents the fee details for a student.
- **FeesRepo.java**: Repository for storing fee-related records.
- **FeesService.java**: Service class for managing fee-related operations.
- **Loaders.java**: Utility class for loading initial data into the system.
- **Student.java**: Represents a student with details such as ID, name, and address.
- **StudentRepo.java**: Repository for storing student details.
- **StudentService.java**: Service class for managing student-related operations.
- **TopicCovered.java**: Represents a topic covered by a student in a course.
- **TopicServices.java**: Service class for managing topics related to courses.
- **TopicsCoveredRepo.java**: Repository for storing topics covered by students.

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/rex-alan/Student-Management-System.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd Student-Management-System
    ```

3. **Compile the Java files**:
    ```bash
    javac -d bin src/*.java
    ```

4. **Run the application**:
    ```bash
    java -cp bin App
    ```

## Usage

1. **Run the application**:
    ```bash
    java -cp bin App
    ```

2. **Follow the on-screen prompts** to navigate through different functionalities:
    - Students
    - Courses
    - Attendance
    - Fees
    - Topics Covered

## Contact

For any queries or contributions, please contact rexalan1174@gmail.com.
