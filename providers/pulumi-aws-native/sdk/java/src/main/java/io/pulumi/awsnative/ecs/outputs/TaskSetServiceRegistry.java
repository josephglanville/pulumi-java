// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskSetServiceRegistry {
    /**
     * The container name value, already specified in the task definition, to be used for your service discovery service. If the task definition that your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition that your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
     * 
     */
    private final @Nullable String containerName;
    /**
     * The port value, already specified in the task definition, to be used for your service discovery service. If the task definition your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
     * 
     */
    private final @Nullable Integer containerPort;
    /**
     * The port value used if your service discovery service specified an SRV record. This field may be used if both the awsvpc network mode and SRV records are used.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud Map. For more information, see https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html
     * 
     */
    private final @Nullable String registryArn;

    @CustomType.Constructor
    private TaskSetServiceRegistry(
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("containerPort") @Nullable Integer containerPort,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("registryArn") @Nullable String registryArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.port = port;
        this.registryArn = registryArn;
    }

    /**
     * The container name value, already specified in the task definition, to be used for your service discovery service. If the task definition that your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition that your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
     * 
    */
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * The port value, already specified in the task definition, to be used for your service discovery service. If the task definition your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
     * 
    */
    public Optional<Integer> getContainerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    /**
     * The port value used if your service discovery service specified an SRV record. This field may be used if both the awsvpc network mode and SRV records are used.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud Map. For more information, see https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html
     * 
    */
    public Optional<String> getRegistryArn() {
        return Optional.ofNullable(this.registryArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetServiceRegistry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable Integer containerPort;
        private @Nullable Integer port;
        private @Nullable String registryArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetServiceRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.port = defaults.port;
    	      this.registryArn = defaults.registryArn;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder registryArn(@Nullable String registryArn) {
            this.registryArn = registryArn;
            return this;
        }        public TaskSetServiceRegistry build() {
            return new TaskSetServiceRegistry(containerName, containerPort, port, registryArn);
        }
    }
}
