#!/bin/bash

echo clean...
rm -rv bin/*
echo compile...
javac $(find . -type f -name '*.java') -d bin
echo execute...
cd bin
java $1
cd ..
