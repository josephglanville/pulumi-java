// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ContainerResourceMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ExternalMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ObjectMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.PodsMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ResourceMetricSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricSpec {
    private final @Nullable ContainerResourceMetricSource containerResource;
    private final @Nullable ExternalMetricSource external;
    private final @Nullable ObjectMetricSource object;
    private final @Nullable PodsMetricSource pods;
    private final @Nullable ResourceMetricSource resource;
    private final String type;

    @OutputCustomType.Constructor({"containerResource","external","object","pods","resource","type"})
    private MetricSpec(
        @Nullable ContainerResourceMetricSource containerResource,
        @Nullable ExternalMetricSource external,
        @Nullable ObjectMetricSource object,
        @Nullable PodsMetricSource pods,
        @Nullable ResourceMetricSource resource,
        String type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<ContainerResourceMetricSource> getContainerResource() {
        return Optional.ofNullable(this.containerResource);
    }
    public Optional<ExternalMetricSource> getExternal() {
        return Optional.ofNullable(this.external);
    }
    public Optional<ObjectMetricSource> getObject() {
        return Optional.ofNullable(this.object);
    }
    public Optional<PodsMetricSource> getPods() {
        return Optional.ofNullable(this.pods);
    }
    public Optional<ResourceMetricSource> getResource() {
        return Optional.ofNullable(this.resource);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerResourceMetricSource containerResource;
        private @Nullable ExternalMetricSource external;
        private @Nullable ObjectMetricSource object;
        private @Nullable PodsMetricSource pods;
        private @Nullable ResourceMetricSource resource;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder setContainerResource(@Nullable ContainerResourceMetricSource containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        public Builder setExternal(@Nullable ExternalMetricSource external) {
            this.external = external;
            return this;
        }

        public Builder setObject(@Nullable ObjectMetricSource object) {
            this.object = object;
            return this;
        }

        public Builder setPods(@Nullable PodsMetricSource pods) {
            this.pods = pods;
            return this;
        }

        public Builder setResource(@Nullable ResourceMetricSource resource) {
            this.resource = resource;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public MetricSpec build() {
            return new MetricSpec(containerResource, external, object, pods, resource, type);
        }
    }
}
