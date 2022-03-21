// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.AutoscalingPolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionAutoscalerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerArgs Empty = new RegionAutoscalerArgs();

    /**
     * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    @Import(name="autoscalingPolicy")
      private final @Nullable Output<AutoscalingPolicyArgs> autoscalingPolicy;

    public Output<AutoscalingPolicyArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Output.empty() : this.autoscalingPolicy;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Output.empty() : this.target;
    }

    public RegionAutoscalerArgs(
        @Nullable Output<AutoscalingPolicyArgs> autoscalingPolicy,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<String> target) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.description = description;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.target = target;
    }

    private RegionAutoscalerArgs() {
        this.autoscalingPolicy = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscalingPolicyArgs> autoscalingPolicy;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.target = defaults.target;
        }

        public Builder autoscalingPolicy(@Nullable Output<AutoscalingPolicyArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }
        public Builder autoscalingPolicy(@Nullable AutoscalingPolicyArgs autoscalingPolicy) {
            this.autoscalingPolicy = Output.ofNullable(autoscalingPolicy);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Output.ofNullable(target);
            return this;
        }        public RegionAutoscalerArgs build() {
            return new RegionAutoscalerArgs(autoscalingPolicy, description, name, project, region, requestId, target);
        }
    }
}
