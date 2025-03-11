# Midterm Exam Tasks

This midterm consists of **three** design pattern implementation tasks. Students must accumulate **100 points** total out of the **available 180 points** (100 + 40 + 40). Depending on each student’s preferred approach, they can either choose:

- **One advanced task** (worth 100 points), OR
- **One advanced task + an easy task** (total 140 points, but only 100 are required), OR
- **Two easy tasks** (80 points, still need 20 more points to reach 100, which can be compensated with extra features or an incremental extension to an existing task).

> **Note:** You can go beyond 100 points if you wish, but 100 points fulfills the requirements for the midterm.

---

## Table of Contents
1. [Smart Home Control System (Advanced – 100 points)](#smart-home-control-system-advanced--100-points)
2. [Online Payment Gateway (Easy – 40 points)](#online-payment-gateway-easy--40-points)
3. [Coffee Shop Simulator (Easy – 40-points)](#coffee-shop-simulator-easy--40-points)
4. [General Guidelines](#general-guidelines)
5. [Scoring Suggestions](#scoring-suggestions)

---

## Smart Home Control System (Advanced – 100 points)

**Design Patterns to Apply:** 
- **Composite**
- **Decorator**
- **Abstract Factory**
- **Facade**
- **Adapter**

### Task Overview
Implement a **Smart Home Control System** that simulates how various smart devices (lights, thermostats, security cameras, etc.) are managed and controlled. This project aims to demonstrate a complex interaction between multiple components using the mentioned design patterns.

### Requirements Breakdown

1. **Composite Pattern**  
   - Represent individual devices (leaf nodes) and groups of devices (composite nodes) such as rooms, floors, or entire buildings.
   - A composite node can contain multiple sub-devices (e.g., multiple lights and a thermostat in a single room).

2. **Decorator Pattern**  
   - Allow dynamic enhancement or modification of a device’s functionality (e.g., adding logging, scheduling, or power-saving mode).
   - For instance, decorate a `Light` device with a `ScheduledOperationDecorator` that automatically turns it on/off at set times.

3. **Abstract Factory Pattern**  
   - Create families of related devices. For example:
     - `BasicSmartHomeFactory` might produce standard-capability devices.
     - `AdvancedSmartHomeFactory` might produce high-end devices with extra features (e.g., AI-based thermostats, cameras with facial recognition).
   - This ensures consistent interfaces when creating multiple device types at once.

4. **Facade Pattern**  
   - Provide a simplified interface (`SmartHomeController`) to manage all devices. For example:
     - `turnAllLightsOn()`
     - `setGlobalTemperature(targetDegrees)`
     - `getSystemStatusReport()`
   - Clients only interact with the facade, not the underlying complexities.

5. **Adapter Pattern**  
   - Integrate at least one third-party or legacy system. For instance:
     - A library that controls a legacy door lock system or an external weather service for the thermostat to adjust temperature automatically.
   - The Adapter ensures the external system’s interface can be used consistently with the rest of your devices.

### Deliverables
- **Source Code** demonstrating each pattern:
  - Composite structure for the device hierarchy.
  - Decorator classes for extended functionality.
  - At least two factories (basic vs. advanced).
  - A single Facade class for central control.
  - An Adapter for the third-party or legacy system.
- **Short Demo** (CLI or basic GUI) that shows:
  - Adding devices to composite structures.
  - Decorating devices with extra behaviors.
  - Using the Facade to issue commands.
  - Using the adapted component to integrate external functionality.

### Point Allocation Example (100)
- Implementation & correctness of patterns (50 points)
- Quality & clarity of the Facade, composite structure (20 points)
- Proper use of factories (10 points)
- Proper use of decorators (10 points)
- Adapter integration (10 points)

---

## Online Payment Gateway (Easy – 40 points)

**Design Patterns to Apply:**  
- **Factory Method**
- **Adapter**

### Task Overview
Create a simplified **Online Payment Platform** that supports multiple payment methods (e.g., credit card, PayPal, cryptocurrency, or any other).

### Requirements Breakdown

1. **Factory Method Pattern**  
   - Encapsulate the creation of different payment method objects (e.g., `CreditCardPayment`, `PayPalPayment`, `CryptoPayment`).
   - Each payment class implements a common interface (`PaymentMethod`) with operations like `processPayment(amount)`.

2. **Adapter Pattern**  
   - Integrate an external or legacy API for at least one payment method. For example:
     - An external library that validates credit card transactions.
     - A mock service representing PayPal’s API calls.
   - The Adapter ensures the external library’s interface matches your `PaymentMethod` interface.

### Deliverables
- **Source Code**:
  - A clear implementation of the **Factory Method** to instantiate each payment type.
  - An **Adapter** class that communicates with at least one external or mock payment API.
- **Demo Application**:
  - A simple CLI or minimal GUI where users can:
    - Select the payment type.
    - Enter payment details (fake credit card info, crypto wallet, etc.).
    - Process the transaction (simulate success/failure).
- Show how the Adapter hides the complexity of the external API.

### Point Allocation Example (40)
- Implementation of Factory Method & correctness (20 points)
- Integration of Adapter to external service (10 points)
- Demonstration & code clarity (10 points)

---

## Coffee Shop Simulator (Easy – 40 points)

**Design Patterns to Apply:**  
- **Factory Method**
- **Decorator**

### Task Overview
Build a **Coffee Ordering System** where customers can order various coffee drinks and add extra ingredients or toppings dynamically.

### Requirements Breakdown

1. **Factory Method Pattern**  
   - Create different coffee objects (e.g., `Espresso`, `Cappuccino`, `Latte`, `Americano`) through a `CoffeeFactory`.
   - Each coffee type can implement a common interface (e.g., `Coffee`) with a method like `getCost()` or `getDescription()`.

2. **Decorator Pattern**  
   - Dynamically add ingredients or toppings (milk, caramel syrup, whipped cream, chocolate syrup).
   - Decorators wrap a `Coffee` object to modify its cost/description.
   - Example: `ChocolateDecorator` adds “Chocolate Syrup” to `getDescription()` and increases the cost.

### Deliverables
- **Source Code**:
  - Coffee classes for each type.
  - Decorator classes for the add-ons.
- **Demo Application**:
  - A console or lightweight GUI that:
    - Allows users to select a coffee base from the factory.
    - Chooses multiple toppings/ingredients.
    - Displays the final cost and description.

### Point Allocation Example (40)
- Correct Factory Method for coffee types (20 points)
- Correct Decorator implementation for toppings (10 points)
- Clarity of the final solution & demonstration (10 points)

---

## General Guidelines
1. **Language/Framework:** Students can use any programming language (Java, C#, Python, etc.) unless otherwise specified by the instructor.
2. **Documentation:**  
   - Code must be well-commented, explaining where and how each design pattern is applied.  
   - Provide a brief text or markdown file describing the architecture.
3. **Collaboration:**  
   - Students can work individually or in small teams (2-3), as determined by the instructor’s policy.
4. **Testing:**  
   - Include basic unit tests or test scripts (if possible) to demonstrate the functionality of each pattern.

---

## Scoring Suggestions
- **Total Points:** 180 (100 + 40 + 40). Students only need **100** points:
  1. **One & Done:** Complete **Smart Home Control System** (100 points).
  2. **Two Easy Tasks:** Complete **Online Payment Gateway** (40 points) + **Coffee Shop Simulator** (40 points). This totals 80; add additional features (20 points) to reach 100.
  3. **Smart Home (Advanced) + One Easy Task:** Yields 140, well above the required 100.  
- **Extra Credit:**  
  - Additional features or more advanced use of design patterns can earn extra points if instructor allows.
