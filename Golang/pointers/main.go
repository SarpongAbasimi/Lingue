package main

import (
	"fmt"
)

func main() {
	number := 2
	addressOfNumber := &number
	fmt.Printf("The value stored in number is %v \n", number)
	fmt.Println(addressOfNumber)
	fmt.Println(*addressOfNumber)
	*addressOfNumber = 10
	fmt.Println("******************")
	fmt.Println(number)
}
