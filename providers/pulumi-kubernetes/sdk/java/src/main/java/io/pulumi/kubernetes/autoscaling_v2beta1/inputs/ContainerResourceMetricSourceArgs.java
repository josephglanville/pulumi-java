// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
 * 
 */
public final class ContainerResourceMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourceMetricSourceArgs Empty = new ContainerResourceMetricSourceArgs();

    /**
     * container is the name of the container in the pods of the scaling target
     * 
     */
    @Import(name="container", required=true)
      private final Output<String> container;

    public Output<String> getContainer() {
        return this.container;
    }

    /**
     * name is the name of the resource in question.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    @Import(name="targetAverageUtilization")
      private final @Nullable Output<Integer> targetAverageUtilization;

    public Output<Integer> getTargetAverageUtilization() {
        return this.targetAverageUtilization == null ? Output.empty() : this.targetAverageUtilization;
    }

    /**
     * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
     * 
     */
    @Import(name="targetAverageValue")
      private final @Nullable Output<String> targetAverageValue;

    public Output<String> getTargetAverageValue() {
        return this.targetAverageValue == null ? Output.empty() : this.targetAverageValue;
    }

    public ContainerResourceMetricSourceArgs(
        Output<String> container,
        Output<String> name,
        @Nullable Output<Integer> targetAverageUtilization,
        @Nullable Output<String> targetAverageValue) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.targetAverageUtilization = targetAverageUtilization;
        this.targetAverageValue = targetAverageValue;
    }

    private ContainerResourceMetricSourceArgs() {
        this.container = Output.empty();
        this.name = Output.empty();
        this.targetAverageUtilization = Output.empty();
        this.targetAverageValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> container;
        private Output<String> name;
        private @Nullable Output<Integer> targetAverageUtilization;
        private @Nullable Output<String> targetAverageValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.name = defaults.name;
    	      this.targetAverageUtilization = defaults.targetAverageUtilization;
    	      this.targetAverageValue = defaults.targetAverageValue;
        }

        public Builder container(Output<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder container(String container) {
            this.container = Output.of(Objects.requireNonNull(container));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder targetAverageUtilization(@Nullable Output<Integer> targetAverageUtilization) {
            this.targetAverageUtilization = targetAverageUtilization;
            return this;
        }
        public Builder targetAverageUtilization(@Nullable Integer targetAverageUtilization) {
            this.targetAverageUtilization = Output.ofNullable(targetAverageUtilization);
            return this;
        }
        public Builder targetAverageValue(@Nullable Output<String> targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }
        public Builder targetAverageValue(@Nullable String targetAverageValue) {
            this.targetAverageValue = Output.ofNullable(targetAverageValue);
            return this;
        }        public ContainerResourceMetricSourceArgs build() {
            return new ContainerResourceMetricSourceArgs(container, name, targetAverageUtilization, targetAverageValue);
        }
    }
}
