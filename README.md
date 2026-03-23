<div align="center">

<img src="https://capsule-render.vercel.app/api?type=venom&color=4CAF50&height=260&section=header&text=The%20Learners&fontSize=70&fontColor=fff&fontAlignY=42&desc=Android%20E-Learning%20Application%20%E2%80%94%20Built%20in%20Java&descAlignY=62&descSize=16&descColor=fff&animation=twinkling" width="100%"/>

<br/>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=700&size=18&duration=2000&pause=600&color=4CAF50&center=true&vCenter=true&width=700&lines=Interactive+e-learning+for+Android.;Course+management+%C2%B7+Progress+tracking+%C2%B7+Real-time+learning.;Built+entirely+in+Java+%E2%80%94+100%25." alt="Typing SVG" />
</p>

<br/>

<img src="https://img.shields.io/badge/Author-Nevil%20Dhinoja-2196F3?style=for-the-badge&logo=github&logoColor=white&labelColor=0D1117"/>
<img src="https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white&labelColor=0D1117"/>
<img src="https://img.shields.io/badge/Language-Java%20100%25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white&labelColor=0D1117"/>
<img src="https://img.shields.io/badge/Backend-PHP%20%2B%20MySQL-777BB4?style=for-the-badge&logo=php&logoColor=white&labelColor=0D1117"/>
<img src="https://img.shields.io/badge/Build-Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white&labelColor=0D1117"/>
<img src="https://img.shields.io/badge/CI-GitHub%20Actions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white&labelColor=0D1117"/>

</div>

---

## What It Does

**The Learners** is a native Android e-learning application that gives students access to structured course content, real-time progress tracking, and an engaging learning interface — all from their phone.

No browser needed. No third-party platforms. A native mobile learning experience built from scratch in Java.

---

## Architecture

```
┌──────────────────────────────────────────────────────────────────┐
│                     Android App (Java + XML)                     │
│                                                                  │
│  ┌────────────┐  ┌────────────┐  ┌────────────┐  ┌──────────┐    │
│  │  Login /   │  │  Course    │  │  Progress  │  │  Profile │    │
│  │  Register  │  │  Browser   │  │  Tracker   │  │  & Stats │    │
│  └─────┬──────┘  └─────┬──────┘  └─────┬──────┘  └────┬─────┘    │
│        │               │               │               │         │
│  ┌─────▼───────────────▼───────────────▼───────────────▼──────┐  │
│  │              Retrofit / HTTP Client (API Layer)             │ │
│  └─────────────────────────┬───────────────────────────────────┘ │
└────────────────────────────┼─────────────────────────────────────┘
                             │  HTTP Requests
                             ▼
┌─────────────────────────────────────────────────────────────────┐
│                      PHP Backend (XAMPP)                        │
│                                                                 │
│  ┌──────────────┐  ┌──────────────┐  ┌────────────────────────┐ │
│  │  Auth API    │  │  Course API  │  │  Progress API          │ │
│  │  login.php   │  │  lessons.php │  │  track_progress.php    │ │
│  │  register.php│  │  modules.php │  │  completion.php        │ │
│  └──────┬───────┘  └──────┬───────┘  └───────────┬────────────┘ │
└─────────┼─────────────────┼───────────────────── ┼──────────────┘
          │                 │                      │
          └─────────────────┴──────────────────────┘
                                    │
                                    ▼
                       ┌────────────────────────┐
                       │         MySQL DB       │
                       │                        │
                       │  users · courses ·     │
                       │  lessons · progress ·  │
                       │  enrollments           │
                       └────────────────────────┘
```

---

## Features

- **Course Management** — enroll in courses, view structured lessons, access all materials in one place
- **Real-Time Progress Tracking** — visual indicators showing completion percentage per course and lesson
- **Interactive Content** — supports multiple content types for an engaging learning experience
- **User Authentication** — secure login and registration with session management
- **Student Dashboard** — overview of enrolled courses, progress, and recent activity
- **User-Friendly UI** — clean, accessible design that works for all age groups
- **CI/CD** — GitHub Actions workflow for automated build verification

