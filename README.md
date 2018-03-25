# HellTriangle
Given a triangle of numbers, find the maximum total from top to bottom

## Getting Started
This project was implemented in Java 8

### Prerequisites
Eclipse (or another IDE that runs Java 8 projects)

### Installing
Import the HellTriangle project on your IDE

## Running
There are a "tests" package. Just need to run the "HellTriangleSuiteTest.java" suite test.
If you want to change the input values, you can do this go into the test case classes "BuildTreeTest.java" and "CalculateMaximumTotalTest.java"

## About the project

### Packages
The project was divided in three packages: 

```
data (the core of project)
exception (package for exception classes)
tests (package for test cases)
```

### Code

#### Building a TreeNode
The Triangle is represented by a TreeNode object. The TreeNode class has a Node as global field (root). The node store a value of triangle and also have two children (leftNode and rightNode).

So, when the TreeNode is initialized, the constructor initiates the root node with the [0][0] value off the multidimensional input array.
Then, its time to build the rest of the tree. "buildTree" private method is called during the initialization of the TreeNode, and recursively it creates all the tree nodes.

#### Calculating the maximum total
Once the TreeNode was built, then its possible to calculate de maximum total of a tree branch.
The method "calculateMaximumTotal" in TreeNode class get the root field (now populated) and then go into all nodes recursively. For each node, it get the node value and check the max between the amount and the node value plus left child, and then do the same with the right child.

## Author

* **Leonardo Leandro** - *Initial work* - [HellTriangle](https://github.com/LeoLeandro/HellTriangle)
