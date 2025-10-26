# Midterm-project-group-03
Info 5100 Fall 25 Midterm-project-group-03
- **Documentation (README file)**
    - Project Title: Digital University Application
- **Team Information**
    - Venkata Ramana Mohan Chunchu (NUID: 003182285)
        - Role: University Admin
        - Responsibilities:
            - Administer user accounts (create, modify, and delete accounts)
            - Register persons (students, faculty, academic staff)
            - Manage student records (update, delete, or view student data)
            - Manage faculty records (update, delete, or view faculty data)
            - Manage own profile
    - Sabrina Tan (NUID: 003189756)
        - Role: Faculty Member
        - Responsibilities:
            - Manage courses (view, update course details)
            - Manage own profile
            - Generate performance reports (student grades in the class)
            - Manage student profiles (view hobbies, interests, academic progress)
    - Ziwei Song (NUID: 003156965)
        - Role: Student
        - Responsibilities:
            - Manage coursework (submit assignments, track progress)
            - Register for classes (enroll, drop courses)
            - Perform graduation audit (track credits and graduation requirements)
            - Review transcript (view academic history)
- **Project Overview**
    - This project is to develop a Swing UI based Java application to manage digital university operations like student enrollment, faculty management, course management, and admin staff management.
- **Installation & Setup Instructions**
    - This application is developed on Java JDK 19 and JAVA API libraries.
    - Clone Repository:
        - Open GitHub Desktop
        - Select Current repository
        - Click on Add and select Clone repository from the drop-down
        - Select “chunchuve/Midterm-project-group-03" and click on the Clone button
    - Application Setup:
        - Unzip the source code zip file
        - Open NetBeans IDE
        - Select File and Open Project
        - Locate the project Group-3-UniversityApp and select Open Project
        - Run the ProfileWorkAreaMainFrame.java in the University package
- **Authentication & Access Control**
    - User authentication is based on username and password. Every user login is authenticated by a user authentication module to check whether the username is valid and the password is correct. The user is notified via popup message if they enter an incorrect username and/or password. Once they log in successfully, the username and password fields and login button will disappear. Only the log out button will be displayed.
    - There are three roles (Admin, Faculty, and Student); each role is authorized to only access their own work areas and perform their responsibilities. The authorization check is done by a special authorization component.
- **Features Implemented**
    - Login page with login and log out feature (Venkata Ramana Mohan Chunchu & Ziwei Song).
    - User authentication and role-based user access control (Venkata Ramana Mohan Chunchu).
    - Administrator role (Venkata Ramana Mohan Chunchu):
        - Manage user accounts
        - Administer user accounts
        - Manage students
        - Manage faculty
        - Manage own admin profile
    - Faculty role (Sabrina Tan):
        - Manage courses (view, update course details)
        - Manage own profile
        - Generate performance reports (student grades in the class)
        - Manage student profiles (view hobbies, interests, academic progress)
    - Student role (Ziwei Song):
        - Manage coursework (submit assignments, track progress)
        - Register for classes (enroll, drop courses)
        - Perform graduation audit (track credits and graduation requirements)
        - Review transcript (view academic history)

