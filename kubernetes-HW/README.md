# SPRING BOOT + MONGODB + KUBERNETES
in Googe Cloud

For deploy:

kubectl apply -f kubernetes

http://34.102.246.161/

[
  {
    "id": "1",
    "organizationId": 1,
    "departmentId": 1,
    "name": "Julia",
    "age": 39,
    "position": "devops"
  },
  {
    "id": "2",
    "organizationId": 1,
    "departmentId": 1,
    "name": "Ivan",
    "age": 18,
    "position": "dev"
  }
]

http://34.102.246.161/department/1
                                    
[{"id":"1","organizationId":1,"departmentId":1,"name":"Julia","age":39,"position":"devops"},{"id":"2","organizationId":1,"departmentId":1,"name":"Ivan","age":18,"position":"dev"}]


http://34.102.246.161/organization/1

[
  {
    "id": "1",
    "organizationId": 1,
    "departmentId": 1,
    "name": "Julia",
    "age": 39,
    "position": "devops"
  },
  {
    "id": "2",
    "organizationId": 1,
    "departmentId": 1,
    "name": "Ivan",
    "age": 18,
    "position": "dev"
  }
]


С помощью перенаправления порта можно со своей машины подключиться на 

 gcloud container clusters get-credentials cluster-1 --zone europe-west1-b --project canvas-genius-278220 \
 && kubectl port-forward $(kubectl get pod --selector="app=employee" --output jsonpath='{.items[0].metadata.name}') 8080:8080