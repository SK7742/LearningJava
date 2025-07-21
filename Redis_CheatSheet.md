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
1. GET
2. SET
