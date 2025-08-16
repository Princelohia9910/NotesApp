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
![Screenshot_2025-08-12-16-58-13-15_e86a9dad7281952419b6f08b30a4339a](https://github.com/user-attachments/assets/cbb7cad6-46b0-44d3-ba32-60e76eab7768)
![Screenshot_2025-08-12-16-58-57-38_e86a9dad7281952419b6f08b30a4339a](https://github.com/user-attachments/assets/81fe8efc-c49c-4615-81e4-0a84ce7d50bd)
![Screenshot_2025-08-12-16-59-46-89_e86a9dad7281952419b6f08b30a4339a](https://github.com/user-attachments/assets/345c18c6-026b-4d78-a173-756fe8269ec5)
![Screenshot_2025-08-12-16-59-51-10_e86a9dad7281952419b6f08b30a4339a](https://github.com/user-attachments/assets/c9f2f484-2ef9-4228-a6c0-450c3a137936)





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
