# 🍲 Mi Cocina – Calendario y gestor de recetas

**Mi Cocina** es una aplicación pensada para organizar comidas diarias a través de un calendario interactivo.  
Cada usuario podrá crear su perfil, registrar lo que come, añadir recetas propias y gestionar sus ingredientes.  
El proyecto está orientado a evolucionar hacia una **comunidad colaborativa de recetas** con una base de datos rica y variada.

---

## 📖 Descripción
El objetivo principal es que el usuario registre, al menos, una comida al día en su calendario, construyendo así un recetario personal que se podrá ampliar, compartir y enriquecer en fases posteriores.  
Actualmente, la aplicación trabaja con plantillas de recetas en `.docx` vinculadas a un calendario en **Excel**, pero se encuentra en desarrollo hacia una solución completa en aplicación web/móvil.

---

## 🛠️ Funcionalidades

### 1. Pantalla de carga
Pantalla inicial con identidad visual de la aplicación.

### 2. Creación de usuario
- Registro con nombre, correo, contraseña o Google.
- Datos adicionales: país, ciudad, edad.
- Selección de **fecha de inicio de calendario** (independiente a la fecha de alta del usuario).

### 3. Calendario mensual
Estética tipo **Duolingo**, con el objetivo de registrar comidas diarias.
- ➕ Botón central para añadir comidas/recetas.
- 👥 Botón social (fase 2): amigos, contactos y recetas públicas.
- 📖 Botón recetario (fase 2): recetas propias y guardadas.
- ⚙️ Botón menú: perfil, edición, notificaciones, ajustes, modo oscuro.
- 🏠 Botón “Mi Cocina”: inventario de ingredientes.

### 4. Añadir comida/receta
- Selección de día (por defecto: actual).
- Elección de tipo de comida (desayuno, comida, merienda, cena).
- Registro de lo que se comió.
- Opción de añadir receta: ingredientes + paso a paso.
- Búsqueda de recetas similares para evitar duplicados.

### 5. Recetario
Repositorio personal de recetas:
- Creaciones propias.
- Recetas guardadas de otros (fase 2).
- Historial de ediciones, repeticiones y fecha de creación.

### 6. Mi Cocina
Gestión de ingredientes:
- Listado con cantidades y fechas de caducidad.
- Acceso directo a recetas del usuario.
- (Fase 2) Recetas más populares de la comunidad.

---

## 🔮 Futuras mejoras (Fase 2)
- Base de datos colaborativa de usuarios y recetas.
- Funcionalidad social: compartir, valorar y comentar recetas.
- Recomendaciones basadas en ingredientes disponibles.
- Alertas sobre caducidad de alimentos.
- Ranking dinámico de recetas más populares.

---

## 🧑‍💻 Tecnologías previstas
- **Frontend**: React Native (aplicación móvil multiplataforma).  
- **Backend**: Node.js + Express.  
- **Base de datos**: PostgreSQL o MongoDB.  
- **Archivos**: Generación y vinculación de `.docx` y calendarios.

---

## 📅 Roadmap
- [x] Plantilla de recetas en `.docx`.
- [x] Vinculación con calendario en Excel.
- [ ] Creación de perfiles de usuario.
- [ ] Calendario interactivo estilo Duolingo.
- [ ] Recetario personal.
- [ ] Módulo “Mi Cocina” (inventario).
- [ ] Funcionalidades sociales y comunidad (fase 2).

---

## 📄 Licencia
Este proyecto se distribuye bajo la licencia **MIT**, lo que permite su uso, modificación y distribución con fines personales o comerciales, siempre que se mantenga el aviso de licencia correspondiente.
