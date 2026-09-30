# Tarea: Mi prompt avanzado

## Tarea elegida

La tarea elegida es **generar casos de prueba para una aplicación web de lista de tareas (To-Do List)**.

La aplicación permite al usuario crear tareas, editarlas, marcarlas como completadas y eliminarlas. El objetivo del prompt es conseguir casos de prueba claros y útiles que permitan comprobar el correcto funcionamiento de estas funcionalidades.

---

## Version 1: prompt basico

### Prompt

```text
Genera 6 casos de prueba para una aplicación web de lista de tareas. La aplicación permite crear, editar, completar y eliminar tareas.
```

### Técnica utilizada

En esta primera versión no se utilizan técnicas avanzadas de prompting. Es un prompt básico que indica directamente qué resultado se necesita.

### ¿Por qué?

Se utiliza como punto de partida para poder observar qué información falta y cómo mejorar la respuesta en las siguientes versiones.

### ¿Qué mejoró en la respuesta?

La respuesta permite obtener algunos casos de prueba, pero puede ser poco específica. No se indica el rol que debe adoptar la IA, tampoco se define un formato concreto ni se explica cómo distribuir los casos entre las diferentes funcionalidades.

---

## Version 2

### Prompt

```text
Actúa como analista QA especializado en pruebas funcionales de aplicaciones web.

<contexto>
Estamos probando una aplicación web de lista de tareas (To-Do List).
La aplicación permite crear, editar, completar y eliminar tareas.
</contexto>

<tarea>
Genera 8 casos de prueba que cubran las funcionalidades principales de la aplicación.
Incluye casos positivos y casos negativos.
</tarea>

<formato>
Presenta los resultados en una tabla con las columnas:
ID | Escenario | Datos de entrada | Resultado esperado
</formato>
```

### Técnica agregada

En esta versión se agregaron **role prompting** y **prompt estructurado**.

### ¿Por qué?

El role prompting permite establecer un perfil concreto para la IA, en este caso un analista QA especializado en pruebas funcionales web.

El prompt estructurado permite separar claramente el contexto, la tarea y el formato esperado, reduciendo la posibilidad de obtener una respuesta desordenada.

### ¿Qué mejoró en la respuesta?

La respuesta debería ser más específica y organizada. Además, los casos de prueba deberían estar orientados a pruebas funcionales y aparecer en una tabla con las columnas solicitadas.

Sin embargo, todavía no se proporciona un ejemplo del resultado esperado ni se indica cómo distribuir las pruebas entre las distintas funcionalidades.

---

## Version 3: prompt final

### Prompt

```text
Actúa como analista QA especializado en pruebas funcionales de aplicaciones web.

<contexto>
Estamos probando una aplicación web de lista de tareas (To-Do List).

La aplicación tiene las siguientes funcionalidades:
1. Crear una tarea.
2. Editar una tarea existente.
3. Marcar una tarea como completada.
4. Eliminar una tarea.

El objetivo es comprobar que las funcionalidades principales funcionan correctamente y detectar posibles errores de validación o comportamiento.
</contexto>

<ejemplo>
Un caso de prueba puede tener esta estructura:

ID: TC-01
Escenario: Crear una tarea con datos válidos
Datos de entrada: Título = "Comprar alimentos"
Resultado esperado: La tarea se crea y aparece en la lista de tareas.
</ejemplo>

<tarea>
Genera 10 casos de prueba.

Divide los casos de prueba entre las cuatro funcionalidades:
- Crear tarea.
- Editar tarea.
- Completar tarea.
- Eliminar tarea.

Incluye casos positivos y negativos.
Incluye al menos un caso límite o de validación, por ejemplo intentar crear una tarea sin título.

Después de generar los casos, realiza una autocrítica:
- Comprueba que las cuatro funcionalidades estén cubiertas.
- Detecta casos repetidos.
- Comprueba que los resultados esperados sean claros y verificables.
- Si falta alguna cobertura importante, corrige la tabla antes de presentar la respuesta final.
</tarea>

<formato>
Presenta únicamente el resultado final en una tabla con las columnas:

ID | Escenario | Datos de entrada | Resultado esperado

Los IDs deben ser consecutivos desde TC-01 hasta TC-10.
</formato>
```

