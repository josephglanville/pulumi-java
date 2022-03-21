// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.configuration.inputs.StoredQueryTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StoredQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final StoredQueryArgs Empty = new StoredQueryArgs();

    @Import(name="queryDescription")
      private final @Nullable Output<String> queryDescription;

    public Output<String> getQueryDescription() {
        return this.queryDescription == null ? Output.empty() : this.queryDescription;
    }

    @Import(name="queryExpression", required=true)
      private final Output<String> queryExpression;

    public Output<String> getQueryExpression() {
        return this.queryExpression;
    }

    @Import(name="queryName", required=true)
      private final Output<String> queryName;

    public Output<String> getQueryName() {
        return this.queryName;
    }

    /**
     * The tags for the stored query.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<StoredQueryTagArgs>> tags;

    public Output<List<StoredQueryTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public StoredQueryArgs(
        @Nullable Output<String> queryDescription,
        Output<String> queryExpression,
        Output<String> queryName,
        @Nullable Output<List<StoredQueryTagArgs>> tags) {
        this.queryDescription = queryDescription;
        this.queryExpression = Objects.requireNonNull(queryExpression, "expected parameter 'queryExpression' to be non-null");
        this.queryName = Objects.requireNonNull(queryName, "expected parameter 'queryName' to be non-null");
        this.tags = tags;
    }

    private StoredQueryArgs() {
        this.queryDescription = Output.empty();
        this.queryExpression = Output.empty();
        this.queryName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoredQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> queryDescription;
        private Output<String> queryExpression;
        private Output<String> queryName;
        private @Nullable Output<List<StoredQueryTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StoredQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryDescription = defaults.queryDescription;
    	      this.queryExpression = defaults.queryExpression;
    	      this.queryName = defaults.queryName;
    	      this.tags = defaults.tags;
        }

        public Builder queryDescription(@Nullable Output<String> queryDescription) {
            this.queryDescription = queryDescription;
            return this;
        }
        public Builder queryDescription(@Nullable String queryDescription) {
            this.queryDescription = Output.ofNullable(queryDescription);
            return this;
        }
        public Builder queryExpression(Output<String> queryExpression) {
            this.queryExpression = Objects.requireNonNull(queryExpression);
            return this;
        }
        public Builder queryExpression(String queryExpression) {
            this.queryExpression = Output.of(Objects.requireNonNull(queryExpression));
            return this;
        }
        public Builder queryName(Output<String> queryName) {
            this.queryName = Objects.requireNonNull(queryName);
            return this;
        }
        public Builder queryName(String queryName) {
            this.queryName = Output.of(Objects.requireNonNull(queryName));
            return this;
        }
        public Builder tags(@Nullable Output<List<StoredQueryTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<StoredQueryTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(StoredQueryTagArgs... tags) {
            return tags(List.of(tags));
        }        public StoredQueryArgs build() {
            return new StoredQueryArgs(queryDescription, queryExpression, queryName, tags);
        }
    }
}
