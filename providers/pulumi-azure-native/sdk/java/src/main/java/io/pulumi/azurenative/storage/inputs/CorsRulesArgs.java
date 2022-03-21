// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.CorsRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sets the CORS rules. You can include up to five CorsRule elements in the request.
 * 
 */
public final class CorsRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CorsRulesArgs Empty = new CorsRulesArgs();

    /**
     * The List of CORS rules. You can include up to five CorsRule elements in the request.
     * 
     */
    @Import(name="corsRules")
      private final @Nullable Output<List<CorsRuleArgs>> corsRules;

    public Output<List<CorsRuleArgs>> getCorsRules() {
        return this.corsRules == null ? Output.empty() : this.corsRules;
    }

    public CorsRulesArgs(@Nullable Output<List<CorsRuleArgs>> corsRules) {
        this.corsRules = corsRules;
    }

    private CorsRulesArgs() {
        this.corsRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CorsRuleArgs>> corsRules;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsRules = defaults.corsRules;
        }

        public Builder corsRules(@Nullable Output<List<CorsRuleArgs>> corsRules) {
            this.corsRules = corsRules;
            return this;
        }
        public Builder corsRules(@Nullable List<CorsRuleArgs> corsRules) {
            this.corsRules = Output.ofNullable(corsRules);
            return this;
        }
        public Builder corsRules(CorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }        public CorsRulesArgs build() {
            return new CorsRulesArgs(corsRules);
        }
    }
}
