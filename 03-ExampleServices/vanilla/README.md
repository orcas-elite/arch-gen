## Vanilla Generated Services

The services in this folder are generated services by the meta model generator but are not instrumented with any monitoring tools.

### Preparation and Startup

To directly run them in Docker without rebuilding the applications, just run:
```bash
docker-compose up
```
in the folder where the `docker-compose.yml` file is located.

In case the application should be rebuilt using maven, run:
```bash
./build-and-run.sh
```
This will trigger a rebuild using maven and also automatically runs the `docker-compose up` command.

### Usage

After all services have started up properly, the `portal` service can be reached at port `8080`:
* http://localhost:8080/
* http://localhost:8080/login
* http://localhost:8080/order
