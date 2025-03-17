
##  Smart Home Control System (Midterm)

### Overview
This project simulates a **Smart Home Control System** where various smart devices (lights, thermostats, security cameras) can be managed efficiently. It demonstrates multiple **design patterns** 
Project structure (uml diagram):
![image](https://github.com/user-attachments/assets/11ad5902-502e-4ee9-a9e7-1ea651d5d70d)

---

## Design Patterns Used

### 1️ **Composite Pattern** – (Device Grouping)
Used to group multiple devices together (e.g., a **room or floor**) and control them as a single entity.

- **Class:** `DeviceGroup`
- **Example:** A **Living Room** can contain multiple **lights, thermostats, and cameras**, allowing batch control.
**Illustration** :
  ![image](https://github.com/user-attachments/assets/9d3249d3-f8d2-462e-af69-b8380271b708)

---

### 2️ **Decorator Pattern** – (Adding Features Dynamically)
Used to **extend device functionality** at runtime without modifying existing code.

- **Class:** `DeviceDecorator`, `ScheduledOperationDecorator`
- **Example:** A **Light** is wrapped with a **ScheduledOperationDecorator** to add scheduling functionality.

---

### 3️ **Abstract Factory Pattern** – (Creating Families of Devices)
Used to create **standard and advanced versions** of smart devices via a factory interface.

- **Class:** `SmartHomeFactory` (Abstract),  
  **Concrete Factories:** `BasicSmartHomeFactory`, `AdvancedSmartHomeFactory`
- **Example:** A **Basic Factory** creates standard devices, while an **Advanced Factory** creates devices with more advanced functinoality.
- ![image](https://github.com/user-attachments/assets/134ca504-88e6-4c5d-8751-75d619e4252d)


---

### 4️ **Facade Pattern** – (Simplified System Control)
Used to **provide a unified interface** to manage all devices easily.

- **Class:** `SmartHomeController`
- **Example:** Methods like `turnAllDevicesOn()` and `setGlobalTemperature()` simplify controlling all devices.

---![image](https://github.com/user-attachments/assets/e8351a98-d7aa-4b3c-b924-58b777bc35c8)


### 5️ **Adapter Pattern** – (Integrating Legacy Systems)
Used to **integrate non-compatible systems** into the smart home architecture.

- **Class:** `LegacyDoorLockAdapter`
- **Example:** A **LegacyDoorLock** (which does not follow the `Device` interface) is **adapted** to work with other devices.


---

## 🚀 How to Run
1. Compile and run the **`Demo.java`** file.
Explanation (of patterns used): 
First of all, we are using Abstract factory patterns to create advancedFactory,basicFactory then by this two factories we are initializing devices
like:
Device basicLight = basicFactory.createLight("BasicLight1");
        Device advancedLight = advancedFactory.createLight("AdvancedLight1");
        Device basicThermostat = basicFactory.createThermostat("BasicThermostat1");
...
2) By composite pattern we represented room "living room" and by creating object of "devicegroup" 
3) Decorate a basic light with scheduling functionality.
4) Using Adapter Pattern
 Integrate a legacy door lock system.
        LegacyDoorLock legacyLock = new LegacyDoorLock();

        
5) Using Facade Pattern
Create a facade controller to simplify control over the system.
        SmartHomeController controller = new SmartHomeController();
