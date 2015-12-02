# skinner

at some point it will be a [TIS-100](http://www.zachtronics.com/tis-100/) Language interpreter in Clojure

[TIS-100 Manual](https://steamcommunity.com/sharedfiles/filedetails/?id=456879799)



## Usage
It has a primary memory that is 0 at the beginning.
You can write to that memory using the ADD and SUB method

It can do
* ADD   (addition to the primary memory)
* SUB   (subtraction from the primary memory)

(parse [:ADD, 5]) ; adds 5 to the memory
(parse [:SUB, 10]) ; subtracts 10 from the memory

## TODO

a lot
see the menual

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
