#!/bin/bash

read -p "Enter a mathematical expression: " expression

result=$(bc <<< "scale=4; $expression")

printf "%.3f\n" "$result"
