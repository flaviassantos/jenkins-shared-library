# Jenkins Shared Library

This repo it's a collection of Groovy code that can be used in various Jenkins jobs and for the java-maven-app project. 
This code can be used to perform common tasks, such as building, testing, and deploying applications.

## Structure of the shared library

- vars : 
  - functions that we call from Jenkinsfile.
  - each function/execution is its own Groovy file.
- src :
  - helper code
- resources:
  - use external libraries
  - non groovy files

