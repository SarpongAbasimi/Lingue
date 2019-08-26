package main

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

func main() {

}