- **Usage Instructions**
    - **Admin Role:**
        1.  Log in with username “admin” and password “\*\*\*\*” to navigate to Admin work area.
        2.  On Admin work area, you will see five buttons
            1.  Administer User Accounts
            2.  Register Persons (HR)
            3.  Manage Faculty
            4.  Manage Students
            5.  My own profile
        3.  **Administer User Accounts:** In this work area, you will be able to create user account with a username (example username “admin”) and a password (example password “\*\*\*\*” ) for any existing user profile and manage the user accounts created.
            1.  Manage User accounts: In the screen, you will see the list of user accounts with their username and password.
            2.  If you want to remove a user account, select a row and click on “remove user” button and confirm to delete.
            3.  If you want to create a new user account, click on create user account. Fill in the person ID and the role of the person before filling in your choice of username and password and click Save button. This should create a new user account.
            4.  If you want to update username and password for an existing user account, select the user account and click on view/edit button to navigate to Administer user accounts work area. Here, select the row and click on the Update button. Type in the changes to username and password and click on Update button to confirm changes.
        4.  **Register Persons (HR):** In this work area, you will be able to create a new person with a unique person ID, first name, last name, date of birth and address. You will also assign a role (student, faculty or admin) and a department to the person. Thereafter, you will be able to update any personal information. You cannot change the role of the person.
            1.  Manage Persons: In the screen, you will see the list of persons. You can search for a person with their full PersonID.
            2.  If you want to remove a person, select a row and click on the “remove person” button and confirm to delete.
            3.  If you want to create a new person, click on Create person. Fill in the person ID and the required fields and the role of the person and department from the drop-down and click Save button. This should create a new person with a selected role.
            4.  If you want to update personal info for an existing person, select the person record and click on the view/edit button to navigate to Administer Person work area. Here, select the row and click on the Update button. Type in the changes and click on Update button to confirm changes.
        5.  **Manage Students:** In this work area, you will be able to manage existing student profiles. You will be able to edit student info like program enrolled, instruction mode (Online or OnCampus), NUID, hobbies and interests.
            1.  Manage Students: In the screen, you will see the list of students. You can search for a student with their full PersonID.
            2.  If you want to remove a student, select a row and click on the “remove student” button and confirm to delete.
            3.  If you want to update student info for an existing student profile, select the student record and click on the view/edit button to navigate to Administer Student work area. Here, select the row and click on the Update button. Type in the changes on editable fields and click on Update button to confirm changes.
        6.  **Manage Faculty:** In this work area, you will be able to manage existing faculty profiles. You will be able to edit faculty info like first name, last name, and job title.
            1.  Manage Faculty: In the screen, you will see the list of faculty profiles. You can search for a faculty with their full PersonID.
            2.  If you want to remove a faculty, select a row and click on the “remove faculty” button and confirm to delete.
            3.  If you want to update faculty info for an existing faculty profile, select the faculty record and click on the view/edit button to navigate to Administer Faculty work area. Here, select the row and click on the Update button. Type in the changes on editable fields and click on Update button to confirm changes.
        7.  **My Profile:** In this work area, you will be able to manage the admin user account as an admin person. You can view or edit your own username and password.
        8.  **Log out:** At any time, click on Log Out button to log out and close your session to exit from your current work area.
    - **Faculty Role:**
        1.  Log in with username “gina” or “anna” and password “\*123” to navigate to Faculty work area.
        2.  On Faculty work area, user will see four buttons:
            1.  Manage Courses
            2.  Manage Student Profiles
            3.  My Profile
            4.  Performance Reports
        3.  **Manage Courses**: In this work area, the user will be able to view a list of courses with details such as course number, course name, number of credits, and course price.
            1.  To view a specific course, please select a course from the table and click the “View Course” button. It will redirect you to the “Course Details” panel where you will be able to update course details such as course number, course name, and number of credits. The course price will calculate automatically based on the number of credits and cannot be manually modified. Please select the “Update” button to allow edits and then “Save” to save the changes. You can click the “<< Back” button to return to the “Manage Courses” panel.
            2.  To search for a specific course, please enter the exact course number (not case sensitive) and click on the “Search” button. If a course is found, it will redirect you to the “Course Details” panel. Otherwise, an error message will pop up notifying the user that no course was found.
        4.  **Manage Student Profiles**: In this work area, the user will be able to view a list of students with details such as person ID, full name, and NUID.
            1.  To view a specific student, please select a student from the table and click the “View Student Details” button. It will redirect you to the “Student Details” panel where you will be able to view a table of the selected student’s hobbies and interests. Please select the “View Student Courses” button to view a list of the student’s courses with details such as course number, course name, semester, instructor name, and grade. A student’s grade will display as “N/A” if a grade has not been entered. You can click the “<< Back” button to return to the “Student Details” panel, and again to go back to the “Manage Students" panel.
            2.  To search for a specific student, please enter the student’s exact NUID and click on the “Search” button. If a student is found, it will redirect you to the “Student Details” panel. Otherwise, an error message will pop up notifying the user that no student was found.
        5.  **My Profile**: In this work area, the user will be able to view and update personal details such as name, address, research area, username, and password. The fields marked with \* will be mandatory. Other details such as date of birth, person ID, role, department, and title can be viewed but not modified. Please select the “Update” button to allow edits and then “Save” to save the changes. You can click the “<< Back” button to return to the main Faculty work area.
        6.  **Performance Reports**: In this work area, the user will be able to view a list of students’ grades in a specific class. You can select a semester and a list of available courses will populate based on the chosen semester. The table will also populate with students enrolled in the chosen course with details such as NUID, first name, last name, instructor name, and grade. A student’s grade will display as “N/A” if a grade has not been entered. You can click the “<< Back” button to return to the main Faculty work area.
    - **Student Role**:
        1.  Log in with a student account. Can log in with a new student account created in the admin portal. Can also use existing student account with username: jane and password: \*\*\*\*
        2.  The student work area has five buttons:
            1.  **Course Work**:
                1.  Students can view all registered, in-progress, and completed course loads by selecting the semester.
                2.  Students can select a course (seat assignment) to view course information, grades, and progress.
                3.  Students can submit assignment for non-completed classes. Assignment submission button is disabled for completed/graded classes.
                4.  Students can attach pdf or docx file, remove attached files, and submit the assignment. After submission, the assignment submission table should record name, comment, file path, and submission time. Submission cannot be deleted.
                5.  Newly enrolled/unenrolled courses from the registration panel will be displayed and reflected in the corresponding semester.
            2.  **Registration**

