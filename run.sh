#!/usr/bin/env bash
./mvnw clean package
docker build -t products_ms .
docker run -d -p 1302:1302 --name products_ms products_ms
