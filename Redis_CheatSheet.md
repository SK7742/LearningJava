# Redis Cache

Redis is a popular, open-source, in-memory data structure store that is often used as a caching system. It functions as a key-value store, allowing for fast storage and retrieval of data. Because it stores data in memory, Redis offers very low latency, making it ideal for applications requiring quick access to frequently used information.

# Benefits
1. Enhances the system performance and scalability of the application.
2. Stores the data temporarily as cache to reduce the access time and the load on the backend system.
3. Handles very large number of read write effectively, acts very fast.
4. Suitable for high scale applications.
5. Persistent Redis can be configured to persist data to disk, providing a balance between speed and durability.



## Installation & Running the container

To Install latest Redis on docker, follow the command

```Docker
Docker pull redis   --Downloads and Install the latest redis image
docker image ls -a    --list all the available images
docker run -d -p 6379:6379 --name customNameOfImageContainer imageName [-d detached mode, -p configured port]
docker ps  --List down the running containers
docker exec -it imageName sh    --connects with the image shell [Redis shell in our case]
redis-cli
```

# Components
1. Redis Server
2. Client

# Supported data types 
1. String
2. List
3. Set
4. Hash
5. Set
6. Sorted Set
7. Bit map
8. Stream
9. Geo

# String commands
```Redis
SET name "Shivam Kumar"      -- used to make an entry of string with Key- name & Value- "Shivam Kumar"
GET name                     -- Retuns "Shivam Kumar"
SET counter 0                -- As integer is not supported, the value will be saved as String
GET counter                  -- Returns "0"
INCR counter                 -- It will increase the value by 1
DECR counter                 -- It will decrease the value by 1
INCRBY counter 4             -- Increases the value of counter by 4, so new value of counter will be 5
DECRBY counter 2             -- Increases the value of counter by 3, so new value of counter will be 5
APPEND name Gupta            -- Appends Gupta to the existing value of key "name"
STRLEN name                  -- Returns length of value of key "name"
GETRANGE name 2 6            -- Returns the character from index 2 to 6 of key name  
```

# HashMap
1. HGET- Getting values from Map using key
2. HSET- Setting key value pair 
3. HMSET- Setting multiple key value pairs
4. HMGET- Getting multiple key values

5. # HashMap commands
```Redis
SET charFreqMap "a" "5" "b" "3" "c" "7"              -- Stores the data like- Key a value 5
HGETALL charFreqMap                                  -- Retrieves all the key and value entries in charFreqMap
HGET charFreqMap "a"                                 -- Retrives value of key "a" -> 5
HMGET charFreqMap "a" "c"                            -- Retrives values of key "a" "c" -> 5 7
HMSET charFreqMap "d" "9" "e" "1"                    -- Set the values to charFreqMap         
```
# List
1. LPUSH     -- Adds the element in left corner of the list, the very first pushed element will appear at the last of the list.
2. RPUSH     -- Adds the element in right corner of the list, the insertion order remains same.
3. LPOP      -- Removes the element from begining / left it can have another optional arg.
4. RPOP      -- Removes the element from end / right it can have another optional arg.
5. LRANGE    -- Retrives the list between a range, 0 -1 is used to show all items.

10. # List commands
```Redis
LPUSH books "maths" "chemistry" "physics"            -- Stores the data like- ["physics", "chemistry", "maths"]
LPOP books                                           -- Removes the left most element "Physics"
RPUSH books "physics"                                -- data like- ["chemistry", "maths", "physics"]
RPOP books 2                                         -- Removes the right most 2 elements "Physics", "maths"
LRANGE books 0 -1                                    -- Retrives all items from the list
LRANGE books 2 4                                     -- Retrives items from the index 2 till 4     
```

# Sets
Stores the unique values, insertion order is not preserved.
1. SADD       -- Adds the element in set.
2. SMEMBERS   -- List down the elements stored in list. 
3. SREM       -- Removes the element from list.

10. # Set commands
```Redis
SADD books "maths" "chemistry" "physics"            -- Stores the data
SADD books "chemistry"                              -- Nothing happens as "chemistry is already in set"
SMEMBERS books                                      -- Retrives the data stored in the list
SREM books "chemistry"                              -- Removes the element "chemistry" from the set.  
```

# Sorted Sets
Stores the unique values, .
1. ZADD       -- Adds the element in set in default sorting order.
2. ZRANGE     -- List down the elements stored in list from initial index to final index. 
3. ZREV       -- List down the elements stored in list from initial index to final index on reverse order.
4. ZINCR      -- Increase the value by the specified increment

10. # Sorted Set commands
```Redis
ZADD books 10 "maths" 5 "chemistry" 7 "physics"      -- Stores the data like ["chemistry", "physics", "maths"]
ZADD books 50 "english"                              -- add in sorted order into the set- ["chemistry", "physics", "maths", english]
ZADD books 20 "hindi"                                -- add in sorted order into the set- ["chemistry", "physics", "maths", hindi, english]
ZRANGE books 0 -1                                    -- Retrives all the data stored in the sorted set
ZRANGE books 2 4                                     -- Retrives the data stored in the sorted set from index 2 to 4
ZINCRBY books 10 "english"                           -- add 10 to the count of english - 60.  
```
