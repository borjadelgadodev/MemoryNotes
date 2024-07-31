# 📒 Memory Notes

Memory Notes es una aplicación de notas intuitiva y eficiente desarrollada en Kotlin para Android. Utiliza la arquitectura MVVM y Room para la gestión de la base de datos.
 
## 📑 Tabla de Contenidos

1. [Características](#-características)
2. [Capturas de Pantalla](#-capturas-de-pantalla)
3. [Requisitos](#-requisitos)
4. [Instalación](#-instalación)
5. [Uso](#-uso)
6. [Estructura del Proyecto](#-estructura-del-proyecto)

## ✨ Características

- Crear, editar y eliminar notas fácilmente.
- Interfaz de usuario moderna y limpia.
- Sincronización automática de notas.
- Navegación intuitiva entre pantallas.
- Integración con Room para almacenamiento local.

## 📸 Capturas de Pantalla


## ⚙️ Instalación

1. Clona este repositorio:

    ```bash
    git clone https://github.com/borjadelgadodev/MemoryNotes.git
    ```

2. Abre el proyecto en Android Studio.
3. Sincroniza el proyecto con Gradle.
4. Ejecuta la aplicación en un dispositivo o emulador Android.

## 🚀 Uso

1. Abre la aplicación.
2. Pulsa el botón "+" para crear una nueva nota.
3. Escribe tu nota y pulsa el botón de guardar.
4. Para eliminar una nota, selecciona la nota y pulsa el ícono de la papelera en la parte superior.

## 🗂 Estructura del Proyecto

```plaintext
app/
├── src/main/java/com/example/memorynotes/
│   ├── data/           # Modelos y clases de base de datos
│   ├── framework/      # Implementaciones específicas de Android y ViewModels
│   └── presentation/   # Fragmentos y actividades para la interfaz de usuario
└── src/main/res/       # Recursos de la aplicación (layouts, drawables, strings, etc)
core/
├── data/               # Modelos de datos
├── repository/         # Repositorios y fuentes de datos
└── usecase/            # Casos de uso
