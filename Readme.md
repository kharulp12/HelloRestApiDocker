To run docker you need to have your built jar under target directory

1. Build image -> docker build --tag name:major.minor
example >> docker build --tag helloapi:0.1

2. Verify docker image is built by running >> docker image

3. Start container. docker run --name run1 helloapi:0.1

4. Verify docker container is running. >> docker ps

5. Verify if rest api stated usin curl command. curl --get http://localhost:<port from ps>/api/hello/aakash
Note : If you are running in docker toolbox then it runs under VM and it has its own dedicated IP. localhost won't work in that case.
To find IP of docker VM run >> docker-machine ip
and then run >> curl --get http://<ip from above command>:<port from ps command>/api/hello/aakash
