# Quotes - Lab09

## Introduction  

---

In this Lab, we will either connect Online API with the previous project (Lab08) or render the file json if the internet is not connected .

Next, choose a quote randomly render it with the author of this quote

## Class content

---

To see the result of the Class:  

1. Clone the repo from github to your local machine  

2. open the project in intellij Environment  

3. Create the main and Test configurations As shown Below:

![Configuration](https://camo.githubusercontent.com/bc520bc30cee9475c48ca6b020c93e5fd8eec3b3f851936179d734fa4563daee/68747470733a2f2f692e6962622e636f2f634a366b4e57732f53637265656e73686f742d66726f6d2d323032322d30332d30362d31342d35392d35332e706e67)

---
<!-- After a configuration setup, in the main class create As shown below:
![main class](https://i.ibb.co/H499JWH/Screenshot-from-2022-03-10-23-58-20.png)

> Quote q = new Quote();  
    q.ReadGson();  
    //q.print();  
    q.shuffleQoute();  
    System.out.println(q.length());   -->

The output in Offline mode should be like the image below:
![Offlinemode](https://i.ibb.co/2YwxWvH/Screenshot-from-2022-03-14-23-41-02.png)

---

The output in online mode should be like the image below:
![oneline mode](https://i.ibb.co/3NhVnDd/Screenshot-from-2022-03-14-23-42-42.png)

To run the code, you can type in the terminal:

>`renad@renad-HP-Notebook:~/Desktop/LTUCTraining/Advance/quotes$` ./gradlew run

The result should be:
![Run from terminal image](https://i.ibb.co/vv9691L/Screenshot-from-2022-03-14-23-48-55.png)

---

To Test the code, you can type in the terminal:

- **Please consider that: the second test depending on the connection, please sure your Internet is connected to pass all the Test**

>`renad@renad-HP-Notebook:~/Desktop/LTUCTraining/Advance/quotes$` ./gradlew test

The result should be:

![Test from the terminal](https://i.ibb.co/D8qvTX3/Screenshot-from-2022-03-14-23-51-09.png)
