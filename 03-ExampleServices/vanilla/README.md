## Vanilla Generated Services

The services in this folder are generated services by the meta model generator but are not instrumented with any monitoring tools.

To directly run them without rebuilding the applications, just run:
`docker-compose up`
in the folder where the `docker-compose.yml` file is located.

In case the application should be rebuilt using maven, run:
`./build-and-run.sh`
This will trigger a rebuild using maven and also automatically runs the `docker-compose up` command.
