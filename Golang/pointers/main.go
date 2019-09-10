package main

import (
	"fmt"
)

func anotherFunction(anumber *int) {
	fmt.Println(anumber)
}

func main() {
	var aPointer *int

	conversion := 3.6
	number := 2
	myname := new(string)

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
	fmt.Println("&&&&&&&")
	fmt.Println(myname)
	fmt.Println(int(conversion))
	fmt.Println("******************")
}
