package main

import (
	"fmt"
)

func main() {
	var x, y int
	var quadrant string

	for {
		fmt.Scanln(&x, &y)

		if x == 0 || y == 0 {
			break
		}

		if x > 0 {
			quadrant = "primeiro"

			if y < 0 {
				quadrant = "quarto"
			}
		} else {
			quadrant = "segundo"

			if y < 0 {
				quadrant = "terceiro"
			}
		}

		fmt.Println(quadrant)
	}
}
