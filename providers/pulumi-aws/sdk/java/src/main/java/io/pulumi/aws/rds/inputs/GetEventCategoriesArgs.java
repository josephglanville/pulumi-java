// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventCategoriesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventCategoriesArgs Empty = new GetEventCategoriesArgs();

    /**
     * The type of source that will be generating the events. Valid options are db-instance, db-security-group, db-parameter-group, db-snapshot, db-cluster or db-cluster-snapshot.
     * 
     */
    @Import(name="sourceType")
      private final @Nullable String sourceType;

    public Optional<String> getSourceType() {
        return this.sourceType == null ? Optional.empty() : Optional.ofNullable(this.sourceType);
    }

    public GetEventCategoriesArgs(@Nullable String sourceType) {
        this.sourceType = sourceType;
    }

    private GetEventCategoriesArgs() {
        this.sourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventCategoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventCategoriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceType = defaults.sourceType;
        }

        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }        public GetEventCategoriesArgs build() {
            return new GetEventCategoriesArgs(sourceType);
        }
    }
}
