// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataSourcePermission {
    /**
     * Set of IAM actions to grant or revoke permissions on. Max of 16 items.
     * 
     */
    private final List<String> actions;
    /**
     * The Amazon Resource Name (ARN) of the principal.
     * 
     */
    private final String principal;

    @CustomType.Constructor
    private DataSourcePermission(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("principal") String principal) {
        this.actions = actions;
        this.principal = principal;
    }

    /**
     * Set of IAM actions to grant or revoke permissions on. Max of 16 items.
     * 
    */
    public List<String> getActions() {
        return this.actions;
    }
    /**
     * The Amazon Resource Name (ARN) of the principal.
     * 
    */
    public String getPrincipal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourcePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourcePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.principal = defaults.principal;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }        public DataSourcePermission build() {
            return new DataSourcePermission(actions, principal);
        }
    }
}