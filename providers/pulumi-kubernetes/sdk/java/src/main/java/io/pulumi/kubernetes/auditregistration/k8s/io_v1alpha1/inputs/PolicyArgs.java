// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Policy defines the configuration of how audit events are logged
 * 
 */
public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    @InputImport(name="level", required=true)
      private final Output<String> level;

    public Output<String> getLevel() {
        return this.level;
    }

    /**
     * Stages is a list of stages for which events are created.
     * 
     */
    @InputImport(name="stages")
      private final @Nullable Output<List<String>> stages;

    public Output<List<String>> getStages() {
        return this.stages == null ? Output.empty() : this.stages;
    }

    public PolicyArgs(
        Output<String> level,
        @Nullable Output<List<String>> stages) {
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.stages = stages;
    }

    private PolicyArgs() {
        this.level = Output.empty();
        this.stages = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> level;
        private @Nullable Output<List<String>> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.stages = defaults.stages;
        }

        public Builder level(Output<String> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder level(String level) {
            this.level = Output.of(Objects.requireNonNull(level));
            return this;
        }

        public Builder stages(@Nullable Output<List<String>> stages) {
            this.stages = stages;
            return this;
        }

        public Builder stages(@Nullable List<String> stages) {
            this.stages = Output.ofNullable(stages);
            return this;
        }
        public PolicyArgs build() {
            return new PolicyArgs(level, stages);
        }
    }
}
