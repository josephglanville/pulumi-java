// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
 * 
 */
public final class ContainerResourceMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourceMetricStatusArgs Empty = new ContainerResourceMetricStatusArgs();

    /**
     * container is the name of the container in the pods of the scaling target
     * 
     */
    @InputImport(name="container", required=true)
      private final Input<String> container;

    public Input<String> getContainer() {
        return this.container;
    }

    /**
     * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
     * 
     */
    @InputImport(name="currentAverageUtilization")
      private final @Nullable Input<Integer> currentAverageUtilization;

    public Input<Integer> getCurrentAverageUtilization() {
        return this.currentAverageUtilization == null ? Input.empty() : this.currentAverageUtilization;
    }

    /**
     * currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type. It will always be set, regardless of the corresponding metric specification.
     * 
     */
    @InputImport(name="currentAverageValue", required=true)
      private final Input<String> currentAverageValue;

    public Input<String> getCurrentAverageValue() {
        return this.currentAverageValue;
    }

    /**
     * name is the name of the resource in question.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ContainerResourceMetricStatusArgs(
        Input<String> container,
        @Nullable Input<Integer> currentAverageUtilization,
        Input<String> currentAverageValue,
        Input<String> name) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.currentAverageUtilization = currentAverageUtilization;
        this.currentAverageValue = Objects.requireNonNull(currentAverageValue, "expected parameter 'currentAverageValue' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ContainerResourceMetricStatusArgs() {
        this.container = Input.empty();
        this.currentAverageUtilization = Input.empty();
        this.currentAverageValue = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> container;
        private @Nullable Input<Integer> currentAverageUtilization;
        private Input<String> currentAverageValue;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.currentAverageUtilization = defaults.currentAverageUtilization;
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.name = defaults.name;
        }

        public Builder setContainer(Input<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setContainer(String container) {
            this.container = Input.of(Objects.requireNonNull(container));
            return this;
        }

        public Builder setCurrentAverageUtilization(@Nullable Input<Integer> currentAverageUtilization) {
            this.currentAverageUtilization = currentAverageUtilization;
            return this;
        }

        public Builder setCurrentAverageUtilization(@Nullable Integer currentAverageUtilization) {
            this.currentAverageUtilization = Input.ofNullable(currentAverageUtilization);
            return this;
        }

        public Builder setCurrentAverageValue(Input<String> currentAverageValue) {
            this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
            return this;
        }

        public Builder setCurrentAverageValue(String currentAverageValue) {
            this.currentAverageValue = Input.of(Objects.requireNonNull(currentAverageValue));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public ContainerResourceMetricStatusArgs build() {
            return new ContainerResourceMetricStatusArgs(container, currentAverageUtilization, currentAverageValue, name);
        }
    }
}
