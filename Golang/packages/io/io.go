package main

import (
	"fmt"
	"io/ioutil"
	"os"
)

const errorMessage string = "There was an error whiles opening the file"

func readFileOne() {
	file, err := os.Open("file.txt")
	if err != nil {
		fmt.Println(errorMessage)
	}
	fmt.Println(file)
	defer file.Close()
}

func readFileTwo() {
	file, err := ioutil.ReadFile("file.txt")
	if err != nil {
		fmt.Println(errorMessage)
	}
	str := string(file)
	fmt.Printf("The file conatains: %s", str)
}

func openDir() {
	dir, err := os.Open("../..")
	if err != nil {
		fmt.Printf(errorMessage)
	}
	defer dir.Close()

	dirData, err := dir.Readdir(-1)
	if err != nil {
		fmt.Println("Error reading data")
	}

	for _, data := range dirData {
		fmt.Println(data.Name())
	}
}

func main() {
	openDir()
}
