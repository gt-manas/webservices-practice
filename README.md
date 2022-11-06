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
curl -L https://istio.io/downloadIstio | sh -
cd istio-1.15.3
export PATH=$PWD/bin:$PATH
cd
istioctl install --set profile=demo -y
kubectl label namespace default istio-injection=enabled

-----------------

kubectl expose po webapi-ms --name webapi-ms-lb --port=80 --target-port=8090 --type=LoadBalancer


kubectl run my-shell --rm -i --tty --image ubuntu -- bash
apt get update
apt install curl

