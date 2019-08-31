package main

import (
	"fmt"
)

type Person struct {
	name    string
	age     int
	country string
}

func main() {
	name := Person{
		name: "chris",
		age:  10,
	}
	fmt.Println(name.name)
	var myStruct Person
	myStruct.age = 90
	fmt.Println(myStruct.age)
}
