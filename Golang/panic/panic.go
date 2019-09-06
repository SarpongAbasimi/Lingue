package main

import "fmt"

func main() {
	defer func() {
		fmt.Println("Second defer")
	}()
	defer func() {
		fmt.Println("This is the main function")
	}()
	fmt.Println("I will be called first")
	fmt.Println("I will be called second")
	defer func() {
		fmt.Println("user second print defer")
	}()
}
