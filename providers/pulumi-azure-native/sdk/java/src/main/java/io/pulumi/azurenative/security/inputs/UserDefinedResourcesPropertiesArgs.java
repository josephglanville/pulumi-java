// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class UserDefinedResourcesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserDefinedResourcesPropertiesArgs Empty = new UserDefinedResourcesPropertiesArgs();

    @InputImport(name="query", required=true)
    private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    @InputImport(name="querySubscriptions", required=true)
    private final Input<List<String>> querySubscriptions;

    public Input<List<String>> getQuerySubscriptions() {
        return this.querySubscriptions;
    }

    public UserDefinedResourcesPropertiesArgs(
        Input<String> query,
        Input<List<String>> querySubscriptions) {
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.querySubscriptions = Objects.requireNonNull(querySubscriptions, "expected parameter 'querySubscriptions' to be non-null");
    }

    private UserDefinedResourcesPropertiesArgs() {
        this.query = Input.empty();
        this.querySubscriptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedResourcesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> query;
        private Input<List<String>> querySubscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedResourcesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.querySubscriptions = defaults.querySubscriptions;
        }

        public Builder setQuery(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder setQuerySubscriptions(Input<List<String>> querySubscriptions) {
            this.querySubscriptions = Objects.requireNonNull(querySubscriptions);
            return this;
        }

        public Builder setQuerySubscriptions(List<String> querySubscriptions) {
            this.querySubscriptions = Input.of(Objects.requireNonNull(querySubscriptions));
            return this;
        }

        public UserDefinedResourcesPropertiesArgs build() {
            return new UserDefinedResourcesPropertiesArgs(query, querySubscriptions);
        }
    }
}
