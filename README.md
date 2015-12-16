# skinner

at some point it will be a [TIS-100](http://www.zachtronics.com/tis-100/) Language interpreter in Clojure

[TIS-100 Manual](https://steamcommunity.com/sharedfiles/filedetails/?id=456879799)



## Usage
It has a primary memory that is 0 at the beginning.
You can write to that memory using the ADD and SUB method

It can do
* ADD   (addition to the primary memory)
* SUB   (subtraction from the primary memory)
* SAV   (saves the primary memory to a temporal memory)
* SWP   (swaps out the values of the primary memory and temporal memory)
* read-commands (evaluates multiple commands)

Exampels:

'''
(parse [:ADD, 15]) ; adds 15 to the memory
(parse [:SUB, 10]) ; subtracts 10 from the memory
(parse [:SAV])     ; memory stays 5 and the temporal memory is now also 5
(parse [:ADD, 1])  ; adds 1 to the memory
(parse [:SWP])     ; memory is now 5 and temporal memory is 6

'''

'''
(do (read-commands '([:ADD, 4]
                     [:SAV]
                     [:SUB, 1]
                     [:SWP])))
'''

## TODO

a lot
see the menual

## License

Copyright © 2015 THEMEEPS

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
