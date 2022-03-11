// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.SELinuxOptionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use SELinuxStrategyOptions from policy API Group instead.
 * 
 */
public final class SELinuxStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SELinuxStrategyOptionsArgs Empty = new SELinuxStrategyOptionsArgs();

    /**
     * rule is the strategy that will dictate the allowable labels that may be set.
     * 
     */
    @InputImport(name="rule", required=true)
      private final Output<String> rule;

    public Output<String> getRule() {
        return this.rule;
    }

    /**
     * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @InputImport(name="seLinuxOptions")
      private final @Nullable Output<SELinuxOptionsArgs> seLinuxOptions;

    public Output<SELinuxOptionsArgs> getSeLinuxOptions() {
        return this.seLinuxOptions == null ? Output.empty() : this.seLinuxOptions;
    }

    public SELinuxStrategyOptionsArgs(
        Output<String> rule,
        @Nullable Output<SELinuxOptionsArgs> seLinuxOptions) {
        this.rule = Objects.requireNonNull(rule, "expected parameter 'rule' to be non-null");
        this.seLinuxOptions = seLinuxOptions;
    }

    private SELinuxStrategyOptionsArgs() {
        this.rule = Output.empty();
        this.seLinuxOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SELinuxStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> rule;
        private @Nullable Output<SELinuxOptionsArgs> seLinuxOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SELinuxStrategyOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
        }

        public Builder rule(Output<String> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder rule(String rule) {
            this.rule = Output.of(Objects.requireNonNull(rule));
            return this;
        }

        public Builder seLinuxOptions(@Nullable Output<SELinuxOptionsArgs> seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        public Builder seLinuxOptions(@Nullable SELinuxOptionsArgs seLinuxOptions) {
            this.seLinuxOptions = Output.ofNullable(seLinuxOptions);
            return this;
        }
        public SELinuxStrategyOptionsArgs build() {
            return new SELinuxStrategyOptionsArgs(rule, seLinuxOptions);
        }
    }
}
