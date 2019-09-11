package main

import "fmt"

/*
To run this programm.
cd .. in terminal.
type in: go run learnimp/*.go
*/

type currency int

type employee struct {
	name    string
	age     int
	country string
}

func people(user employee) string {
	user.name = "haha"
	fmt.Println(user.name)
	fmt.Printf("this is the name: %s \n", user.name)
	return user.name
}

func main() {
	const (
		USD currency = iota
		EUR
		GBP
	)
	//fmt.Println("version ==> ", version)
	// symbols := [...]string{USD: "$"}
	// values := [...]int{10: 9}
	// fmt.Println(values)
	fmt.Println("**********")
	user := employee{name: "chris"}
	fmt.Println(people(user))
}
