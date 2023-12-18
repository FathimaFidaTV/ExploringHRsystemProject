# HR System for Sales Team

This Java project implements a simplified Human Resources system for a sales team. It includes classes for employees, sales representatives, and sales managers, along with functionality to calculate retirement, vacation time, bonus, and commission.

## Table of Contents

- [Features](#features)
- [Classes](#classes)
- [How to Use](#how-to-use)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Features

- User interface (`User` interface) with methods for managing user credentials.
- Base class for employees (`Employee`) with common attributes and methods for calculating retirement, vacation time, bonus, and login.
- Sales representative class (`SalesRep`) extending the employee class, with an additional attribute for sales made and a method to calculate commission.
- Sales manager class (`SalesManager`) extending the sales representative class, with a team management system using a `HashMap` and an overridden method to calculate commission.

## Classes

1. **User Interface (`User`):**
   - `getUsername()`: Get the username of the user.
   - `getPassword()`: Get the password of the user.
   - `login(String username, String password)`: Validate user login credentials.

2. **Employee Class (`Employee`):**
   - Attributes: `firstName`, `lastName`, `registration`, `age`, `daysWorked`, `vacationDaysTaken`, `salary`, `yearsWorked`.
   - Methods:
     - `timeToRetirement()`: Calculate remaining years until retirement.
     - `vacationTimeLeft()`: Calculate remaining vacation days.
     - `calculateBonus()`: Calculate bonus based on salary.

3. **Sales Representative Class (`SalesRep`):**
   - Extends `Employee`.
   - Additional Attribute: `salesMade`.
   - Methods:
     - `calculateCommission()`: Calculate commission based on sales made.

4. **Sales Manager Class (`SalesManager`):**
   - Extends `SalesRep`.
   - Attributes: `salesTeam` (HashMap to manage sales representatives).
   - Methods:
     - `addSalesRep(int id, SalesRep salesRep)`: Add a sales representative to the team.
     - `calculateCommission()`: Calculate commission for the manager and the sales team.

## Thank you
