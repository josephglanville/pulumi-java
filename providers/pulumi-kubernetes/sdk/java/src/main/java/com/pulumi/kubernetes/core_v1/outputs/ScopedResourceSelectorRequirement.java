// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ScopedResourceSelectorRequirement {
    /**
     * @return Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     */
    private final String operator;
    /**
     * @return The name of the scope that the selector applies to.
     * 
     */
    private final String scopeName;
    /**
     * @return An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private ScopedResourceSelectorRequirement(
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("scopeName") String scopeName,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.operator = operator;
        this.scopeName = scopeName;
        this.values = values;
    }

    /**
     * @return Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The name of the scope that the selector applies to.
     * 
     */
    public String scopeName() {
        return this.scopeName;
    }
    /**
     * @return An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopedResourceSelectorRequirement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operator;
        private String scopeName;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopedResourceSelectorRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.scopeName = defaults.scopeName;
    	      this.values = defaults.values;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder scopeName(String scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ScopedResourceSelectorRequirement build() {
            return new ScopedResourceSelectorRequirement(operator, scopeName, values);
        }
    }
}
