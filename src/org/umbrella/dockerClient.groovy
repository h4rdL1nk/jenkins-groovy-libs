#!/usr/bin/env groovy

package org.umbrella

import de.gesellix.docker.client.DockerClientImpl
import de.gesellix.docker.client.DockerAsyncCallback

class dockerClient {

    def getInfo(){

        def dockerClient = new DockerClientImpl("unix:///var/run/docker.sock")
        def info = dockerClient.info().content

        return info
        
    }

}