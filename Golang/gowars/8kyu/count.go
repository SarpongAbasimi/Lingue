package main

import (
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
}

func main() {
	findShort("hello he is hey book cat car ba")
}
