// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyListPolicyDeny {
    /**
     * The policy allows or denies all values.
     * 
     */
    private final @Nullable Boolean all;
    /**
     * The policy can define specific values that are allowed or denied.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private PolicyListPolicyDeny(
        @CustomType.Parameter("all") @Nullable Boolean all,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.all = all;
        this.values = values;
    }

    /**
     * The policy allows or denies all values.
     * 
    */
    public Optional<Boolean> getAll() {
        return Optional.ofNullable(this.all);
    }
    /**
     * The policy can define specific values that are allowed or denied.
     * 
    */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyListPolicyDeny defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean all;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyListPolicyDeny defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.values = defaults.values;
        }

        public Builder all(@Nullable Boolean all) {
            this.all = all;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public PolicyListPolicyDeny build() {
            return new PolicyListPolicyDeny(all, values);
        }
    }
}
