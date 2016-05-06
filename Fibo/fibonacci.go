package main

import (
	"fmt"
)

func main() {
	i := 31

	printFibo(1,1,i)
}

func printFibo (num0, num1, limit int) {
	fmt.Print(num0, " ")
	if num1<limit {
		printFibo(num1, (num0+num1), limit)
	} else{
		fmt.Println("DONE")
	}
}
