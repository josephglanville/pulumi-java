// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupImmunityTimeProperty;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupCaptchaConfig {
    private final @Nullable RuleGroupImmunityTimeProperty immunityTimeProperty;

    @CustomType.Constructor
    private RuleGroupCaptchaConfig(@CustomType.Parameter("immunityTimeProperty") @Nullable RuleGroupImmunityTimeProperty immunityTimeProperty) {
        this.immunityTimeProperty = immunityTimeProperty;
    }

    public Optional<RuleGroupImmunityTimeProperty> getImmunityTimeProperty() {
        return Optional.ofNullable(this.immunityTimeProperty);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCaptchaConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupImmunityTimeProperty immunityTimeProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCaptchaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTimeProperty = defaults.immunityTimeProperty;
        }

        public Builder immunityTimeProperty(@Nullable RuleGroupImmunityTimeProperty immunityTimeProperty) {
            this.immunityTimeProperty = immunityTimeProperty;
            return this;
        }        public RuleGroupCaptchaConfig build() {
            return new RuleGroupCaptchaConfig(immunityTimeProperty);
        }
    }
}
