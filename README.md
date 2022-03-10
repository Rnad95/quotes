# Quotes - Lab08

## Introduction  

---

In this Lab, we will Create a Quote Class to read json file then, convert it to Array of Object.  

Next, choose a quote randomly from the array and render it with the author of this quote

## Class content

---

To see the result of the Class:  

1. Clone the repo from github to your local machine  

2. open the project in intellij Environment  

3. Create the main and Test configurations As shown Below:

![Configuration](https://camo.githubusercontent.com/bc520bc30cee9475c48ca6b020c93e5fd8eec3b3f851936179d734fa4563daee/68747470733a2f2f692e6962622e636f2f634a366b4e57732f53637265656e73686f742d66726f6d2d323032322d30332d30362d31342d35392d35332e706e67)

4. The Quote Class contains:

- `ReadGson()` Method from the `resources` file  

- `print ()` Method to print all ArrayOfObject

- `shuffleQuote()` Method to choose method randomly  and render it.

- `length()` Method to return the the length of the Array.  

- `toString()` to render the data in appropriate way.  

## How to Run

---

After the configuration setup, in the main class create As shown below:
![main class](https://i.ibb.co/H499JWH/Screenshot-from-2022-03-10-23-58-20.png)

> Quote q = new Quote();  
    q.ReadGson();  
    //q.print();  
    q.shuffleQoute();  
    System.out.println(q.length());  

- Since running the code please write qoutes in the run box:

![output](https://i.ibb.co/W0cWKp0/Screenshot-from-2022-03-10-23-55-23.png)

the output should be like the image below:

![The output of Code](https://i.ibb.co/KVHkS2H/Screenshot-from-2022-03-11-00-02-32.png)

---

To Test the code, you can type in the terminal:

>`renad@renad-HP-Notebook:~/Desktop/LTUCTraining/Advance/quotes$` ./gradlew test

