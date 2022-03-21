// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Target scope for a given action rule. By default scope will be the subscription. User can also provide list of resource groups or list of resources from the scope subscription as well.
 * 
 */
public final class ScopeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScopeResponse Empty = new ScopeResponse();

    /**
     * type of target scope
     * 
     */
    @Import(name="scopeType")
      private final @Nullable String scopeType;

    public Optional<String> getScopeType() {
        return this.scopeType == null ? Optional.empty() : Optional.ofNullable(this.scopeType);
    }

    /**
     * list of ARM IDs of the given scope type which will be the target of the given action rule.
     * 
     */
    @Import(name="values")
      private final @Nullable List<String> values;

    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public ScopeResponse(
        @Nullable String scopeType,
        @Nullable List<String> values) {
        this.scopeType = scopeType;
        this.values = values;
    }

    private ScopeResponse() {
        this.scopeType = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String scopeType;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scopeType = defaults.scopeType;
    	      this.values = defaults.values;
        }

        public Builder scopeType(@Nullable String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ScopeResponse build() {
            return new ScopeResponse(scopeType, values);
        }
    }
}
