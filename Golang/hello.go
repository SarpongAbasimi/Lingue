package main

import "fmt"

var cat = "cat"

func main() {
	// var surname = "Abasimi"
	// name := "sarpong"
	// fmt.Println(len("Hello World"))
	// fmt.Println(name + " " + surname)
	// fmt.Println("cat is called " + cat)
	// getUserInput()
	// counter := 0
	// for counter <= 10 {
	// 	fmt.Println(counter)
	// 	counter++
	// }
	// fmt.Print("***************\n")
	// loopFuc()
	// getUserInputNow()
	// var x [5]int
	// x[4] = 10
	// for i := 0; i < len(x); i++ {
	// 	fmt.Println(x[i])
	// }
	// var x [3]int
	// for _, value := range x {
	// 	fmt.Println("value", value)
	// }
	// createSlice()
	// appendToSlice()
	secondDictionary()
}

func dictionary() {
	mydictionary := make(map[string]string)
	mydictionary["name"] = "chris"
	mydictionary["age"] = "ten"
	mydictionary["country"] = "jor"
	fmt.Println(mydictionary["name"])
	fmt.Println(mydictionary["age"])

}

func secondDictionary() {
	mydictionary := map[string]string{
		"hello": "hi",
		"food":  "Banku",
		"money": "I dont know",
	}

	for _, value := range mydictionary {
		fmt.Println(value)
	}
}

func appendToSlice() {
	initialSlice := []int{1, 3, 5, 9}
	twoInSlice := []int{5, 7}
	for _, elementsInInitialSlice := range initialSlice {
		appendTotwoInSlice := append(twoInSlice, elementsInInitialSlice)
		fmt.Println(appendTotwoInSlice)
	}
	secondAppend := append(twoInSlice, 100, 20)
	fmt.Println(secondAppend)
}

func createSlice() {
	var secondSlice []int
	mySliceVaraible := make([]int, 3)
	for index, elementsInSlice := range mySliceVaraible {
		fmt.Println(secondSlice)
		fmt.Println("index", index, "elements", elementsInSlice)
	}
}

func createArray() {
	myArray := [5]int{
		10,
		11,
		12,
		13,
		14,
	}
	for _, arrayElements := range myArray {
		fmt.Println(arrayElements, "was in the myArray array")
	}
}

func createNumbers() {
	for i := 1; i <= 100; i++ {
		if i%3 == 0 {
			fmt.Println(i)
		}
	}
}

func fizzBuzz() {
	for i := 1; i <= 100; i++ {
		if i%15 == 0 {
			fmt.Println("FizzBuzz")
		} else if i%3 == 0 {
			fmt.Println("Fizz")
		} else if i%5 == 0 {
			fmt.Println("Buzz")
		}
	}
}

func bigOrSmall() {
	i := 10
	if i > 10 {
		fmt.Println("Big")
	} else {
		fmt.Println("Small")
	}
}

func useVariable() {
	fmt.Println("This is from the useVariable function")
	fmt.Println(cat)
	fmt.Println("hahahahaha")
	fmt.Println(`1
	2
	3`)
}

func getUserInput() {
	fmt.Print(" Please Enter a number: ")
	var input float32
	fmt.Scanf("%f", &input)

	output := input * 2
	fmt.Println(output)
}

func loopFuc() {
	for i := 0; i < 10; i++ {
		if i%2 == 0 {
			fmt.Println("even")
		} else {
			fmt.Println("odd")
		}
	}
}

func getUserInputNow() {
	fmt.Println("Please enter a number")
	var input float32
	fmt.Scanf("%f", &input)

	switch input {
	case 0:
		fmt.Println("you entered 0")
	case 1:
		fmt.Println("you entered one")
	case 2:
		fmt.Println("you enntered two")
	default:
		fmt.Println(" ahahaha I don't knwo what was entered")
	}
}
