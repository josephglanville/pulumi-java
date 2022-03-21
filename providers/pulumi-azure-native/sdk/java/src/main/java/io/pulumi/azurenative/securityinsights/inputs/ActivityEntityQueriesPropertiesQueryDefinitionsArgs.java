// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Activity query definitions
 * 
 */
public final class ActivityEntityQueriesPropertiesQueryDefinitionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivityEntityQueriesPropertiesQueryDefinitionsArgs Empty = new ActivityEntityQueriesPropertiesQueryDefinitionsArgs();

    /**
     * The Activity query to run on a given entity
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    public ActivityEntityQueriesPropertiesQueryDefinitionsArgs(@Nullable Output<String> query) {
        this.query = query;
    }

    private ActivityEntityQueriesPropertiesQueryDefinitionsArgs() {
        this.query = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityEntityQueriesPropertiesQueryDefinitionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> query;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityEntityQueriesPropertiesQueryDefinitionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
        }

        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Output.ofNullable(query);
            return this;
        }        public ActivityEntityQueriesPropertiesQueryDefinitionsArgs build() {
            return new ActivityEntityQueriesPropertiesQueryDefinitionsArgs(query);
        }
    }
}
