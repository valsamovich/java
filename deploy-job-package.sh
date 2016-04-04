#!/usr/bin/env bash

# deploy job package for testing
deploy_hob_package(){
    scp -p target/*.tar.gz HUE:
}

deploy_hob_package