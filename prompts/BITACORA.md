# Bitacora de tecnicas avanzadas 
 
Laboratorio 07: Tecnicas Avanzadas de Prompting. 
Herramienta de IA usada: (escribe aqui cual usaste) 
 
## Ejercicio 2: Zero-shot, one-shot y few-shot 

| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) | 
|------|-----------------|-------------------------|-----------------------------------| 
| Zero-shot |5 | puntos con colores| SI| 
| One-shot | 5| giones con la Respuesta| SI| 
| Few-shot | 5| flechas con la respuesta| SI| 

 
## Ejercicio 3: Chain of Thought 
 
| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo | Unicamente la respuesta 318.60  |NO | SI|
| Paso a paso | Explicacion detallada de como se llego a la respuesta 318.60| SI| SI |


## Ejercicio 4: Role prompting 

| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas | 
|---------|-------------------------------|-----------------------|---------------------| 
| A. Sin rol | Sencillo| SI(codigo corto)| una persona casual que no conoce mucho de programacion | 
| B. Rol docente |Tecnico |SI(codigo tecnico pero corto) | peronas con conocimiento tecnido de programacion que quieren aprender algo nuevo | 
| C. Rol senior |Tecnico |SI(codigo largo y explicado) | personas con conocimiento amplio del tema | 

 
## Ejercicio 5: Descomposicion 

### Paso 1: Identificación de requisitos

**Entrega de la IA:** La IA propuso 5 requisitos principales para el sistema: gestión de productos, control de stock, registro de ventas, alertas de bajo stock y generación de reportes.

**Comparación con el pedido:** El resultado cumple con el pedido porque se identificaron cinco requisitos principales para el sistema de inventario.

### Paso 2: Diseño de clases

**Entrega de la IA:** La IA propuso las clases `Producto`, `Inventario`, `MovimientoStock`, `Venta`, `DetalleVenta` y `Reporte`, indicando los atributos y sus tipos de datos.

**Comparación con el pedido:** El resultado cumple porque se diseñaron las clases necesarias y se especificaron sus atributos con tipos de datos.

### Paso 3: Código de la clase Producto

**Entrega de la IA:** La IA generó la clase `Producto` con sus atributos privados, constructor y métodos `get` y `set`.

**Comparación con el pedido:** El resultado cumple con lo solicitado porque contiene los atributos, un constructor y los métodos de acceso y modificación.

### Paso 4: Mejoras del código

**Entrega de la IA:** La IA propuso tres mejoras: validar los datos, utilizar métodos para aumentar y disminuir el stock, y sobrescribir el método `toString()`.

**Comparación con el pedido:** El resultado cumple porque se propusieron tres mejoras concretas para hacer la clase más segura y mantenible.

### Paso 5: Compilación

**Entrega de la IA:** Se proporcionó el código completo de `Main` y `Producto` para poder probarlo en un compilador Java.

**Comparación con el pedido:** El código está preparado para probarse, pero para cumplir específicamente con la compilación solicitada se debe guardar la clase `Producto` en un archivo llamado `Producto.java` y ejecutar `javac Producto.java`.

### Descomposición de la tarea

La tarea se dividió en varios pedidos realizados a la IA: primero se identificaron los requisitos, después se diseñaron las clases, luego se desarrolló la clase `Producto`, posteriormente se revisó y mejoró el código y finalmente se preparó el código completo para realizar las pruebas.

Esta división corresponde a **descomposición de la tarea**, ya que fui realizando diferentes pedidos para completar progresivamente el trabajo. No corresponde a Chain of Thought.

 
## Ejercicio 6: Prompt estructurado y autocritica 

| Qué revisar                                      | Cumple (Sí / No) | Observaciones                                                                                                     |
| ------------------------------------------------ | ---------------- | ----------------------------------------------------------------------------------------------------------------- |
| ¿Tiene las 4 columnas pedidas?                   | Sí               | La tabla contiene: ID, escenario, datos de entrada y resultado esperado.                                          |
| ¿Incluye el bloqueo después de 3 intentos?       | Sí               | Se incluyen casos para el primer, segundo y tercer intento fallido, además del acceso después del bloqueo.        |
| ¿Incluye casos con campos vacíos?                | Sí               | Se agregaron casos para ambos campos vacíos, correo vacío y contraseña vacía.                                     |
| ¿Indica qué casos agregó en la autocrítica?      | Sí               | Se indicaron los casos agregados, del TC-07 al TC-15, incluyendo correo inválido, espacios y casos límite.        |
| ¿Hay algún caso repetido o que no tenga sentido? | No               | No se identifican casos repetidos. Los casos cubren escenarios diferentes de validación, autenticación y bloqueo. |

```text 
<rol>Actua como analista de pruebas de software.</rol>

<contexto>Login web con correo y contrasena. La cuenta se bloquea despues de 3 intentos fallidos.</contexto>

<tarea>Piensa paso a paso que puede fallar y escribe 6 casos de prueba.</tarea>

<formato>Tabla con las columnas: ID, escenario, datos de entrada, resultado esperado.</formato>


MENSAJE DE AUTOCRÍTICA:

Revisa tu tabla: faltan casos limite como campos vacios, correo sin @ o contrasena con espacios? Agrega los que falten e indica cuales agregaste.``` 

