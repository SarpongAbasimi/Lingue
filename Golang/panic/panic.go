package main

import "fmt"

func main() {
	defer func() {
		fmt.Println("This is the main function")
	}()
	fmt.Println("hahah")
}
