### Required:

* installed k8s with UI (https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/)


### How to deploy:

* `docker-compose --env-file=dev.env build` - default configuration is in `.env` file

* `kubectl apply -f dev.yaml`

### Result:

* __k8s view__ - http://localhost:8001/api/v1/namespaces/kubernetes-dashboard/services/https:kubernetes-dashboard:/proxy/#/service/default/k8s-example-service?namespace=default

* A result should appear at http://localhost:32001/test
