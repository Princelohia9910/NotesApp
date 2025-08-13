# 📒 NotesApp

A simple, fast, and modern Android notes app written in Kotlin. Create, edit, and manage your notes with a clean UI and offline persistence — your notes are **always available**, even without internet.

If you're learning Android development, this project is a **solid foundation** to understand app architecture, state management, and local storage.

---

## ✨ Features

- ✅ Create, edit, and delete notes  
- 💾 Persistent local storage (Room Database)  
- 🔍 Search and sort notes  
- 🎨 Material Design with light/dark theme support  
- 📤 Share notes with other apps  
- ↩️ Undo/redo and swipe-to-delete (optional)  
- 📌 Pin or archive notes (optional)  

**Planned / Nice-to-have:**
- ⏰ Reminders and notifications  
- 🏷 Categories/labels with color tags  
- 📦 Backup/restore (export/import)  
- 🔒 Biometrics lock (fingerprint/face unlock)  

## 🛠 Tech Stack

- **Language:** Kotlin  
- **Architecture:** MVVM + Repository  
- **Persistence:** Room Database  
- **UI:** Jetpack Compose / Views (depending on your implementation)  
- **Concurrency:** Coroutines + Flow  
- **Dependency Injection:** Hilt (or Koin)  
- **Testing:** JUnit, Espresso / Compose UI tests  

---

## 🖼 Screenshots

<div align="center">
  
  <img src="https://github.com/user-attachments/assets/d2e26964-603a-4786-b0ed-2383a2f7567a" alt="Notes list screen" width="270" />
   <img src="![Screenshot_2025-08-12-16-58-57-38_e86a9dad7281952419b6f08b30a4339a](https://github.com/user-attachments/assets/4529770d-9a8b-4f49-82bb-585500387431)" alt="Dark mode note editor" width="270" />
  <img src="https://github.com/user-attachments/assets/5cc1c169-3f31-4751-822c-c93c48507074" alt="Dark mode list" width="270" />
 
  <img src="https://github.com/user-attachments/assets/fbb20d8b-c5b6-4b00-a741-fbaa2485ec62" alt="Dark mode note editor" width="270" />
</div>


## 🎥 Video Demo

[▶ Watch the demo](https://drive.google.com/file/d/1Ad54V3v3BkWu_gROzYIL0VeaNKQ9uQGp/view?usp=sharing)


Uploading Record_2025-08-12-17-00-23_e86a9dad7281952419b6f08b30a4339a.mp4…





## 🚀 Getting Started

### Prerequisites
- Android Studio (Giraffe or newer recommended)  
- JDK 17 (or the Gradle-configured version)  
- Android SDK & Platform Tools  
- An emulator or a physical Android device  

### Clone the Repository
git clone https://github.com/Princelohia9910/NotesApp.gitcd NotesApp


## project Structure

app/
 ├─ src/
 │   ├─ main/
 │   │  ├─ java/.../notes/
 │   │  │   ├─ data/        # DAOs, entities, repositories
 │   │  │   ├─ domain/      # Use cases (if applicable)
 │   │  │   └─ ui/          # Activities/Fragments/Compose screens, ViewModels
 │   │  └─ res/             # Layouts, drawables, themes, strings
 │   └─ androidTest/        # UI tests
 │   └─ test/               # Unit tests
 └─ build.gradle
 
## 🏗 Architecture
•	MVVM: ViewModel manages UI state; UI observes and reacts.
•	Repository Pattern: Handles data operations and abstracts sources.
•	Room Database: Local database as the single source of truth.
•	Coroutines/Flow: Async work and reactive streams.

Benefits:
✔ Testable, maintainable, and scalable
✔ Clear boundaries & responsibilities
✔ Easy to add new data sources (e.g., cloud sync)

⸻

## 🤝 Contributing

Contributions are welcome!
	1.	Fork the repo and create a feature branch.
	2.	Keep commits focused and descriptive.
	3.	Add/update tests for new features.
	4.	Open a PR with a clear description and screenshots if UI changes.

## 📅 Roadmap

•	Improve search (fuzzy, highlight matches)
•	Bulk actions (multi-select)
•	Sorting & grouping enhancements
•	Export/import (JSON/CSV)
•	Reminders with notifications
•	Biometrics lock
