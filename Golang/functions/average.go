package main

import "fmt"

func average(scoreList []float64) float64 {
	total := 0.0
	for _, elementsInScoreList := range scoreList {
		total += elementsInScoreList
	}
	return total
}

func secondAverage(scoreList []float64) float64 {
	total := 0.0
	for i := 0; i < len(scoreList); i++ {
		total += scoreList[i]
	}
	return total
}

func multipleReturn() (int, int) {
	return 5, 9
}

func add(userInput ...int) int {
	fmt.Println(userInput)
	return 5
}

func name(userInput string) {
	fmt.Println("Your name is" + " " + userInput)
}

func main() {
	// inputSlice := []float64{2, 4, 5, 6}
	// five, nine := multipleReturn()
	// fmt.Println(average(inputSlice))
	// fmt.Println(nine, " =>", five)
	// add(4, 5, 6, 7)
	name("chris")
}
