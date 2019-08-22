package main

import "fmt"

var cat = "cat"

func main() {
	var surname = "Abasimi"
	name := "sarpong"
	fmt.Println(len("Hello World"))
	fmt.Println(name + " " + surname)
	fmt.Println("cat is called " + cat)
	getUserInput()
}
func useVariable() {
	fmt.Println("This is from the useVariable function")
	fmt.Println(cat)
	fmt.Println("hahahahaha")
}

func getUserInput() {
	fmt.Print(" Please Enter a number: ")
	var input int8
	fmt.Scanf("%f", &input)

	output := input * 2
	fmt.Println(output)
}
