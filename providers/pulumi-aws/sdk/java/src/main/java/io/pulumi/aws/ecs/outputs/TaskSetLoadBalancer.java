// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskSetLoadBalancer {
    /**
     * The name of the container to associate with the load balancer (as it appears in a container definition).
     * 
     */
    private final String containerName;
    /**
     * The port on the container to associate with the load balancer. Defaults to `0` if not specified.
     * 
     */
    private final @Nullable Integer containerPort;
    /**
     * The name of the ELB (Classic) to associate with the service.
     * 
     */
    private final @Nullable String loadBalancerName;
    /**
     * The ARN of the Load Balancer target group to associate with the service.
     * 
     */
    private final @Nullable String targetGroupArn;

    @OutputCustomType.Constructor
    private TaskSetLoadBalancer(
        @OutputCustomType.Parameter("containerName") String containerName,
        @OutputCustomType.Parameter("containerPort") @Nullable Integer containerPort,
        @OutputCustomType.Parameter("loadBalancerName") @Nullable String loadBalancerName,
        @OutputCustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.loadBalancerName = loadBalancerName;
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * The name of the container to associate with the load balancer (as it appears in a container definition).
     * 
    */
    public String getContainerName() {
        return this.containerName;
    }
    /**
     * The port on the container to associate with the load balancer. Defaults to `0` if not specified.
     * 
    */
    public Optional<Integer> getContainerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    /**
     * The name of the ELB (Classic) to associate with the service.
     * 
    */
    public Optional<String> getLoadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }
    /**
     * The ARN of the Load Balancer target group to associate with the service.
     * 
    */
    public Optional<String> getTargetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetLoadBalancer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private @Nullable Integer containerPort;
        private @Nullable String loadBalancerName;
        private @Nullable String targetGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setLoadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder setTargetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public TaskSetLoadBalancer build() {
            return new TaskSetLoadBalancer(containerName, containerPort, loadBalancerName, targetGroupArn);
        }
    }
}
