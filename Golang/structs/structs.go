package main

import (
	"fmt"
)

type Person struct {
	name    string
	age     int
	country string
}

type Animal struct {
	name   string
	colour string
}

type Lion struct {
	animal Animal
	sound  string
}

func whiteLion(lionDetails Lion) {
	fmt.Println(lionDetails.sound)
	fmt.Println(lionDetails.animal.name)
	fmt.Println(lionDetails.animal.colour)
}

func main() {
	// name := Person{
	// 	name: "chris",
	// 	age:  10,
	// }
	// fmt.Println(name.name)
	// var myStruct Person
	// myStruct.age = 90
	// myStruct.country = "China"
	// fmt.Println(myStruct.age)
	lion := Lion{
		animal: Animal{name: "pam", colour: "blue"},
		sound:  "roar",
	}
	whiteLion(lion)
}
