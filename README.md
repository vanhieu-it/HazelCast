# HazelCast
 
 ### DB mysql
``` DB mysql
CREATE TABLE persons (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
```
### Docker 
```
docker pull hazelcast/management-center
docker run --rm -p 8080:8080 hazelcast/management-center:latest
```
Khởi tạo một cluster với Member Addresses là địa chỉ mạng LAN của máy tính
http://localhost:8080/cluster-connections 
