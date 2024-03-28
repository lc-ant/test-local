* Launch RabbitMQ + MongoDB
* Launch config-server with profile native and environment:
    * CONFIG_SERVER_NATIVE_LOCATION_URI=${project_loc:test-local-parent}/config
* Launch eureka-server
* Launch test-all-services with environment:
    * INIT_SERVICE_SECRET=user:initial-service-user-secret
    * INIT_SUBJECT_TYPE_SERVICE=user:user
    * SERVICE_USER_INIT_ROOT_EMAIL=an@email.com
    * SERVICE_USER_INIT_ROOT_PASSWORD=a_password
* Launch test-api-gateway
