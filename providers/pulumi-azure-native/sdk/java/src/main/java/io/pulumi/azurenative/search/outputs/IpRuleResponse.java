// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IpRuleResponse {
    private final @Nullable String value;

    @OutputCustomType.Constructor({"value"})
    private IpRuleResponse(@Nullable String value) {
        this.value = value;
    }

    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public IpRuleResponse build() {
            return new IpRuleResponse(value);
        }
    }
}
