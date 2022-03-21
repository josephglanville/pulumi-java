// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.DynamicGroupQueryArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Dynamic group metadata like queries and status.
 * 
 */
public final class DynamicGroupMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final DynamicGroupMetadataArgs Empty = new DynamicGroupMetadataArgs();

    /**
     * Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
     */
    @Import(name="queries")
      private final @Nullable Output<List<DynamicGroupQueryArgs>> queries;

    public Output<List<DynamicGroupQueryArgs>> getQueries() {
        return this.queries == null ? Output.empty() : this.queries;
    }

    public DynamicGroupMetadataArgs(@Nullable Output<List<DynamicGroupQueryArgs>> queries) {
        this.queries = queries;
    }

    private DynamicGroupMetadataArgs() {
        this.queries = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DynamicGroupQueryArgs>> queries;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queries = defaults.queries;
        }

        public Builder queries(@Nullable Output<List<DynamicGroupQueryArgs>> queries) {
            this.queries = queries;
            return this;
        }
        public Builder queries(@Nullable List<DynamicGroupQueryArgs> queries) {
            this.queries = Output.ofNullable(queries);
            return this;
        }
        public Builder queries(DynamicGroupQueryArgs... queries) {
            return queries(List.of(queries));
        }        public DynamicGroupMetadataArgs build() {
            return new DynamicGroupMetadataArgs(queries);
        }
    }
}
