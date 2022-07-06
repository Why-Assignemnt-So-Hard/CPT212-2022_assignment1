# CPT212-2022_assignment1

---

The program is required to implement insertion, bubble, quick and radix sort algorithms on a list of words in lexicographic order

## Table of content
* [1. BUBBLE SORT](#1.-bubble-sort)
** [1.1 Result](#1.1-result)
** [1.2 Graph](#1.2-graph) 
** [1.3 Time Complexity](#1.3-time-complexity) 
* [2. QUICK SORT](#2.-quick-sort)
** [2.1 Result](#2.1-result)
** [2.2 Graph](#2.2-graph) 
** [2.3 Time Complexity](#2.3-time-complexity) 
* [3. INSERTION SORT](#3.-insertion-sort)
** [3.1 Result](#3.1-result)
** [3.2 Graph](#3.2-graph) 
** [3.3 Time Complexity](#3.3-time-complexity) 
* [4. RADIX SORT](#4.-radix-sort)
** [4.1 Result](#4.1-result)
** [4.2 Graph](#4.2-graph) 
** [4.3 Time Complexity](#4.3-time-complexity) 

## 1. BUBBLE SORT
### 1.1 Result
![2022-07-03 15_51_38-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177030621-4010e047-c5d8-4d75-8cf6-efad37200ff9.png)

### 1.2 Graph
![2022-07-03 15_51_53-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177030634-bca8c284-8274-43bc-935b-6d8cc923927a.png)

### 1.3 Time Complexity
![2022-07-03 15_52_04-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177030642-7894b885-69c6-4f63-a909-5520d49eb066.png)

According to the graph from our experimental result, the best case time complexity of bubble sort is obtained under the condition that all the elements in the array list are sorted in alphabetical order while the average case time complexity of bubble sort is obtained under the condition that all the elements in the array list are arranged randomly. Then, the worst case time complexity of bubble sort is obtained under the condition that all the elements in the array list are sorted in descending alphabetical order.  

From the graph, the curve of the worst case and average case show quadratic growth. Hence, we can say that the time complexity of the worst case and average for bubble sort is O(n2). On the other hand, the curve of the best case grows linearly in the beginning of the graph. However, the curve grows in quadratic manner after a certain point due to the number of inputs exceeding the best case possibility. Therefore, we conclude that the time complexity of the best case for bubble sort is O(n2) too. 

## 2. QUICK SORT
### 2.1 Result
![2022-07-03 15_55_20-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177086839-9e12170e-7434-4dba-b498-99fc5034c0ea.png)

### 2.2 Graph
![2022-07-03 15_55_32-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177086847-7625a7ec-782f-4a47-afcb-32f7862aee32.png)

### 2.3 Time Complexity
![2022-07-03 15_55_44-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177086850-cad6b9e9-add4-4bc2-b9ba-081c7c0ec510.png)

According to the graph, the first element has been selected as pivot in the quick sort. The best case time complexity of quick sort is obtained under the condition that all the elements in the array list are arranged randomly while the average case time complexity of quick sort is obtained under the condition that all the elements in the array list are sorted in alphabetical order. Then, the worst case time complexity of quick sort is obtained under the condition that all the elements in the array list are sorted in descending alphabetical order. 

As we can see, the curve of the best case and average case grow in the way of log-linear in the graph. Hence, we can say that the time complexity of the best case and average case for quick sort is O(n*logn). On the other hand, the curve of the worst case shows quadratic growth in the graph. Therefore, we can conclude that the worst case time complexity for quick sort is O(n2). 

## 3. INSERTION SORT
### 3.1 Result
![2022-07-03 16_01_11-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 12 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177030924-485f82ba-86d7-4c40-8292-cb4f39bbd739.png)

### 3.2 Graph
![2022-07-03 16_01_21-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 12 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177030935-49d555dc-f785-4630-bd59-770fd162b753.png)

### 3.3 Time Complexity
![2022-07-03 16_01_33-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 12 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177030947-daaccf53-8731-4160-9e85-d4268636d1ba.png)

According to the result obtained from the graph, the best case time complexity of insertion sort is obtained under the condition that all the elements in the array list are sorted in alphabetical order. The average case time complexity of insertion sort is obtained under the condition that all the elements in the array list are arranged in random order. Then, the worst case time complexity of insertion sort is obtained under the condition that all the elements in the array list are sorted in descending alphabetical order. After that, n - 1 number of comparisons will be performed for every nth element as each element will have to compare with each other. 

As we can see, the curve of the worst case and average case shows quadratic growth in the graph. Hence, we can say that the time complexity of the worst case and average case for bubble sort is O(n2). On the other hand, the curve of the best case grows linearly in the graph. Therefore, we can conclude that the best case time complexity for bubble sort is O(n). 

## 4. RADIX SORT
### 4.1 Result
![2022-07-03 16_05_21-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177031031-14cc2a28-9ecf-4274-b0d2-e65eb85a9b08.png)

### 4.2 Graph
![2022-07-03 16_05_29-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177031041-33f145f2-43fc-4f6c-855d-c91a88bc64fe.png)

### 4.3 Time Complexity 
![2022-07-03 16_05_39-CPT212_ASSIGNMENT1_LSD_LZX_KKR_LPS - Google Docs and 11 more pages - Personal - ](https://user-images.githubusercontent.com/64214479/177031060-e758ec54-44c5-4542-a7e2-1cb7452b6913.png)

Based on the graph from our experiment, the best case time complexity of radix sort is obtained under the condition that all the elements in the array list are sorted in alphabetical order. The average case time complexity of radix sort is obtained under the condition that all the elements in the array list are arranged in random order. Then, the worst case time complexity of radix sort is obtained under the condition that all the elements in the array list are sorted in descending alphabetical order. 

From the graph, the curves of three cases of radix sort exhibit the same pattern in the graph. As we can see from the graph, the curve for best case, worst case and average case grow linearly. Therefore, we can conclude that the best case, worst case and average case time complexity for radix sort is O(n + k). 

---
<h2 align="center">Thank you</h2>
