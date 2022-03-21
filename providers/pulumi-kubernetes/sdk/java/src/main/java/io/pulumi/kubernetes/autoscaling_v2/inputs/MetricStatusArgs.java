// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.autoscaling_v2.inputs.ContainerResourceMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.ExternalMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.ObjectMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.PodsMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.ResourceMetricStatusArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetricStatus describes the last-read state of a single metric.
 * 
 */
public final class MetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStatusArgs Empty = new MetricStatusArgs();

    /**
     * container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    @Import(name="containerResource")
      private final @Nullable Output<ContainerResourceMetricStatusArgs> containerResource;

    public Output<ContainerResourceMetricStatusArgs> getContainerResource() {
        return this.containerResource == null ? Output.empty() : this.containerResource;
    }

    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    @Import(name="external")
      private final @Nullable Output<ExternalMetricStatusArgs> external;

    public Output<ExternalMetricStatusArgs> getExternal() {
        return this.external == null ? Output.empty() : this.external;
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    @Import(name="object")
      private final @Nullable Output<ObjectMetricStatusArgs> object;

    public Output<ObjectMetricStatusArgs> getObject() {
        return this.object == null ? Output.empty() : this.object;
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    @Import(name="pods")
      private final @Nullable Output<PodsMetricStatusArgs> pods;

    public Output<PodsMetricStatusArgs> getPods() {
        return this.pods == null ? Output.empty() : this.pods;
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    @Import(name="resource")
      private final @Nullable Output<ResourceMetricStatusArgs> resource;

    public Output<ResourceMetricStatusArgs> getResource() {
        return this.resource == null ? Output.empty() : this.resource;
    }

    /**
     * type is the type of metric source.  It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public MetricStatusArgs(
        @Nullable Output<ContainerResourceMetricStatusArgs> containerResource,
        @Nullable Output<ExternalMetricStatusArgs> external,
        @Nullable Output<ObjectMetricStatusArgs> object,
        @Nullable Output<PodsMetricStatusArgs> pods,
        @Nullable Output<ResourceMetricStatusArgs> resource,
        Output<String> type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MetricStatusArgs() {
        this.containerResource = Output.empty();
        this.external = Output.empty();
        this.object = Output.empty();
        this.pods = Output.empty();
        this.resource = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContainerResourceMetricStatusArgs> containerResource;
        private @Nullable Output<ExternalMetricStatusArgs> external;
        private @Nullable Output<ObjectMetricStatusArgs> object;
        private @Nullable Output<PodsMetricStatusArgs> pods;
        private @Nullable Output<ResourceMetricStatusArgs> resource;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder containerResource(@Nullable Output<ContainerResourceMetricStatusArgs> containerResource) {
            this.containerResource = containerResource;
            return this;
        }
        public Builder containerResource(@Nullable ContainerResourceMetricStatusArgs containerResource) {
            this.containerResource = Output.ofNullable(containerResource);
            return this;
        }
        public Builder external(@Nullable Output<ExternalMetricStatusArgs> external) {
            this.external = external;
            return this;
        }
        public Builder external(@Nullable ExternalMetricStatusArgs external) {
            this.external = Output.ofNullable(external);
            return this;
        }
        public Builder object(@Nullable Output<ObjectMetricStatusArgs> object) {
            this.object = object;
            return this;
        }
        public Builder object(@Nullable ObjectMetricStatusArgs object) {
            this.object = Output.ofNullable(object);
            return this;
        }
        public Builder pods(@Nullable Output<PodsMetricStatusArgs> pods) {
            this.pods = pods;
            return this;
        }
        public Builder pods(@Nullable PodsMetricStatusArgs pods) {
            this.pods = Output.ofNullable(pods);
            return this;
        }
        public Builder resource(@Nullable Output<ResourceMetricStatusArgs> resource) {
            this.resource = resource;
            return this;
        }
        public Builder resource(@Nullable ResourceMetricStatusArgs resource) {
            this.resource = Output.ofNullable(resource);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public MetricStatusArgs build() {
            return new MetricStatusArgs(containerResource, external, object, pods, resource, type);
        }
    }
}
