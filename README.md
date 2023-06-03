# Minimum-Time-for-Employee-Updates
This repository contains the solution for the "Minimum Time for Employee Updates" problem. The problem involves determining the minimum time required to inform all employees in a company about an important message. The time needed to inform each employee is provided, along with their hierarchical relationships within the organization.

## Problem Description
In a company, there are n employees numbered from 0 to n-1. Each employee has a manager, except for the head of the company who has no manager. It takes a certain amount of time (informTime[i]) for an employee (i) to inform their direct subordinates about an important message. The goal is to find the minimum time required to inform all employees in the company.

## Solution
The solution provided in this repository is implemented in Java. It uses a depth-first search (DFS) algorithm to traverse the hierarchical relationships between employees and calculate the minimum time needed. The solution constructs a graph representation of the employee hierarchy using a HashMap, where the manager is the key and the list of subordinates is the value. The DFS algorithm recursively calculates the time needed to inform each employee and updates the overall minimum time.

## Usage
To use the solution, follow these steps:

Provide the number of employees (n), the ID of the head of the company (headID), an array of managers (manager), and an array of inform times (informTime).
Create an instance of the Solution class.
Call the numOfMinutes method with the provided inputs to obtain the minimum time required.
```java
int n = 6;
int headID = 0;
int[] manager = {5, 0, 0, 5, 4, 5};
int[] informTime = {0, 6, 5, 8, 7, 3};

Solution sol = new Solution();
int minimumTime = sol.numOfMinutes(n, headID, manager, informTime);
System.out.println("Minimum time required: " + minimumTime);
```
## Complexity Analysis
The time complexity of the solution is O(n), where n is the number of employees. The DFS algorithm visits each employee only once, and the graph construction takes O(n) time. The space complexity is O(n) as well, considering the space used for the graph representation and recursive function calls.
