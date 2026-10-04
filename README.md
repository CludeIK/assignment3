# Assignment 3: Bridge Pattern

**Name:** Imangali Kabiyev
**Group:** SE-2529  
**Topic:** Option D (Remote controls)
**Base Commit Hash:** b2fcdf0

## Role Map
| Role | Class Name | File Path |
| :--- | :--- | :--- |
| Abstraction | `Remote` | `src/remotes/Remote.java` |
| Refined Abstraction 1 (A1) | `BasicRemote` | `src/remotes/BasicRemote.java` |
| Refined Abstraction 2 (A2) | `QuietRemote` | `src/remotes/QuietRemote.java` |
| Implementor | `Device` | `src/devices/Device.java` |
| Concrete Implementor 1 (I1)| `TvDevice` | `src/devices/TvDevice.java` |
| Concrete Implementor 2 (I2)| `RadioDevice` | `src/devices/RadioDevice.java` |
| Concrete Implementor 3 (I3)| `ProjectorDevice` | `src/devices/ProjectorDevice.java` |
| Client | `Main` | `src/Main.java` |

* **Bridge Field:** `protected Device device;` inside `Remote.java`.
* **execute() method:** Located in `Remote.java`.
* **setImplementation() method:** Located in `Remote.java`.
* **T5 Check (Runtime Switch):** Located in `Main.java` inside the `main` method.

## Build and Run Commands
```bash
javac -encoding UTF-8 -d out "@sources.txt"
java -cp out Main