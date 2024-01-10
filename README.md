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

### Screenshots of the app from virtual device:
+ LOGO:
+  <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/c41d92b6-6a2b-46e9-8a64-e3df2e368ee7" width="200" height="400" />

+ Splash Activity:
+ <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/c6924221-dc7f-425a-8ef2-9e144f6c51d7" width="200" height="400" />

+ User Interface:
+ <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/04354c40-ed83-48d8-af3e-b9d4b36a00db" width="200" height="400" />

+ Creating a new task:
+ <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/546c1a56-6be6-479c-9c1f-a2515ea1e4dd" width="200" height="400" />

+ Updating an existing task:
+ <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/d6a8925e-5e94-4709-9681-cafba2a1f168" width="200" height="400" />

+ Deleting a task:
+ <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/51080033-a4e4-4c2f-abd5-5a74bf2ca91a" width="200" height="400" />

+ All Tasks:
+  <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/7073ae7e-f888-4bcc-9317-74e8655a3b22" width="200" height="400" />
+  <img src="https://github.com/Saibaghiradh/Keka_Task_ToDo/assets/100903637/2e436485-551d-4a8c-9fc9-ec8a8f85ecaf" width="200" height="400" />


  
