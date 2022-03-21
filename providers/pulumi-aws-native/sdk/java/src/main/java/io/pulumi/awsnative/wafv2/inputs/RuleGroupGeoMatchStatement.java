// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupForwardedIPConfiguration;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupGeoMatchStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupGeoMatchStatement Empty = new RuleGroupGeoMatchStatement();

    @Import(name="countryCodes")
      private final @Nullable List<String> countryCodes;

    public List<String> getCountryCodes() {
        return this.countryCodes == null ? List.of() : this.countryCodes;
    }

    @Import(name="forwardedIPConfig")
      private final @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig;

    public Optional<RuleGroupForwardedIPConfiguration> getForwardedIPConfig() {
        return this.forwardedIPConfig == null ? Optional.empty() : Optional.ofNullable(this.forwardedIPConfig);
    }

    public RuleGroupGeoMatchStatement(
        @Nullable List<String> countryCodes,
        @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig) {
        this.countryCodes = countryCodes;
        this.forwardedIPConfig = forwardedIPConfig;
    }

    private RuleGroupGeoMatchStatement() {
        this.countryCodes = List.of();
        this.forwardedIPConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupGeoMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> countryCodes;
        private @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupGeoMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
        }

        public Builder countryCodes(@Nullable List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }
        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }
        public Builder forwardedIPConfig(@Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }        public RuleGroupGeoMatchStatement build() {
            return new RuleGroupGeoMatchStatement(countryCodes, forwardedIPConfig);
        }
    }
}
