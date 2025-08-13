# 📒 NotesApp

A simple, fast, and modern **Android notes app** written in **Kotlin**.  
Create, edit, and manage notes with a clean UI and **offline persistence** — your notes are **always available**, even without internet.

If you're learning Android development, this project is a **solid foundation** for understanding app architecture, state management, and local storage.

---

## ✨ Features

- ✅ **Create, edit, and delete notes**  
- 💾 **Persistent local storage** (Room Database)  
- 🔍 **Search and sort notes**  
- 🎨 **Material Design** with light/dark theme support  
- 📤 **Share notes** with other apps  
- ↩️ **Undo/redo** and swipe-to-delete *(optional)*  
- 📌 **Pin or archive notes** *(optional)*  

**Planned / Nice-to-have:**
- ⏰ Reminders and notifications  
- 🏷 Categories/labels with color tags  
- 📦 Backup/restore (export/import)  
- 🔒 Biometrics lock (fingerprint/face unlock)  

---

## 🛠 Tech Stack

- **Language:** Kotlin  
- **Architecture:** MVVM + Repository  
- **Persistence:** Room Database  
- **UI:** Jetpack Compose / Views (depending on implementation)  
- **Concurrency:** Coroutines + Flow  
- **Dependency Injection:** Hilt (or Koin)  
- **Testing:** JUnit, Espresso / Compose UI tests  

---

## 🖼 Screenshots

<div align="center">
  <!-- Replace these image URLs with actual GitHub image links -->
  <img src="screenshot1.png" alt="Notes list screen" width="270" />
  <img src="screenshot2.png" alt="Note editor" width="270" />
  <img src="screenshot3.png" alt="Dark mode list" width="270" />
  <img src="screenshot4.png" alt="Dark mode note editor" width="270" />
</div>

---

## 🎥 Video Demo

[▶ **Watch the demo**](https://drive.google.com/file/d/1Ad54V3v3BkWu_gROzYIL0VeaNKQ9uQGp/view?usp=sharing)

---

## 🚀 Getting Started

### Prerequisites
- Android Studio (**Giraffe** or newer recommended)  
- JDK 17 (or the Gradle-configured version)  
- Android SDK & Platform Tools  
- An emulator or a physical Android device  

### Clone the Repository
```bash
git clone https://github.com/Princelohia9910/NotesApp.git
cd NotesApp
```

---

## 📂 Project Structure
```plaintext
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
```

---

## 🏗 Architecture

- **MVVM** – ViewModel manages UI state; UI observes and reacts  
- **Repository Pattern** – Handles data operations and abstracts sources  
- **Room Database** – Local database as the single source of truth  
- **Coroutines / Flow** – For asynchronous work and reactive streams  

**Benefits:**
- ✔ Testable, maintainable, and scalable  
- ✔ Clear boundaries & responsibilities  
- ✔ Easy to add new data sources (e.g., cloud sync)  

---

## 🤝 Contributing

We welcome contributions!  
1. Fork the repository and create a feature branch.  
2. Keep commits focused and descriptive.  
3. Add/update tests for new features.  
4. Open a PR with a clear description and screenshots *(if UI changes)*.  

---

## 📅 Roadmap

- 🔍 Improve search *(fuzzy matching, highlight results)*  
- 📑 Bulk actions *(multi-select)*  
- 📊 Sorting & grouping enhancements  
- 📤 Export/import *(JSON/CSV)*  
- ⏰ Reminders with notifications  
- 🔒 Biometrics lock  

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).  