1.  Students can enroll in and unenroll from courses in this panel.
2.  Only schedules for future semesters are displayed. Students cannot view or register for courses offered in past or current semesters.
3.  Students can select the semester to see the course offerings for that semester.
4.  Students can search for classes based on keywords using either course number or name. The keyword does not have to match the full course number and name exactly. The search filter applies only to the selected semester, not to all course offerings across all semesters.
5.  Students can select a course offer to view the course details.
6.  Students can select a course to enroll in. Seat availability will be reflected in enrollment (availability is subtracted by one when a student is enrolled). Students cannot enroll in the courses they have already taken or are enrolled in. Students cannot enroll in courses that are full (a warning message appears for 0 seats available).
7.  Students can see enrolled courses for the future semesters and remove enrollments. The seat availability for a course offer will be updated when a student unenrolls from a course (seat availability added 1).
    - - 1.  **Graduation Audit**
                1.  Students can view the progress of their degree at the graduation auditing portal.
                2.  The portal displays the degree title, a list of core courses, and a list of electives.
                3.  The courses will show the grade and progress of the students (Not enrolled, In Progress, Passed, Failed).
                4.  The “core requirement status” shows “satisfied” if all core courses are passed. It does not count in-progress courses.
                5.  The “number of electives took” will be updated only when the student completes and passes the course (receives a grade). It does not count for in-progress courses.
                6.  The “Pending credit hours” shows the in-progress or enrolled courses that did not receive a grade. Does not count for non-department courses.
                7.  The “Total Valid Credit Hours” shows total credit hours for the completed and passed department-related courses. Does not count for non-department courses.
                8.  The “Graduation Requirement Status” will show “satisfied” when the student has passed all the core requirements and has at least 32 total valid credit hours.
                9.  Newly enrolled and unenrolled courses from the Registration panel will be reflected in the course lists. And the pending credit hours will be updated to reflect it.
            2.  **Transcript**
                1.  Students can view their academic history on the transcript panel. The panel displays all courses a student has taken and enrolled in, the semesters, grades, and details for each course, as well as their cumulative GPA, credit hours, and quality points.
                2.  The cumulative GPA, credit hours, and quality points are only counted for the courses they completed. They do not count courses in progress.
                3.  The newly enrolled and unenrolled courses from the Registration panel will be displayed in the transcript.
            3.  **Student Profile** (Non-required/Not-listed Use Case)
                1.  Students can view their profile information, such as full name, instruction mode, department, program, and NUID.

