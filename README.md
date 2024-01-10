# Keka_Task_ToDo
ToDo list application using Android Studio, SQLite, Java


## Title: Android To-Do List Application with SQLite Database

### Description:
The Android To-Do List Application is designed to help users organize and manage their tasks efficiently. The application uses SQLite as a local database to store and retrieve task-related information. Users can create, update, delete, and mark tasks as completed.

#### Key Features:

##### Task Management:
+ Create new tasks with a title, description,Priority and due date.
+ Edit existing tasks to modify details.
+ Mark tasks as completed or uncompleted.
+ Delete tasks that are no longer needed.

##### SQLite Database:
+ Utilize SQLite database to store task-related information locally on the device.
+ Use SQLite queries to perform CRUD (Create, Read, Update, Delete) operations on the database.
##### User Interface:
+ Design an intuitive and user-friendly interface for adding, editing, and viewing tasks.
+ Implement a RecyclerView to display the list of tasks with appropriate sorting options.
##### Date and Time Handling:
+ Include date and time pickers for setting due dates for tasks.
+ Implement logic to notify users about upcoming or overdue tasks.
##### Data Validation:
+ Validate user input to ensure that tasks have necessary information and are correctly formatted.
+ Handle potential errors gracefully to provide a smooth user experience.


### Instructions on how to setup and run the application: 
+ Setting up and running an Android application using an SQLite database involves several steps. Below is a general guide that assumes you have Android Studio installed and have basic knowledge of Android development:

#### Step 1: Install Android Studio
+ If you haven't installed Android Studio, download and install it from the official Android Developer website.
#### Step 2: Create a New Android Project
+ Open Android Studio.
+ Click on "Start a new Android Studio project."
+ Choose an appropriate template, such as "Empty Activity" or "Basic Activity."
+ Complete the project configuration by providing a name, package name, and other necessary details.
#### Step 3: Design Database Schema
+ Identify the entities in your application (e.g., Task).
+ Define the fields for each entity (e.g., id, title, description, due date, completion status).
+ Create a SQLite database schema in a separate class (e.g., DatabaseHelper) that extends SQLiteOpenHelper.
#### Step 4: Implement Database Operations
+ Write methods in the DatabaseHelper class to handle CRUD operations (Create, Read, Update, Delete).
+ Use SQLite queries to interact with the database.
#### Step 5: Create UI Components
+ Design the user interface using XML layout files in the res/layout directory.
+ Create appropriate UI components (e.g., EditText, Button) for task management.
#### Step 6: Integrate Database with UI
+ Instantiate the DatabaseHelper class in your main activity or relevant activity.
+ Use the database helper methods to perform database operations based on user actions (e.g., adding a task, updating a task).
#### Step 7: Test Your Application
+ Test the application on an emulator or a physical Android device.
+ Check for any errors or unexpected behavior.
+ Use Android Studio's debugging tools to identify and fix issues.
#### Note: Simply download zip code, import it into Android Studio and run on the emulator or physical device.

### Screenshots of the app:

