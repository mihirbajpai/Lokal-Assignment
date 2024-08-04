## Overview

This Android application is designed to manage job listings and bookmarks using modern Android development practices. It features a bottom navigation bar for easy access to **Jobs** and **Bookmarks** sections, with functionality for infinite scrolling, job detail views, and offline bookmarking. The application is developed using Jetpack Compose, which provides a modern, declarative approach to UI development.

## Features

- **Bottom Navigation**: Switch between **Jobs** and **Bookmarks** sections.
- **Jobs Screen**:
  - Fetches job data from `https://testapi.getlokalapp.com/common/jobs?page=1` with infinite scrolling.
  - Displays job cards with title, location, salary, and phone data.
  - Clickable job cards navigate to a detailed job view.
- **Bookmarks Screen**:
  - Allows users to bookmark jobs.
  - Displays bookmarked jobs, stored locally for offline access.
- **Offline Support**:
  - Bookmarked jobs are saved in a local database for offline access.
- **State Management**:
  - Handles loading, error, and empty states throughout the app.

## Technologies Used

- **Programming Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Dependency Injection**: Dagger-Hilt
- **Networking**: Retrofit
- **Database**: Room (for offline data storage)
- **State Management**: LiveData, StateFlow
- **UI Framework**: Jetpack Compose
- **Navigation**: Jetpack Navigation Compose
- **Coroutines**: For asynchronous programming
- **Network Connectivity**: Observing network status

## Project Structure

- **`MainActivity.kt`**: The entry point of the application. Initializes the UI and handles edge-to-edge settings.
- **`AppContainer.kt`**: Sets up the main layout with a `Scaffold` and handles navigation and network connectivity.
- **`NavigationGraph.kt`**: Defines the navigation graph for the app, managing navigation between Home, Bookmarks, and Job Details screens.
- **`JobViewModel.kt`**: ViewModel for managing job-related data and interactions.
- **`HomeScreen.kt`**: Displays the list of jobs with infinite scrolling and handles navigation to Job Details.
- **`BookmarksScreen.kt`**: Shows a list of bookmarked jobs.
- **`JobDetailsScreen.kt`**: Displays detailed information about a selected job.
- **`BottomNavigationBar.kt`**: Defines the bottom navigation bar UI component.
- **`TopBar.kt`**: Defines the top bar UI component.
- **`JobApiService.kt`**: Interface for the job API service.
- **`JobDao.kt`**: Data Access Object for job database operations.
- **`JobRepository.kt`**: Manages data operations for jobs, including fetching from the API and accessing the database.
- **`DataModel.kt`**: Contains data models for the job data and database entities.
- **`AppDatabase.kt`**: Defines the Room database for storing bookmarked jobs.
- **`AppModule.kt`**: Dagger-Hilt module for dependency injection.

## UI/UX

- The application uses Jetpack Compose for building the UI, which allows for a modern, declarative approach to UI development.
- The **Jobs** screen features an infinite scrolling list of job cards.
- The **Bookmarks** screen allows users to view and manage their bookmarked jobs.
- A bottom navigation bar enables easy navigation between the main sections of the app.
- Detailed job information is presented on a separate screen, providing an in-depth view of each job.