- **Testing Guide**
    - Access control and authorization testing:
        - Username – admin
        - Password - \*\*\*\*
        - Test Case 1 – Type in a different username and password combination and log in.
            - Expected results: You will get a hard error with a pop-up message indicating you entered incorrect login credentials.
        - Test Case 2 – Test to check if Admin can access only his work area. Log in with the correct username and password.
            - Expected results: Student and Faculty work areas are not visible for admin. Only Admin work area is visible on the right-hand side panel once you have logged in.
        - Test Case 3 – Test to check if Faculty can access only respective work area. Log in with the faculty username and password.
            - Expected Results: Admin and Student work areas are not visible for faculty. Only Faculty work area is visible on the right-hand side panel once you have logged in.
    - Admin role test cases
        - Test Case 4 – A student profile is created when the user is creating a new person and selects the “Student” role.
            - Expected Results: A new student profile is created.
        - Test Case 5 – Once a user account is created with a username and password, the user can login with those credentials.
            - Expected Results: The user successfully logs into their work area based on the profile role (Admin, Faculty, or Student).
    - Faculty role test cases
        - Test case 6 – Display grade as “N/A” if the student has a grade of 0, meaning they have not completed the course or just enrolled in a new course.
            - Expected Results: “N/A” is displayed in the grade column of the JTable within “Student Academic Progress” and “Students Performance Report” panels.
        - Test case 7 – Populate corresponding courses when a semester is selected.
            - Expected Results: Course combo box lists all of the semester’s courses after the user selects a semseter from the semester combo box.
    - Student role test cases
        - Log In: Login with username: jane and password: \*\*\*\* (Can also log in with a new student account created in the admin portal)
        - Test case 8 – The student can manage their courses and only submit assignments for ongoing courses.
            - Expected Results: The student can only see the submit assignment button for incomplete courses, not completed ones. The student can attach docx or pdf files. Dialog messages will be displayed for successful attachment, canceled attachment, removed attachment, and successful submission. The assignment submission will be recorded in the assignment submission table with the file path and time.
        - Test case 9 – The student can enroll in courses with available seats and for courses they have not taken or enrolled in. Once they are enrolled, the seat availability decreases by one. When a student unenrolls from a course, the seat availability will increase by one.
            - Expected Results: When clicking on “Enroll”, a dialog message will pop up if there is no seat or if the student has enrolled in or completed the course. The student successfully enrolls or unenrolls in the selected courses, and the seat availability in the “Availability” column of the Course Offers table will decrease or increase by one. The Course Load table will be reflected (course added or removed) based on the enrollment/un-enrollment.
        - Test case 10 – The student can search for course offers by selecting a semester and by keyword of course name or course number using the “Search" button. Test search by “cs”. Click on the “Clear Search” button to clear the search and search results.
            - Expected Results: When search by “cs”, the course offers table will display courses of the semester with numbers or names that contain “cs” regardless of string letter cases. When click on the “Clear Search” button, the search field will be cleared and the table will be repopulated for the selected semester.
        - Test case 11 – The student can enroll in or unenroll from a course, and the course will be reflected in the Course Work, Graduation Audit, and Transcript panels. For example, test by enrolling in the “CS 5800 Algorithms” course for the Spring 2026 semester.
            - Expected Results:
                - Go to the Course Work panel and select the Spring 2026 semester. The “CS 5800 Algorithms” class will be displayed in the course list. Also with Grade “N/A” and status “In Progress" displayed in the coursework details panel.
                - Go to the Graduate Audit panel. The status of the “CS 5800 Algorithms” course has changed from Not Enrolled to In Progress, and the pending credit hours have been increased by 4 credit hours because this class has 4 credit hours.
                - Go to the Transcript panel. The “CS 5800 Algorithms” course has been added to the list, along with its corresponding course details. The semester for this course shows Spring 2026. The grade shows “In progress".
