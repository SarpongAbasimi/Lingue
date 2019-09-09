package main

import (
	"fmt"
)

func anotherFunction(anumber *int) {
	fmt.Println(anumber)
}

func main() {
	var aPointer *int

	number := 2

	addressOfNumber := &number
	fmt.Printf("The value stored in number is %v \n", number)
	fmt.Println(addressOfNumber)
	fmt.Println(*addressOfNumber)
	*addressOfNumber = 10
	fmt.Println("******************")
	fmt.Println(number)

	getMemoryLocation := &aPointer

	fmt.Println(getMemoryLocation)
	fmt.Println("******************")

	anotherFunction(addressOfNumber)
}
