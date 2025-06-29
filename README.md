# 🧱 Sistema de Entidades en Minecraft (Java POO)
Simulación de entidades del mundo de Minecraft utilizando principios de Programación Orientada a Objetos en Java.

## 📦 Estructura del Proyecto
📁 src/
├── EntidadMinecraft.java
├── EntidadBase.java
├── Jugador.java
├── Zombi.java
├── Aldeano.java
└── Main.java

## ⚙️ Tecnologías y Requisitos
- Lenguaje: Java 8+
- IDE recomendado: IntelliJ IDEA
- Compilación: Manual con `javac` o desde el IDE

## 🧠 Conceptos Aplicados
- Interfaces
- Clases abstractas
- Herencia
- Polimorfismo
- Encapsulamiento

## 📄 Descripción
- `EntidadMinecraft`: Interfaz que define los métodos comunes de las entidades.
- `EntidadBase`: Clase abstracta que implementa parcialmente la interfaz y sirve como base.
- `Jugador`, `Zombi`, `Aldeano`: Clases concretas que extienden `EntidadBase` y definen comportamientos únicos.

## 🚀 Ejecución
Compilar todos los archivos:
javac *.java

Ejecutar el programa:
java Main

## 💡 Ejemplo de salida esperada
Steve ha aparecido con 20 de salud.
Steve está recolectando recursos.
Tipo: Jugador
Zombi1 ha aparecido con 15 de salud.
Zombi1 ataca con agresividad nivel 8!
Tipo: Zombi
Aldeano1 ha aparecido con 10 de salud.
Aldeano1 comercia como un herrero.
Tipo: Aldeano
Steve ha agregado Espada de diamante al inventario.

## 👤 Autor
Washington Villares
