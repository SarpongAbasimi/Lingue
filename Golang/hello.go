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
	counter := 0
	for counter <= 10 {
		fmt.Println(counter)
		counter++
	}
	fmt.Print("***************\n")
	loopFuc()
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
