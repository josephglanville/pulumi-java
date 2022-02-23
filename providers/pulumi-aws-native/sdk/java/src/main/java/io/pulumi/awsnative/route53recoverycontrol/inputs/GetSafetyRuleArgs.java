// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSafetyRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSafetyRuleArgs Empty = new GetSafetyRuleArgs();

    /**
     * The Amazon Resource Name (ARN) of the safety rule.
     * 
     */
    @InputImport(name="safetyRuleArn", required=true)
      private final String safetyRuleArn;

    public String getSafetyRuleArn() {
        return this.safetyRuleArn;
    }

    public GetSafetyRuleArgs(String safetyRuleArn) {
        this.safetyRuleArn = Objects.requireNonNull(safetyRuleArn, "expected parameter 'safetyRuleArn' to be non-null");
    }

    private GetSafetyRuleArgs() {
        this.safetyRuleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSafetyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String safetyRuleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSafetyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.safetyRuleArn = defaults.safetyRuleArn;
        }

        public Builder setSafetyRuleArn(String safetyRuleArn) {
            this.safetyRuleArn = Objects.requireNonNull(safetyRuleArn);
            return this;
        }
        public GetSafetyRuleArgs build() {
            return new GetSafetyRuleArgs(safetyRuleArn);
        }
    }
}
