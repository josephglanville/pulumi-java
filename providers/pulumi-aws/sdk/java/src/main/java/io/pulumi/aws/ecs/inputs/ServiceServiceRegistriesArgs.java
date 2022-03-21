// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceServiceRegistriesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceServiceRegistriesArgs Empty = new ServiceServiceRegistriesArgs();

    /**
     * Container name value, already specified in the task definition, to be used for your service discovery service.
     * 
     */
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> getContainerName() {
        return this.containerName == null ? Output.empty() : this.containerName;
    }

    /**
     * Port value, already specified in the task definition, to be used for your service discovery service.
     * 
     */
    @Import(name="containerPort")
      private final @Nullable Output<Integer> containerPort;

    public Output<Integer> getContainerPort() {
        return this.containerPort == null ? Output.empty() : this.containerPort;
    }

    /**
     * Port value used if your Service Discovery service specified an SRV record.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * ARN of the Service Registry. The currently supported service registry is Amazon Route 53 Auto Naming Service(`aws.servicediscovery.Service`). For more information, see [Service](https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html)
     * 
     */
    @Import(name="registryArn", required=true)
      private final Output<String> registryArn;

    public Output<String> getRegistryArn() {
        return this.registryArn;
    }

    public ServiceServiceRegistriesArgs(
        @Nullable Output<String> containerName,
        @Nullable Output<Integer> containerPort,
        @Nullable Output<Integer> port,
        Output<String> registryArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.port = port;
        this.registryArn = Objects.requireNonNull(registryArn, "expected parameter 'registryArn' to be non-null");
    }

    private ServiceServiceRegistriesArgs() {
        this.containerName = Output.empty();
        this.containerPort = Output.empty();
        this.port = Output.empty();
        this.registryArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceServiceRegistriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerName;
        private @Nullable Output<Integer> containerPort;
        private @Nullable Output<Integer> port;
        private Output<String> registryArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceServiceRegistriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.port = defaults.port;
    	      this.registryArn = defaults.registryArn;
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Output.ofNullable(containerName);
            return this;
        }
        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = Output.ofNullable(containerPort);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public Builder registryArn(Output<String> registryArn) {
            this.registryArn = Objects.requireNonNull(registryArn);
            return this;
        }
        public Builder registryArn(String registryArn) {
            this.registryArn = Output.of(Objects.requireNonNull(registryArn));
            return this;
        }        public ServiceServiceRegistriesArgs build() {
            return new ServiceServiceRegistriesArgs(containerName, containerPort, port, registryArn);
        }
    }
}
