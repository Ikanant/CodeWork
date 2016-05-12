package main

import (
	"fmt"
)

func main() {
	slice := []int{1, 3, 6, 4, 1, 2}
	fmt.Println(Solution(slice))
}

func Solution(A []int) int {
	mym := make(map[int]bool)

	for _, val := range A {
		mym[val] = true
	}

	for i := 1; ; i++ {
		if _, ok := mym[i]; !ok {
			return i
		}
	}
}
