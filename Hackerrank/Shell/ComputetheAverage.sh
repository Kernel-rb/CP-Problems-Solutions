#!/bin/bash

read N

sum=0
for ((i=1; i<=$N; i++)); 
do
  read num
  sum=$(echo " $sum + $num " |bc)
done

r=$(echo "$sum / $N" | bc -l)
printf "%.3f" "$r"




