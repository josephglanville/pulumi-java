// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.O365BreakOutCategoryPoliciesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Office365 breakout policy.
 * 
 */
public final class O365PolicyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final O365PolicyPropertiesArgs Empty = new O365PolicyPropertiesArgs();

    /**
     * Office365 breakout categories.
     * 
     */
    @Import(name="breakOutCategories")
      private final @Nullable Output<O365BreakOutCategoryPoliciesArgs> breakOutCategories;

    public Output<O365BreakOutCategoryPoliciesArgs> getBreakOutCategories() {
        return this.breakOutCategories == null ? Output.empty() : this.breakOutCategories;
    }

    public O365PolicyPropertiesArgs(@Nullable Output<O365BreakOutCategoryPoliciesArgs> breakOutCategories) {
        this.breakOutCategories = breakOutCategories;
    }

    private O365PolicyPropertiesArgs() {
        this.breakOutCategories = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(O365PolicyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<O365BreakOutCategoryPoliciesArgs> breakOutCategories;

        public Builder() {
    	      // Empty
        }

        public Builder(O365PolicyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.breakOutCategories = defaults.breakOutCategories;
        }

        public Builder breakOutCategories(@Nullable Output<O365BreakOutCategoryPoliciesArgs> breakOutCategories) {
            this.breakOutCategories = breakOutCategories;
            return this;
        }
        public Builder breakOutCategories(@Nullable O365BreakOutCategoryPoliciesArgs breakOutCategories) {
            this.breakOutCategories = Output.ofNullable(breakOutCategories);
            return this;
        }        public O365PolicyPropertiesArgs build() {
            return new O365PolicyPropertiesArgs(breakOutCategories);
        }
    }
}
