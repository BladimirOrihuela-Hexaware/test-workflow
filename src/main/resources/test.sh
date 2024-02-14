#!/bin/bash

# Read the value from the file
value=$(cat qaBuild.txt)
# Increment the value by 1
((value++))

# Write the new value back to the file
echo $value > qaBuild.txt
