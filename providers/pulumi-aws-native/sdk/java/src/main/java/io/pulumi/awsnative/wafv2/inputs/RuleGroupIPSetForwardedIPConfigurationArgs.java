// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupIPSetForwardedIPConfigurationFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.RuleGroupIPSetForwardedIPConfigurationPosition;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupIPSetForwardedIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupIPSetForwardedIPConfigurationArgs Empty = new RuleGroupIPSetForwardedIPConfigurationArgs();

    @Import(name="fallbackBehavior", required=true)
      private final Output<RuleGroupIPSetForwardedIPConfigurationFallbackBehavior> fallbackBehavior;

    public Output<RuleGroupIPSetForwardedIPConfigurationFallbackBehavior> getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    @Import(name="position", required=true)
      private final Output<RuleGroupIPSetForwardedIPConfigurationPosition> position;

    public Output<RuleGroupIPSetForwardedIPConfigurationPosition> getPosition() {
        return this.position;
    }

    public RuleGroupIPSetForwardedIPConfigurationArgs(
        Output<RuleGroupIPSetForwardedIPConfigurationFallbackBehavior> fallbackBehavior,
        Output<String> headerName,
        Output<RuleGroupIPSetForwardedIPConfigurationPosition> position) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
    }

    private RuleGroupIPSetForwardedIPConfigurationArgs() {
        this.fallbackBehavior = Codegen.empty();
        this.headerName = Codegen.empty();
        this.position = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupIPSetForwardedIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupIPSetForwardedIPConfigurationFallbackBehavior> fallbackBehavior;
        private Output<String> headerName;
        private Output<RuleGroupIPSetForwardedIPConfigurationPosition> position;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupIPSetForwardedIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
    	      this.position = defaults.position;
        }

        public Builder fallbackBehavior(Output<RuleGroupIPSetForwardedIPConfigurationFallbackBehavior> fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder fallbackBehavior(RuleGroupIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Output.of(Objects.requireNonNull(fallbackBehavior));
            return this;
        }
        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }
        public Builder position(Output<RuleGroupIPSetForwardedIPConfigurationPosition> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public Builder position(RuleGroupIPSetForwardedIPConfigurationPosition position) {
            this.position = Output.of(Objects.requireNonNull(position));
            return this;
        }        public RuleGroupIPSetForwardedIPConfigurationArgs build() {
            return new RuleGroupIPSetForwardedIPConfigurationArgs(fallbackBehavior, headerName, position);
        }
    }
}
