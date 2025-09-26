#!/bin/bash
BASE_URL="http://localhost:8080/api/users"

echo "1. 创建用户"
curl -X POST "$BASE_URL" \
     -H "Content-Type: application/json;charset=utf-8" \
     -d '{"username":"user1","password":"123456","nickname":"测试用户001","email":"user1@example.com","phone":"18800000001"}'
echo -e "\n"