### Técnicas agregadas

En esta versión se incorporaron **few-shot, descomposición y autocrítica**, además de conservar las técnicas de role prompting y prompt estructurado de la versión anterior.

### ¿Por qué?

**Few-shot:** se proporciona un ejemplo de un caso de prueba para mostrar a la IA exactamente el nivel de detalle y formato que se espera.

**Descomposición:** la tarea se divide en las cuatro funcionalidades principales de la aplicación. Esto ayuda a evitar que la respuesta se concentre solamente en una funcionalidad.

**Autocrítica:** se solicita una revisión de la respuesta para detectar funcionalidades sin cubrir, casos repetidos y resultados esperados poco claros.

### ¿Qué mejoró en la respuesta?

La versión final debería producir casos de prueba más completos, organizados y verificables. Además, se establece explícitamente que las cuatro funcionalidades deben estar cubiertas y que deben existir casos positivos, negativos y de validación.

La autocrítica permite detectar posibles problemas antes de presentar la respuesta final.

---

## Técnicas usadas en el prompt final

| Técnica             | Parte del prompt final                                                             | Propósito                                                                              |
| ------------------- | ---------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| Role prompting      | "Actúa como analista QA especializado en pruebas funcionales de aplicaciones web." | Define el rol y el enfoque que debe adoptar la IA.                                     |
| Prompt estructurado | Etiquetas `<contexto>`, `<ejemplo>`, `<tarea>` y `<formato>`                       | Organiza las instrucciones y facilita que la IA identifique cada parte.                |
| Few-shot            | Ejemplo de un caso de prueba con ID, escenario, datos y resultado esperado         | Muestra a la IA un ejemplo del resultado que se espera obtener.                        |
| Descomposición      | División en crear, editar, completar y eliminar tareas                             | Divide la tarea en partes más pequeñas para asegurar una cobertura completa.           |
| Autocrítica         | "Después de generar los casos, realiza una autocrítica..."                         | Permite revisar cobertura, duplicados y claridad antes de entregar el resultado final. |

---

## Evaluación del resultado

| Criterio                                           | Cumple (Sí / No) | Observación                                                                                          |
| -------------------------------------------------- | ---------------- | ---------------------------------------------------------------------------------------------------- |
| ¿El prompt utiliza un rol específico?              | Sí               | Define el rol como analista QA especializado en pruebas funcionales de aplicaciones web.             |
| ¿El prompt tiene un formato de respuesta definido? | Sí               | Solicita una tabla con cuatro columnas concretas.                                                    |
| ¿Incluye al menos tres técnicas de prompting?      | Sí               | Utiliza cinco técnicas: role prompting, prompt estructurado, few-shot, descomposición y autocrítica. |
| ¿Incluye las cuatro funcionalidades principales?   | Sí               | Se especifican crear, editar, completar y eliminar tareas.                                           |
| ¿Incluye casos positivos y negativos?              | Sí               | Se solicita expresamente cubrir ambos tipos.                                                         |
| ¿Incluye casos límite o de validación?             | Sí               | Se solicita al menos un caso de validación, como crear una tarea sin título.                         |
| ¿Incluye un ejemplo para orientar la respuesta?    | Sí               | Se proporciona un caso de prueba completo como ejemplo.                                              |
| ¿Incluye una revisión o autocrítica?               | Sí               | Se solicita comprobar cobertura, duplicados y claridad de los resultados.                            |

---

## Por qué elegí estas técnicas

Elegí **role prompting, prompt estructurado, few-shot, descomposición y autocrítica** porque se adaptan bien a una tarea de generación de casos de prueba. El role prompting permite establecer el perfil de un analista QA, mientras que el prompt estructurado organiza claramente el contexto, la tarea y el formato. El few-shot proporciona un ejemplo concreto para orientar el nivel de detalle esperado. La descomposición permite dividir la aplicación en sus funcionalidades principales y mejorar la cobertura de las pruebas. Finalmente, la autocrítica permite revisar el resultado y detectar casos repetidos o funcionalidades que no hayan sido cubiertas. No utilicé otras técnicas porque estas cinco son suficientes para controlar tanto el contenido como la estructura y la calidad del resultado final.
