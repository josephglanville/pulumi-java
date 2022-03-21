// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarArgs Empty = new AutoscalarArgs();

    /**
     * The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * 
     */
    @Import(name="autoscalingPolicy", required=true)
      private final Output<AutoscalarAutoscalingPolicyArgs> autoscalingPolicy;

    public Output<AutoscalarAutoscalingPolicyArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target", required=true)
      private final Output<String> target;

    public Output<String> getTarget() {
        return this.target;
    }

    /**
     * URL of the zone where the instance group resides.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public AutoscalarArgs(
        Output<AutoscalarAutoscalingPolicyArgs> autoscalingPolicy,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> target,
        @Nullable Output<String> zone) {
        this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy, "expected parameter 'autoscalingPolicy' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
        this.zone = zone;
    }

    private AutoscalarArgs() {
        this.autoscalingPolicy = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.target = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AutoscalarAutoscalingPolicyArgs> autoscalingPolicy;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> target;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.target = defaults.target;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingPolicy(Output<AutoscalarAutoscalingPolicyArgs> autoscalingPolicy) {
            this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy);
            return this;
        }
        public Builder autoscalingPolicy(AutoscalarAutoscalingPolicyArgs autoscalingPolicy) {
            this.autoscalingPolicy = Output.of(Objects.requireNonNull(autoscalingPolicy));
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
        public Builder target(Output<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(String target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }        public AutoscalarArgs build() {
            return new AutoscalarArgs(autoscalingPolicy, description, name, project, target, zone);
        }
    }
}