- **Challenges & Solutions**
    - Admin Portal:
        - Registering a student profile in Register Persons panel meant that we could view and remove that same student from the Manage Students panel. However, if the student profile is removed from the Manage Students panel, the design question was “would it just remove the student role and person would still exist or the person would also be removed”. I had to make a design choice of removing the whole student profile and the person associated with the student. I also had to set the user account associated with the student profile to “Inactive” to indicate user is no longer valid.
    - Faculty Portal:
        - Student class needed an attribute to store a student’s hobbies and interests. Originally set the attribute as a String, but this will make it difficult to maintain. The type was changed to an array list to account for multiple hobbies and interests.
        - Displaying a student’s multiple hobbies and interests in a JTable. A method was created that loops through a student’s hobbies and interests and adds one per row.
    - Student Portal:
- Class registration page has to display future semesters only. Methods were created to split the semester string, get the current date, compare by season and year, and filter out past or current semesters.
- To unenroll a course. Methods were created to unlink the relationships between seat assignment, seat, and course offer, and remove the seat assignment from the course load list.
- Consider GPA/credit hours/graduation status for incomplete/ungraded courses. Methods were edited to make the GPA calculation and validation for credit hours and graduation status to filter out non-graded courses. If in-progress courses are not filtered out, the GPA will be weighed down by the 0s in non-graded courses, and students can pass the graduation requirement just by enrolling in all core classes and meeting the 32-credit-hour requirement.
- An assignment submission is an object that should have properties such as name, submission date, file (file path), and comments. Created an assignment submission class. Each Seat Assignment instance (or the student’s grade and information for a course) should have an ArrayList to hold the assignment submissions.
- Assignment submission needs to attach files. However, files are too big to store for this project and will slow down the application. The file path will be recorded instead.
- **Future Enhancements**
    - Allow faculty members to modify an instructor for a course.
    - Allow faculty members to view the course status for a student (ex. enrolled, in progress, withdraw, completed)
    - Create course schedules for a semester in the portal.
    - Add and remove core and elective courses for a degree in the portal.
    - Track the grade for each assignment and calculate the grades of each course by the assignments’ cumulative and weighted grades.
    - Allow faculty to add assignments for a course offer and allow students to submit files to the corresponding assignments.
    - The student’s coursework panel should display only current and past semesters and should filter out future semesters.
    - Semester should have its own class to restrict the format. Functions should be implemented to filter semesters by time to get past, present, and future semester course schedules and course loads. Funtions should also be implemented to sort the semesters.
    - Allow students to retake/enroll in courses that they have failed.
    - Allow student to edit their profile
- **Contribution Breakdown**
    - Application (coding, documentation, testing)
        - Admin Portal – Venkata Ramana Mohan Chunchu
        - Faculty Portal – Sabrina Tan
        - Student Portal – Ziwei Song
    - README document - Venkata Ramana Mohan Chunchu, Sabrina Tan, Ziwei Song
    - PowerPoint slides and short videos – Sabrina Tan
    - Setting up Zoom meetings – Ziwei Song
    - All members maintained consistent communication in the Slack channel to provide updates on project progress, PR conflicts, and improvements.
    - Each member implemented, documented, and tested use cases.
    - Held 5 team meetings to present each member’s progress and perform integration testing together.
    - Peer-reviewed each member’s update and gave feedback.
