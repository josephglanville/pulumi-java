// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionPortMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionPortMappingArgs Empty = new TaskDefinitionPortMappingArgs();

    @InputImport(name="containerPort")
      private final @Nullable Output<Integer> containerPort;

    public Output<Integer> getContainerPort() {
        return this.containerPort == null ? Output.empty() : this.containerPort;
    }

    @InputImport(name="hostPort")
      private final @Nullable Output<Integer> hostPort;

    public Output<Integer> getHostPort() {
        return this.hostPort == null ? Output.empty() : this.hostPort;
    }

    @InputImport(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public TaskDefinitionPortMappingArgs(
        @Nullable Output<Integer> containerPort,
        @Nullable Output<Integer> hostPort,
        @Nullable Output<String> protocol) {
        this.containerPort = containerPort;
        this.hostPort = hostPort;
        this.protocol = protocol;
    }

    private TaskDefinitionPortMappingArgs() {
        this.containerPort = Output.empty();
        this.hostPort = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionPortMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> containerPort;
        private @Nullable Output<Integer> hostPort;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionPortMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostPort = defaults.hostPort;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = Output.ofNullable(containerPort);
            return this;
        }

        public Builder hostPort(@Nullable Output<Integer> hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder hostPort(@Nullable Integer hostPort) {
            this.hostPort = Output.ofNullable(hostPort);
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }
        public TaskDefinitionPortMappingArgs build() {
            return new TaskDefinitionPortMappingArgs(containerPort, hostPort, protocol);
        }
    }
}
