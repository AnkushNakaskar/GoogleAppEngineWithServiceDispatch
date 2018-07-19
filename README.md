# GoogleAppEngineWithServiceDispatch
This project is app engine project with service name and version without new version as default traffic and dispatch file for routing
To deploy application without making new version as default version to take all trafic
add follow commond.
gcloud app deploy --version=v1 --no-promote
----If ypu dont provide no-promote ,the new version with be the mail traffic taker.

--To add routing file like move all work service to testservice instance mention on app engine,follow below commond.
gcloud app deploy dispatch.yaml
