# Redis Cache

Redis is a popular, open-source, in-memory data structure store that is often used as a caching system. It functions as a key-value store, allowing for fast storage and retrieval of data. Because it stores data in memory, Redis offers very low latency, making it ideal for applications requiring quick access to frequently used information.

# Benefits
1. Enhances the system performance and scalability of the application.
2. Stores the data temporarily as cache to reduce the access time and the load on the backend system.
3. Handles very large number of read write effectively, acts very fast.
4. Suitable for high scale applications.
5. Persistent Redis can be configured to persist data to disk, providing a balance between speed and durability.



## Installation

To Install latest Redis on docker, follow the command

```bash
Docker pull redis
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

## Usage

```python
import foobar

# returns 'words'
foobar.pluralize('word')

# returns 'geese'
foobar.pluralize('goose')

# returns 'phenomenon'
foobar.singularize('phenomena')
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
