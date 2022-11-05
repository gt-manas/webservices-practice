# webservices-practice
docker build -t ranjanmanas/webapi-ms .
docker push ranjanmanas/webapi-ms


docker build -t ranjanmanas/order-ms .
docker push ranjanmanas/order-ms

----------------

Install kubectl:

curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl

kube config:-
cp kubeconfig.yaml .kube/config

-----------------