---

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Mobile Frontend | Java + XML (Android) |
| UI Components | Android Views, RecyclerView, CardView |
| Networking | Retrofit / HTTP Client |
| Backend | PHP |
| Database | MySQL |
| Local Server | XAMPP |
| Build System | Gradle (Kotlin DSL) |
| CI/CD | GitHub Actions |
| IDE | Android Studio |

---

## Project Structure

```
The_Learners/
├── app/
│   ├── src/main/
│   │   ├── java/com/thelearners/
│   │   │   ├── activities/         # Login, Register, Dashboard, Course
│   │   │   ├── adapters/           # RecyclerView adapters
│   │   │   ├── models/             # Data models (User, Course, Lesson)
│   │   │   ├── api/                # Retrofit API interfaces
│   │   │   └── utils/              # Helper classes
│   │   └── res/
│   │       ├── layout/             # XML layouts
│   │       ├── drawable/           # Icons and graphics
│   │       └── values/             # Colors, strings, themes
│   └── build.gradle.kts
├── .github/workflows/              # GitHub Actions CI
├── gradle/wrapper/
├── build.gradle.kts
└── settings.gradle.kts
```

---

## Getting Started

### Prerequisites
- Android Studio (latest stable)
- XAMPP installed and running
- Android device or emulator (API 21+)

### Backend Setup
```bash
# Start XAMPP — Apache + MySQL
# Place backend PHP files in htdocs/thelearners/

# Import the database
# Open phpMyAdmin → create database 'thelearners'
# Import the provided SQL schema
```

### App Setup
```bash
# Clone the repo
git clone https://github.com/Nevil-Dhinoja/The_Learners.git

# Open in Android Studio
# Update API base URL in app/src/main/java/.../api/ApiClient.java
# BASE_URL = "http://YOUR_LOCAL_IP/thelearners/"

# Run on device or emulator
```

---

## What I Learned Building This

- Native Android development with Java — Activities, Fragments, RecyclerView
- REST API consumption from mobile using Retrofit
- Backend integration with PHP + MySQL
- Android UI/UX design — layouts, themes, navigation
- Build automation with Gradle and GitHub Actions
- The full mobile → backend → database request lifecycle

---

## The Journey

This was one of my early full-stack projects — building a complete Android app connected to a real backend. Before LangChain, before agents, before RAG — this is where I learned what it means to ship something that actually works end to end.

---

<div align="center">

**From Android apps to AI agents — the engineering never stops.**
<div align="center">


<br/>

<table border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="180" align="center" valign="top">

<img src="https://github.com/Nevil-Dhinoja.png" width="120" style="border-radius:50%"/>

</td>
<td width="30"></td>
<td valign="middle">

<h2 align="left">Nevil Dhinoja</h2>
<p align="left"><i>AI / ML Engineer &nbsp;·&nbsp; Full-Stack Developer &nbsp;·&nbsp; Gujarat, India</i></p>
<p align="left">
I build AI systems that are practical, deployable, and free to run.<br/>
This project is part of a larger series of open-source AI tools — each one<br/>
designed to teach a real concept through a working, shippable product.
</p>

</td>
</tr>
</table>

<br/>

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Nevil%20Dhinoja-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/nevil-dhinoja)
[![GitHub](https://img.shields.io/badge/GitHub-Nevil--Dhinoja-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Nevil-Dhinoja)
[![Gmail](https://img.shields.io/badge/Email-nevil%40email.com-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:dhinoja.nevil@email.com)

<br/>

If this project helped you or saved you time, a star on the repo goes a long way. &nbsp;
![Views](https://komarev.com/ghpvc/?username=Nevil-Dhinoja&repo=data-analyst-agent&color=blue)

<br/>
<br/>
<img src="https://capsule-render.vercel.app/api?type=waving&color=4CAF50&height=120&section=footer" width="100%"/>

</div>
