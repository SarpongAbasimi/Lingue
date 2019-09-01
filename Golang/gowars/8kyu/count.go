package main

import (
	"fmt"
	"sort"
	"strings"
)

func mapss(x []int) []int {
	userInput := x
	answerContainer := make([]int, len(userInput))
	for i, elementsInUserInput := range userInput {
		answerContainer[i] = elementsInUserInput * 2
		// answerContainer = append(answerContainer, elementsInUserInput*2)
	}
	return answerContainer
}

func monkeyCount(n int) []int {
	number := n
	countMokey := make([]int, 0)
	for i := 1; i <= number; i++ {
		countMokey = append(countMokey, i)
	}
	return countMokey
}

func arithmetic(a int, b int, operator string) int {
	typeOfOperator := operator
	var answer int

	switch typeOfOperator {
	case "add":
		answer = a + b
	case "subtract":
		answer = a - b
	case "multiply":
		answer = a * b
	case "divide":
		answer = a / b
	}
	return answer
}

func findShort(s string) int {
	stringOfWords := s
	splitStringOfwords := strings.Split(stringOfWords, " ")
	storeWordCount := make([]int, 0)
	for _, value := range splitStringOfwords {
		storeWordCount = append(storeWordCount, len(value))
	}
	sort.Ints(storeWordCount)
	return storeWordCount[0]
}
func oddCount(n int) int {
	// get all odd number between 0 and n
	allOddNumbers := make([]int, 0)
	for i := 0; i < n; i++ {
		if i%2 != 0 {
			allOddNumbers = append(allOddNumbers, i)
		}
	}
	fmt.Println(allOddNumbers)
	return len(allOddNumbers)
}

func main() {

}
