# Restaurant Simulator
This is a program that simulates the processes of farmers growing vegetables and customers eating those very same vegetables at the restaurant. The program works concurrently, that is to say, the farmers and the customers will grow and eat vegetables at the same time.

## Program elements

### Farmer
Class that extends from Thread, with a constructor where the name, quantity of vegetables to grow and a Restaurant object that will be shared with the customers that can be customized; and an overwritten Run method, that will simulate a random growth period for the vegetable and will show a message with the name of the farmer and the grown vegetable.

### Customer
Class that extends from Thread, with a constructor where the name, quantity of vegetables to eat and a Restaurant object that will be shared with the farmers that can be customized; and an overwritten Run method, that will simulate a random interval for the vegetable to be eaten, and will show a message with the name of the customer and the eaten vegetable.

### Restaurant
Storage where the vegetables will be entered and taken out. It features methods to add vegetables to it as well as to delete vegetables, as well as a way to see which vegetables are in storage at the moment. It also has a constructor from which the user can customize the maximum capacity of the storage from the Restaurant.

### Utils
Static class that features a method to get a random vegetable from a set list, another method to get a random interval from 0 to 10 seconds.
