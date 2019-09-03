package main

import (
	"fmt"
	"strings"
)

func containFuction() {
	word := "Sarpong"
	fmt.Println(strings.Contains(word, "ong"))

}

func stringCount(word, letter string) {
	fmt.Println(strings.Count(word, letter))
}

func joinSlice(data []string) (output string) {
	output = strings.Join(data, "-")
	return
}

func main() {
	testSlice := []string{"name", "age", "houseNumber"}
	containFuction()
	stringCount("chriss", "s")
	fmt.Println(joinSlice(testSlice))
}
