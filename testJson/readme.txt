1. Two library Gson and Jackson
2. Make the field with transient to be ignored when serialising
3. For Jackson , add the jar file in build path of project(if it is not maven project)
Core/annotation/databind
4. When deserialising, make sure one default constructor is there(no argument, no body)