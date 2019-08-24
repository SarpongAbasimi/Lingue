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

func main() {
	inputSlice := []float64{2, 4, 5, 6}
	fmt.Println(average(inputSlice))
}
